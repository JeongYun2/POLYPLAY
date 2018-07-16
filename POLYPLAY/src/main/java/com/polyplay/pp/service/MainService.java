package com.polyplay.pp.service;

import java.util.ArrayList;


import com.polyplay.pp.domain.ContentsOrderPayVo;
import com.polyplay.pp.domain.ContentsReviewVo;
import com.polyplay.pp.domain.ContentsVo;



public interface MainService {

	public ArrayList<ContentsVo> selectRecentList(); 
	
	public ArrayList<ContentsVo> selectViewCntList();
	
	public ArrayList<ContentsReviewVo> selectStarPointList();
	
	public ArrayList<ContentsOrderPayVo> selectSalesList();
	
	
}
