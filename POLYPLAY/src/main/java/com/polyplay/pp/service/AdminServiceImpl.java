package com.polyplay.pp.service;

import java.util.ArrayList;

import com.polyplay.pp.domain.AdReviewListVo;
import com.polyplay.pp.domain.BoardVo;
import com.polyplay.pp.domain.ContentsVo;
import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.domain.OrderPayVo;
import com.polyplay.pp.domain.OrderVo;
import com.polyplay.pp.domain.PayVo;
import com.polyplay.pp.domain.ReviewVo;
import com.polyplay.pp.domain.SearchCriteria;

public class AdminServiceImpl implements AdminService {

	@Override
	public ArrayList<MemberVo> selectAdMember(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateAuthMember(MemberVo mv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<ContentsVo> selectAdContents(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertContents(ContentsVo cv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateContents(ContentsVo cv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteContents(ContentsVo cv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<OrderPayVo> selectAdOrder(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAdOrder(OrderVo ov) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAdPay(PayVo pv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<AdReviewListVo> selectAdReview(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAdReview(ReviewVo rv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<BoardVo> selectAdBoard(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVo selectAdBoardContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAdBoard(BoardVo bv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertAdBoard(BoardVo bv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int adReplyBoard(BoardVo bv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAdBoard(BoardVo bv) {
		// TODO Auto-generated method stub
		return 0;
	}

}
