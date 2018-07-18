package com.polyplay.pp.persistence;

import com.polyplay.pp.domain.SearchCriteria;

import java.util.ArrayList;

import com.polyplay.pp.domain.ContentsVo;

public interface ContentsService_Mapper {

	public ArrayList<ContentsVo> selectGenreList(int gidx);
	
	public ContentsVo selectSearchList(SearchCriteria scri);
	
	public ArrayList<ContentsVo> selectlSimilarList(int gidx);
	
	public ArrayList<ContentsVo> selectContentsInfo(int cidx); 
	
	public int updateViewCnt(ContentsVo cv);
	
	public ContentsVo selectPreVideo();
	
	
	
	
	

	
}
