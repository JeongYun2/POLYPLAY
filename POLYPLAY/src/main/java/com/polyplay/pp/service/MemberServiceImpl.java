package com.polyplay.pp.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.persistence.MemberService_Mapper;

@Service("memberServiceImpl")
public class MemberServiceImpl implements MemberService {

	@Autowired
	SqlSession sqlSession;
	
	
	
	@Override
	public int selectLogin(MemberVo mvo) {
		
		MemberService_Mapper msm = sqlSession.getMapper(MemberService_Mapper.class);
		int midx = msm.selectLogin(mvo);
		
		return midx;
	}

	@Override
	public int selectIdCheck(String userID) {

		MemberService_Mapper msm = sqlSession.getMapper(MemberService_Mapper.class);
		int cnt = msm.selectIdCheck(userID);
		System.out.println("impl 아이디 개수 "+cnt);
		
		return cnt;
	}


	@Override
	public int selectNicknameCheck(String mNickname) {

		MemberService_Mapper msm = sqlSession.getMapper(MemberService_Mapper.class);
		int cnt = msm.selectNicknameCheck(mNickname);
		
		return cnt;
	}


	@Override
	public int selectEmailCheck(String mEmail) {
		
		MemberService_Mapper msm = sqlSession.getMapper(MemberService_Mapper.class);
		int cnt = msm.selectEmailCheck(mEmail);
		
		return cnt;
	}

	@Override
	public int insertMember(MemberVo mvo) {
		
		MemberService_Mapper msm = sqlSession.getMapper(MemberService_Mapper.class);
		int res = msm.insertMember(mvo);
		
		return res;
	}



}
