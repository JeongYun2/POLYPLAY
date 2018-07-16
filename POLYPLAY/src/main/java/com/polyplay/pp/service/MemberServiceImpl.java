package com.polyplay.pp.service;

import com.polyplay.pp.domain.MemberVo;

public class MemberServiceImpl implements MemberService {

	@Override
	public MemberVo selectLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delKeepLogin(String msessionid, String sessionLimit, int midx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVo selectAutoLogin(String sessionkey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo updateAutoLogin(String sessionkey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo selectIdCheck(String mId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo selectNicknameCheck(String mNickname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo selectEmailCheck(String mEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMember(MemberVo mv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVo selectIdFind(String mName, String mEmail, String mDel_yn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo selectPwFind(int mId, String mEmail, String mPhone, String mDel_yn) {
		// TODO Auto-generated method stub
		return null;
	}

}
