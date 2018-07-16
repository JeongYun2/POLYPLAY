package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	//delKeepLogin , selectAutoLogin , updateAutoLogin은 로그인인터셉터에서
	
	@RequestMapping(value="/MemberLogin")
	public String memberLoginController() {
		
		//selectLogin
		
		return "";
	}
	
	@RequestMapping(value="/MemberJoin")
	public String memberJoinController() {
		
		//
		
		return "";
	}
	
	
	@RequestMapping(value="/MemberIdCheck")
	public String memberIdCheckController() {
		
		//selectIdCheck
		
		return "";
	}
	
	@RequestMapping(value="/MemberNickCheck")
	public String memberNickCheckController() {
		
		//selectNicknameCheck
		
		return "";
	}
	
	@RequestMapping(value="/MemberEmailCheck")
	public String memberEmailCheckController() {
		
		//selectEmailCheck
		
		return "";
	}
	
	
	
	
	@RequestMapping(value="/MemberJoinAction")
	public String memberJoinActionController() {
		
		//insertMember
		
		return "";
	}
	
	
	
	@RequestMapping(value="/MemberIdFind")
	public String memberIdFindController() {
		
		//selectIdFind
		
		return "";
	}
	
	
	@RequestMapping(value="/MemberPwFind")
	public String memberPwFindController() {
		
		//selectPwFind
		
		return "";
	}
}
