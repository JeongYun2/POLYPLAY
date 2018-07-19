package com.polyplay.pp.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.polyplay.pp.domain.BoardVo;



public interface BoardService {

	
	public ArrayList<BoardVo> selectNoticeList(); 
	
	public BoardVo selectNoticeContent(int bidx);
	
	public ArrayList<BoardVo> selectFAQList(); 
	
	public ArrayList<BoardVo> selectFAQContent();
	
	public ArrayList<BoardVo> selectInquiryList();
	
	public BoardVo selectInquiryContent(int bidx);
	 
	public int insertInquiry(String bSubcate,String bWriter,String bSubject, String bContent,  String bIp);
	
	public int updateInquiry(String bSubcate,String bSubject, String bContent, String bIp, int bidx);
	
	public int deleteInquiry(String bIp, int bidx);
	
}
