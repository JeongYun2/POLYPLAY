package com.polyplay.pp.persistence;

import java.util.ArrayList;

import com.polyplay.pp.domain.ReviewVo;

public interface ReviewService_Mapper {

	public ReviewVo selectMyReview(int midx, int cidx);
	
	public ArrayList<ReviewVo> selectReviewList();
	
	public int deleteMyReview(ReviewVo rv);
	
	public int updateLikePlus(ReviewVo rv);
	
	public int updateLikeMinus(ReviewVo rv);
	
	public int insertReview(ReviewVo rv); 
	
	
}
