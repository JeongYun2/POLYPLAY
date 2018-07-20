package com.polyplay.pp.controller;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.service.MemberService;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired(required=false)
	MemberService ms;
	
	

	@RequestMapping(value="/MemberLogin")
	public String memberLoginController() {
		
		logger.info("/MemberLogin로 들어 왔습니다.");
		
		return "/views/member/memberLogin";
	}
	
	@RequestMapping(value="/MemberLoginAction", method= RequestMethod.POST)
	public String memberLoginActionController(MemberVo mvo, Model model, HttpSession session,
			@RequestParam(name="useCookie",required=false) String useCookie ) {
		
		logger.info("/MemberLoginAction로 들어 왔습니다.");
		logger.info("회원님의 아이디: "+mvo.getmId()+", 비밀번호: "+mvo.getmPassword()+", useCookie: "+useCookie);
		
		// 이동할 페이지
		String page;
		
		MemberVo loginMvo = ms.selectLogin(mvo);
		logger.info("loginMvo값은 "+loginMvo);
		
		System.out.println("loginMvo: "+loginMvo);
		if(loginMvo != null){			// 로그인 성공
			
			System.out.println("useCookie: "+useCookie);
			if (useCookie != null) {		// 자동 로그인 체크
				
				model.addAttribute("login", loginMvo);
				
				Calendar cal = Calendar.getInstance();
			    cal.setTime(new Date());
			    cal.add(Calendar.DATE, 14);
			    DateFormat df = new SimpleDateFormat("yy-MM-dd");   
			    String sessionLimit = df.format(cal.getTime());
			    
			    loginMvo.setmSessionId(session.getId());
			    loginMvo.setmSessionLimit(sessionLimit);
			    int updateAuto_res = ms.updateAutoLogin(loginMvo);
			    
			    System.out.println("자동로그인 체크 DB확인:"+updateAuto_res);
			}

			page = "redirect:/GoToHome";
			
		}else {					// 로그인 실패
			page = "redirect:/views/member/memberLogin";
		}
		
		return page;
	}
	
	@RequestMapping(value="/MemberLogout")
	public String memberLogoutController(HttpServletRequest request,HttpServletResponse response, HttpSession session) {	
		
//		세션에 담은 midx값을 가져온다.
		Object login = session.getAttribute("login");
		
//		로그인을 하지 않았으면 메인 페이지로 보낸다.
		if(login != null) {
			
			MemberVo mvo = (MemberVo) login;
			session.removeAttribute("login");
			session.invalidate();
			
//			HTTP request에서 loginCookie라는 쿠키를 가져온다.
			Cookie loginCookie = WebUtils.getCookie(request, "loginCookie");
			System.out.println("/MemberLogout의 loginCookie: "+loginCookie);
			if(loginCookie != null){
				//쿠키 유효기간을 0으로 설정 후 반환 한다.
				loginCookie.setPath("/");		
				loginCookie.setMaxAge(0);				 
				response.addCookie(loginCookie);
				
				mvo.setmSessionId("");
				mvo.setmSessionLimit("");
				ms.updateAutoLogin(mvo);
			}
		}
		
		return "redirect:/GoToHome";
	}
	
	@RequestMapping(value="/MemberJoin")
	public String memberJoinController() {
		
		logger.info("/MemberJoin로 들어 왔습니다.");
		
		return "/views/member/memberJoin";
	}
	
	@RequestMapping(value="/MemberIdCheck", method=RequestMethod.POST)
	public @ResponseBody int memberIdCheckController(@RequestBody String userID) {
		
		logger.info("/MemberIdCheck/"+userID+"로 들어 왔습니다.");
		int cnt = ms.selectIdCheck(userID);
		System.out.println("로우 넘"+cnt);
		
		return cnt;
	}
	
	@RequestMapping(value="/MemberNickCheck", method=RequestMethod.POST)
	public @ResponseBody int memberNickCheckController(@RequestBody String userNick) {
		
		logger.info("/MemberNickCheck/"+userNick+"로 들어 왔습니다.");
		int cnt = ms.selectNicknameCheck(userNick);
		System.out.println("로우 넘"+cnt);
		
		return cnt;
	}
	
	@RequestMapping(value="/MemberJoinAction", method=RequestMethod.POST, produces = "application/text; charset=utf8")
	public String memberJoinActionController(MemberVo mvo,
			HttpServletRequest request) throws UnsupportedEncodingException {
        
		// 사용자 아이피를 가져온다.
		String userIP = request.getRemoteAddr();
		mvo.setmIp(userIP);
		
		logger.info("/MemberJoinAction로 들어 왔습니다.");
		logger.info("회원님의 아이디: "+mvo.getmId()
						+", 비밀번호: "+mvo.getmPassword()
						+", 이메일: "+mvo.getmEmail()
						+", 전화번호: "+mvo.getmPhone()
						+", 이름: "+mvo.getmName()
						+", 닉네임: "+mvo.getmNickname()
						+", 아이피: "+mvo.getmIp());
		
		
		int res = ms.insertMember(mvo);
		System.out.println("res: "+res);
		
		String page = null;
		
		if(res == 1){
			page = "redirect:/GoToHome";
		} else {
			page = "redirect:/MemberJoin";
		}
		
		return page;
	}
	
	
	@RequestMapping(value="/MemberIdFind")
	public String memberIdFindController() {
		
		return "/views/member/memberIdFind";
	}
	
	@RequestMapping(value="/MemberIdFindAction", method=RequestMethod.POST)
	public @ResponseBody String memberIdFindActionController(MemberVo mvo,HttpServletRequest request) {
		
		logger.info("이름: "+mvo.getmName()+", 이메일: "+mvo.getmEmail());
		String mId = ms.selectIdFind(mvo);
		
		return mId;
	}
	
	
	@RequestMapping(value="/MemberPwFind")
	public String memberPwFindController() {
		
		return "/views/member/memberPwFind";
	}
	
	@RequestMapping(value="/MemberPwFindAction", method=RequestMethod.POST)
	public @ResponseBody String memberPwFindActionController(MemberVo mvo, HttpSession session) {
		
		logger.info("아이디: "+mvo.getmId()+", 이메일: "+mvo.getmEmail()+", 전화번호"+mvo.getmPhone());
		MemberVo mvo_Res = (MemberVo)session.getAttribute("login");
		mvo.setMidx(mvo_Res.getMidx());
		String Pw = ms.selectPwFind(mvo);
		
		return Pw;
	}
	
	@RequestMapping(value="/MemberModify")
	public String memberModifyController(HttpSession session,Model model) {
		
		//login세션에서 midx값 갔고 오기
		MemberVo mvo = (MemberVo)session.getAttribute("login");
		MemberVo mvo_res = ms.selectMyMember(mvo.getMidx());
		model.addAttribute("mvo",mvo_res);
		logger.info("mvo 값: "+mvo_res);
		
		return "/views/member/memberModify";
	}
	
	@RequestMapping(value="/MemberModifyAction", method=RequestMethod.POST)
	public String memberModifyActionController(MemberVo mvo, HttpSession session) {
		
		System.out.println(mvo);
		System.out.println(session.getAttribute("login"));
		MemberVo loginMvo = (MemberVo)session.getAttribute("login");
		mvo.setMidx(loginMvo.getMidx());
		System.out.println(mvo.getmId()+", "+mvo.getmNewPassword()+", ");
		
		logger.info("midx: "+mvo.getMidx()+", mPassword: "+mvo.getmPassword());
		
		String page = null;
		int res = ms.updateMember(mvo);
		
		if(res >= 1) {
			page = "redirect:/MemberModify";
		} else {
			page ="redirect:/GoToHome";
		}
		
		return page;
	}
	
	@RequestMapping(value="/MemberDelete")
	public String memberDeleteController() {
		
		return "/views/member/memberDelete";
	}
	
	@RequestMapping(value="/MemberDeleteAction", method=RequestMethod.POST)
	public String memberDeleteActionController(MemberVo mvo, HttpSession session) {
		
		int midx = (Integer)session.getAttribute("login");
		mvo.setMidx(midx);
		
		logger.info("비밀번호: "+mvo.getmPassword()+", midx:"+mvo.getMidx());
		
		String page = null;
		int res = ms.deleteMember(mvo);
		
		logger.info("deleteMember: "+res);
		
		if(res == 1) {
			page = "redirect:/GoToHome";
		} else {
			page ="redirect:/MemberDelete";
		}
		
		return page;
	}
	/*
	@RequestMapping(value="/adminMember")
	public String adminMemberController(Model model) {
		
		
		
		return "/views/member/adminMember";
	}
	

	@RequestMapping(value="/adminMember")
	public String adminMemberController() {
		
		
		
		return "/views/member/adminMember";
	}*/
}
