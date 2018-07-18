package com.polyplay.pp.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polyplay.pp.domain.ContentsVo;
import com.polyplay.pp.domain.SearchCriteria;
import com.polyplay.pp.persistence.ContentsService_Mapper;


@Service("ContentsServiceImpl")
public class ContentsServiceImpl  implements ContentsService{

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public ArrayList<ContentsVo> selectGenreList(int gidx) {
		
		ContentsService_Mapper csm = sqlSession.getMapper(ContentsService_Mapper.class);
		ArrayList<ContentsVo> alist = csm.selectGenreList(gidx);
		return alist;
	}

	@Override
	public ArrayList<ContentsVo> selectSearchList(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ContentsVo> selectContentsInfo(int cidx) {
		
		ContentsService_Mapper csm = sqlSession.getMapper(ContentsService_Mapper.class);
		ArrayList<ContentsVo> alist = csm.selectContentsInfo(cidx);
		
		return alist;
	}

	@Override
	public ArrayList<ContentsVo> selectlSimilarList(int gidx) {
		
		ContentsService_Mapper csm = sqlSession.getMapper(ContentsService_Mapper.class);
		ArrayList<ContentsVo> alist = csm.selectlSimilarList(gidx);
		
		return alist;
	}

	@Override
	public int playVideo(ContentsVo cv) {
		// TODO Auto-generated method stub
		return 0;
	}

}
