package com.polyplay.pp.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	public String selectIdFind(MemberVo mvo) {
		
		MemberService_Mapper msm = sqlSession.getMapper(MemberService_Mapper.class);
		String mId = msm.selectIdFind(mvo);
		
		return mId;
	}

	@Override
	public String selectPwFind(MemberVo mvo) {

		MemberService_Mapper msm = sqlSession.getMapper(MemberService_Mapper.class);
		String mPw = msm.selectPwFind(mvo);
		
		return mPw;
	}

	@Override
	public MemberVo selectMyMember(int midx) {

		MemberService_Mapper msm = sqlSession.getMapper(MemberService_Mapper.class);
		MemberVo mvo = msm.selectMyMember(midx);
		
		return mvo;
	}

	@Transactional
	@Override
	public int memberModiDel(MemberVo mvo, String modiDel) {
		
		MemberService_Mapper msm = sqlSession.getMapper(MemberService_Mapper.class);
		int res = msm.selectPwConfirm(mvo);
		
		if(res >= 1){
			if(modiDel == "modi"){
				
				msm.updateMember(mvo);
				
			} else if(modiDel == "del") {
				
				msm.deleteMember(mvo.getMidx());
				
			}
		}
		
		return res;
	}



}
