package com.polyplay.pp.service;

import com.polyplay.pp.domain.MemberVo;

public interface MemberService {

	public MemberVo selectLogin();
	
	public int delKeepLogin(String msessionid, String sessionLimit, int midx);
	
	public MemberVo selectAutoLogin(String sessionkey);
	
	public MemberVo updateAutoLogin(String sessionkey);
	
	public MemberVo selectIdCheck(String mId);
	
	public MemberVo selectNicknameCheck(String mNickname);
	
	public MemberVo selectEmailCheck(String mEmail);
	
	public int insertMember(MemberVo mv);
	
	public MemberVo selectIdFind(String mName, String mEmail, String mDel_yn);
	
	public MemberVo selectPwFind(int mId, String mEmail, String mPhone, String mDel_yn);
}
