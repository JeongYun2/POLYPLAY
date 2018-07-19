package com.polyplay.pp.persistence;

import java.util.ArrayList;
import java.util.HashMap;

import com.polyplay.pp.domain.BoardVo;

public interface BoardService_Mapper {
	
		public ArrayList<BoardVo> selectNoticeList();
		
		public BoardVo selectNoticeContent(int bidx);
		
		public ArrayList<BoardVo> selectFAQList(); 
		
		public ArrayList<BoardVo> selectFAQContent();
		
		public ArrayList<BoardVo> selectInquiryList();
		
		public BoardVo selectInquiryContent(int bidx);
		
		public int insertInquiry(HashMap<String,Object> map);
		
		public int updateInquiry(HashMap<String,Object> map);

		public int deleteInquiry(HashMap<String,Object> map);
}