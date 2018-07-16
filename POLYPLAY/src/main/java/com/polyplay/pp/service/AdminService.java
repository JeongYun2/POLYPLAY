package com.polyplay.pp.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.polyplay.pp.domain.BoardVo;
import com.polyplay.pp.domain.ContentsVo;
import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.domain.OrderPayVo;
import com.polyplay.pp.domain.OrderVo;
import com.polyplay.pp.domain.PayVo;
import com.polyplay.pp.domain.ReviewVo;
import com.polyplay.pp.domain.SearchCriteria;

public interface AdminService {

	public ArrayList<MemberVo> selectAdMember(SearchCriteria scri); 
	
	public int updateAuthMember(MemberVo mv);
	
	public ArrayList<ContentsVo> selectAdContents(SearchCriteria scri); 
	
	public int insertContents(ContentsVo cv);
	
	public int updateContents(ContentsVo cv);
	
	public int deleteContents(ContentsVo cv);
	
	public ArrayList<OrderPayVo> selectAdOrder(SearchCriteria scri);
	
	public int deleteAdOrder(OrderVo ov);
	
	public int updateAdPay(PayVo pv);
	
	public ArrayList<ReviewVo> selectAdReview(SearchCriteria scri); 
	
	public int deleteAdReview(ReviewVo rv);
	
	public ArrayList<BoardVo> selectAdBoard(SearchCriteria scri); 
	
	public BoardVo selectAdBoardContent();
	
	public int deleteAdBoard(BoardVo bv);
	
	public int insertAdBoard(BoardVo bv);
	
	public int adReplyBoard(BoardVo bv);
	
	public int updateAdBoard(BoardVo bv);
	
	
	
	
}
