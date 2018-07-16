package com.polyplay.pp.service;

import java.util.ArrayList;

import com.polyplay.pp.domain.ContentsVo;
import com.polyplay.pp.domain.GenreVo;
import com.polyplay.pp.domain.SearchCriteria;
import com.polyplay.pp.domain.WishListVo;


public interface ContentsService {

	public ArrayList<GenreVo> selectGenreList(); 
	
	public ArrayList<ContentsVo> selectSearchList(SearchCriteria scri); 
	
	public ArrayList<ContentsVo> selectContentsInfo(); 
	
	public int insertBasket(WishListVo wv);
	
	public ArrayList<WishListVo> selectBasketCheck(); 
	
	public ArrayList<ContentsVo> selectlSimilarList();
	
	public int updateViewCnt(ContentsVo cv);
	
	public ArrayList<ContentsVo> selectPreVideo(); 
	
}
