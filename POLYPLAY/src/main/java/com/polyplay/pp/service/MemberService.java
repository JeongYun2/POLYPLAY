package com.polyplay.pp.service;

import com.polyplay.pp.domain.MemberVo;

public interface MemberService {

	public int selectLogin(MemberVo mvo);
	
	
	
	public int selectIdCheck(String mId);
	
	public int selectNicknameCheck(String mNickname);
	
	public int selectEmailCheck(String mEmail);
	
	public int insertMember(MemberVo mvo);
	
}
