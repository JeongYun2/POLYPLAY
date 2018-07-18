package com.polyplay.pp.service;

import java.util.ArrayList;

import com.polyplay.pp.domain.ReviewVo;
import com.polyplay.pp.domain.WishListVo;

public interface ReviewService {

	public ReviewVo selectMyReview(int midx, int cidx); 
	
	public ArrayList<ReviewVo> selectLikeReview();
	
	public int deleteMyReview(ReviewVo rv);
	
	public int updateLikePlus(ReviewVo rv);
	
	public int updateLikeMinus(ReviewVo rv);
	
	public int insertReview(ReviewVo rv);
	
}
