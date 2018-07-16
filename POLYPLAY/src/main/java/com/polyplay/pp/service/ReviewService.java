package com.polyplay.pp.service;

import java.util.ArrayList;

import com.polyplay.pp.domain.ReviewVo;
import com.polyplay.pp.domain.WishListVo;

public interface ReviewService {

	public ArrayList<ReviewVo> selectMyReview(); 
	
	public int deleteMyReview(ReviewVo wv);
	
	public ArrayList<ReviewVo> selectLikeReview();
	
	public int updateLikePlus(ReviewVo wv);
	
	public int updateLikeMinus(ReviewVo wv);
	
	public int insertReview(ReviewVo wv);
	
}
