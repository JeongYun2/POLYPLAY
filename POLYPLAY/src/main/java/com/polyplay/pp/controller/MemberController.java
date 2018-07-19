package com.polyplay.pp.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.CharacterCodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.service.MemberService;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired(required=false)	//값을 못찾아도 괜찬
	MemberService ms;		
	//delKeepLogin , selectAutoLogin , updateAutoLogin 인터셉터에서
	
	
	@RequestMapping(value="/MemberLogin")
	public String memberLoginController() {
		
		logger.info("/MemberLogin로 들어 왔습니다.");
		
		return "/views/member/memberLogin";
	}
	
	// ???? get만 됨 post로 변경하면 안됨
	@RequestMapping(value="/MemberLoginAction", method=RequestMethod.GET)
	public String memberLoginActionController(MemberVo mvo) {
		
		logger.info("/MemberLoginAction로 들어 왔습니다.");
		logger.info("회원님의 아이디: "+mvo.getmId()+", 비밀번호: "+mvo.getmPassword());
		
		String page;
		int midx = 0;
		
		midx = ms.selectLogin(mvo);
		logger.info("midx값은 "+midx);
		
		if(midx != 0){			// 로그인 성공
			page = "/index";
		}else {					// 로그인 실패
			page = "/views/member/memberLogin";
		}
		
		return page;
	}
	
	@RequestMapping(value="/MemberJoin")
	public String memberJoinController() {
		
		logger.info("/MemberJoin로 들어 왔습니다.");
		
		return "/views/member/memberJoin";
	}
	
	@RequestMapping(value="/MemberIdCheck/{userID}", method=RequestMethod.POST)
	public @ResponseBody int memberIdCheckController(@PathVariable("userID") String userID) {
		
		logger.info("/MemberIdCheck/"+userID+"로 들어 왔습니다.");
		int cnt = ms.selectIdCheck(userID);
		System.out.println("로우 넘"+cnt);
		
		return cnt;
	}
	
	
	@RequestMapping(value="/MemberNickCheck/{userNick}", method=RequestMethod.POST)
	public @ResponseBody int memberNickCheckController(@PathVariable("userNick") String userNick) {
		
		logger.info("/MemberNickCheck/"+userNick+"로 들어 왔습니다.");
		int cnt = ms.selectNicknameCheck(userNick);
		System.out.println("로우 넘"+cnt);
		
		return cnt;
	}
	
	// 이름, 닉네임 한글입력이 깨짐, org.springframework.web.servlet.PageNotFound - Request method 'GET' not supported
	@RequestMapping(value="/MemberJoinAction", method=RequestMethod.GET, produces = "application/text; charset=utf8")
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
		String page;
		
		if(res == 1){
			page = "/index";
		} else {
			page = "/views/member/memberJoin";
		}
		
		return page;
	}
	
	
	@RequestMapping(value="/MemberIdFind")
	public String memberIdFindController() {
		
		return "/views/member/memberIdFind";
	}
	
	// 입력값이 잘 들어 왔는데 0개 로 나옴
	// 이름이 한글이여서 깨짐
	@RequestMapping(value="/MemberIdFindAction", method=RequestMethod.GET)
	public @ResponseBody String memberIdFindActionController(MemberVo mvo,HttpServletRequest request) {
		
		String mName = request.getParameter("mName");
		String mEmail = request.getParameter("mEmail");
		logger.info(mName+", "+mEmail);
		
		
		logger.info("이름: "+mvo.getmName()+", 이메일: "+mvo.getmEmail());
		String mId = ms.selectIdFind(mvo);
		
		return mId;
	}
	
	
	@RequestMapping(value="/MemberPwFind")
	public String memberPwFindController() {
		
		return "/views/member/memberPwFind";
	}
	
	@RequestMapping(value="/MemberPwFindAction", method=RequestMethod.GET)
	public @ResponseBody String memberPwFindActionController(MemberVo mvo) {
		
		logger.info("아이디: "+mvo.getmId()+", 이메일: "+mvo.getmEmail()+", 전화번호"+mvo.getmPhone());
		String Pw = ms.selectPwFind(mvo);
		
		return Pw;
	}
	
	@RequestMapping(value="/MemberModify")
	public String memberModifyController(HttpSession session,Model model) {
		
		//sMidx세션에서 midx값 갔고 오기
//		int midx = (Integer)session.getAttribute("sMidx");
		MemberVo mvo = ms.selectMyMember(3);
		model.addAttribute("mvo", mvo);
		logger.info("fdf"+mvo);
		
		return "/views/member/memberModify";
	}
	
	@RequestMapping(value="/MemberModifyAction")
	public String memberModifyActionController(MemberVo mvo,
			@RequestParam("modiDel") String modiDel) {
		
		String page = null;
		int res = ms.memberModiDel(mvo,modiDel);
		
		if(res >= 1){
			if(modiDel == "modi"){
				
				page="/MemberModify";
			} else if(modiDel == "del") {
				
				page="/index";
			}
		} else {
			page="/MemberModify";
		}
		
		return page;
	}
}
