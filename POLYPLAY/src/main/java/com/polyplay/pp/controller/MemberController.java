package com.polyplay.pp.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.CharacterCodingException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.service.MemberService;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired(required=false)	//값을 못찾아도 괜찬
	MemberService ms;		
	//delKeepLogin , selectAutoLogin , updateAutoLogin�� �α������ͼ��Ϳ���
	
	
	@RequestMapping(value="/MemberLogin")
	public String memberLoginController() {
		
		logger.info("/MemberLogin로 들어 왔습니다.");
		
		return "/views/member/memberLogin";
	}
	
	@RequestMapping(value="/MemberLoginAction", method=RequestMethod.GET)
	public String memberLoginActionController(MemberVo mvo, Model model) {
		
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
	
	@RequestMapping(value="/MemberJoinAction", produces = "application/text; charset=utf8")
	public String memberJoinActionController(MemberVo mvo,
			HttpServletRequest request) throws UnsupportedEncodingException {

		logger.info("이름: "+mvo.getmName());
		logger.info("닉네임: "+mvo.getmNickname());
		
		String name1 = new String(mvo.getmName().getBytes("UTF-8"),"EUC-KR");
		mvo.setmName(name1);
		
		/*
		String name1 = URLDecoder.decode(mvo.getmName(), "EUC-KR");
		mvo.setmName(name1); 
		String nick1 = URLDecoder.decode(mvo.getmNickname(), "UTF-8");
		mvo.setmName(nick1);*/
		
		logger.info("이름: "+mvo.getmName());
		logger.info("닉네임: "+mvo.getmNickname());
        
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
		
		if(res != 0){
			
		}
		
		return "/index";
	}
	
	
	@RequestMapping(value="/MemberIdFind")
	public @ResponseBody String memberIdFindController() {
		
		return "/views/member/memberIdFind";
	}
	
	@RequestMapping(value="/MemberIdFindAction")
	public String memberIdFindActionController() {
		
		return "";
	}
	
	
	@RequestMapping(value="/MemberPwFind")
	public String memberPwFindController() {
		
		//selectPwFind
		
		return "";
	}
}
