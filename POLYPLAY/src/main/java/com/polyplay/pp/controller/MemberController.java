package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	//delKeepLogin , selectAutoLogin , updateAutoLogin은 로그인인터셉터에서
	
	@RequestMapping(value="/MemberLogin")
	public String MemberLoginController() {
		
		//selectLogin
		
		return "";
	}
	
	@RequestMapping(value="/MemberJoin")
	public String MemberJoinController() {
		
		//
		
		return "";
	}
	
	
	@RequestMapping(value="/MemberIdCheck")
	public String MemberIdCheckController() {
		
		//selectIdCheck
		
		return "";
	}
	
	@RequestMapping(value="/MemberNickCheck")
	public String MemberNickCheckController() {
		
		//selectNicknameCheck
		
		return "";
	}
	
	@RequestMapping(value="/MemberEmailCheck")
	public String MemberEmailCheckController() {
		
		//selectEmailCheck
		
		return "";
	}
	
	
	
	
	@RequestMapping(value="/MemberJoinAction")
	public String MemberJoinActionController() {
		
		//insertMember
		
		return "";
	}
	
	
	
	@RequestMapping(value="/MemberIdFind")
	public String MemberIdFindController() {
		
		//selectIdFind
		
		return "";
	}
	
	
	@RequestMapping(value="/MemberPwFind")
	public String MemberPwFindController() {
		
		//selectPwFind
		
		return "";
	}
}
