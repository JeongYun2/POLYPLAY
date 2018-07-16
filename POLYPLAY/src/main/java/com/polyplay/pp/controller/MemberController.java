package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	
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
		
		
		
		return "";
	}
	
	
	@RequestMapping(value="/MemberPwFind")
	public String MemberPwFindController() {
		
		
		
		return "";
	}
}
