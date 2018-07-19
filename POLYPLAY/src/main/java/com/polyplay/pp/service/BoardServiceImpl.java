package com.polyplay.pp.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polyplay.pp.domain.BoardVo;
import com.polyplay.pp.persistence.BoardService_Mapper;


@Service("boardServiceImpl")
public class BoardServiceImpl implements BoardService{

		
		@Autowired
		SqlSession sqlSession;

		public ArrayList<BoardVo> selectNoticeList() {		
			
			ArrayList<BoardVo> alist = null;
			BoardService_Mapper bsm = sqlSession.getMapper(BoardService_Mapper.class);
			alist = bsm.selectNoticeList();			

			return alist;
		
	}

		@Override
		public BoardVo selectNoticeContent(int bidx) {
			BoardVo bvo = null;
			BoardService_Mapper bsm = sqlSession.getMapper(com.polyplay.pp.persistence.BoardService_Mapper.class);
			bvo =bsm.selectNoticeContent(bidx);

			return bvo;
		}
		
		@Override
		public ArrayList<BoardVo> selectFAQList() {

			ArrayList<BoardVo> alist = null;
			BoardService_Mapper bsm = sqlSession.getMapper(BoardService_Mapper.class);
			alist = bsm.selectFAQList();			

			return alist;
		}

		@Override
		public ArrayList<BoardVo> selectFAQContent() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<BoardVo> selectInquiryList() {
			
			ArrayList<BoardVo> alist = null;
			BoardService_Mapper bsm = sqlSession.getMapper(BoardService_Mapper.class);
			alist = bsm.selectInquiryList();		
			
			return alist;
		}


		@Override
		public int insertInquiry(String bSubcate,String bWriter,String bSubject, String bContent,  String bIp){
			
			HashMap<String,Object> map = new HashMap<String,Object>();
			map.put("bSubject", bSubject);
			map.put("bWriter", bWriter);
			map.put("bSubject", bSubject);
			map.put("bContent", bContent);
			map.put("bIp", bIp);
			
				
			
			BoardService_Mapper bsm = sqlSession.getMapper(com.polyplay.pp.persistence.BoardService_Mapper.class);
			int result = bsm.insertInquiry(map);	

			return result;
		}
		
		
		
		
		
		
		
		
		
		@Override
		public BoardVo selectInquiryContent(int bidx) {
			BoardVo bvo = null;
			BoardService_Mapper bsm = sqlSession.getMapper(com.polyplay.pp.persistence.BoardService_Mapper.class);
			bvo =bsm.selectInquiryContent(bidx);

			return bvo;
		}
		
		@Override
		public int deleteInquiry(String bIp, int bidx) {
			
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("bIp", bIp);
			map.put("bidx", bidx);
			
			BoardService_Mapper bsm = sqlSession.getMapper(com.polyplay.pp.persistence.BoardService_Mapper.class);
			int res = bsm.deleteInquiry(map);		
			
			return res;
		}
	
		@Override
		public int updateInquiry(String bSubcate,String bSubject, String bContent, String bIp, int bidx){
			
			HashMap<String,Object> map = new HashMap<String,Object>();
			
			map.put("bSubcate", bSubcate);
			map.put("bSubject", bSubject);
			map.put("bContent", bContent);			
			map.put("bIp", bIp);
			map.put("bidx", bidx);
			
			BoardService_Mapper bsm = sqlSession.getMapper(com.polyplay.pp.persistence.BoardService_Mapper.class);
			int result = bsm.updateInquiry(map);	
			
			return result;
			
		}

}
