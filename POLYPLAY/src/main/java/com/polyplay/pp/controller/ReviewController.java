package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
	

	
	@RequestMapping(value="/ReviewList")
	public String reviewListController() {
		
		//selectMyReview	
		//selectLikeReview
	
		return "";
	}
	
	@RequestMapping(value="/ReviewDelete")
	public String reviewDeleteController() {
		
		
		//deleteMyReview
	
		
		
		return "";
	}
	@RequestMapping(value="/ReviewLikePlus")
	public String reviewLikePlusController() {
		
		
		//updateLikePlus
	
				
		return "";
	}
	
	@RequestMapping(value="/ReviewLikeMinus")
	public String reviewLikeMinusController() {
		
		
		//updateLikeMinus	
		
		return "";
	}
	
			
	
	@RequestMapping(value="/ReviewWrite")
	public String reviewWriteController() {
		
		// 
		
		return "";
	}
	
	@RequestMapping(value="/ReviewWriteAction")
	public String reviewWriteActionController() {
		
		//insertReview
		
		return "";
	}

}
