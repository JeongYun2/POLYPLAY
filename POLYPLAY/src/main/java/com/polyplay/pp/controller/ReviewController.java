package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
	

	
	@RequestMapping(value="/ContentsReviewList")
	public String ContentsReviewListController() {
		
		//selectMyReview	
		//selectLikeReview
	
		return "";
	}
	
	@RequestMapping(value="/ContentsReviewDelete")
	public String ContentsReviewDeleteController() {
		
		
		//deleteMyReview
	
		
		
		return "";
	}
	@RequestMapping(value="/ContentsReviewLikePlus")
	public String ContentsReviewLikePlusController() {
		
		
		//updateLikePlus
	
				
		return "";
	}
	
	@RequestMapping(value="/ContentsReviewLikeMinus")
	public String ContentsReviewLikeMinusController() {
		
		
		//updateLikeMinus	
		
		return "";
	}
	
			
	
	@RequestMapping(value="/ContentsReviewWrite")
	public String ContentsReviewWriteController() {
		
		// 
		
		return "";
	}
	
	@RequestMapping(value="/ContentsReviewWriteAction")
	public String ContentsReviewWriteActionController() {
		
		//insertReview
		
		return "";
	}

}
