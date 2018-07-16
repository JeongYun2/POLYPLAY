package com.polyplay.pp.service;

import java.util.ArrayList;

import com.polyplay.pp.domain.BoardVo;



public interface BoardService {

	
	public ArrayList<BoardVo> selectNoticeList(); 
	
	public ArrayList<BoardVo> selectNoticeContent(); 
	
	public ArrayList<BoardVo> selectFAQList(); 
	
	public ArrayList<BoardVo> selectFAQContent();
	
	public ArrayList<BoardVo> selectInquiryList();
	
	public int insertInquiry(BoardVo bv);
	
	public ArrayList<BoardVo> selectInquiryContent(); 
	
	public int deleteInquiry(BoardVo bv);
	
	public int updateInquiry(BoardVo bv);
	
}
