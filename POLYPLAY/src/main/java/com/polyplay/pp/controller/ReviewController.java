package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
	

	
	@RequestMapping(value="/ReviewList")
	public String ReviewListController() {
		
		//selectMyReview	
		//selectLikeReview
	
		return "";
	}
	
	@RequestMapping(value="/ReviewDelete")
	public String ReviewDeleteController() {
		
		
		//deleteMyReview
	
		
		
		return "";
	}
	@RequestMapping(value="/ReviewLikePlus")
	public String ReviewLikePlusController() {
		
		
		//updateLikePlus
	
				
		return "";
	}
	
	@RequestMapping(value="/ReviewLikeMinus")
	public String ReviewLikeMinusController() {
		
		
		//updateLikeMinus	
		
		return "";
	}
	
			
	
	@RequestMapping(value="/ReviewWrite")
	public String ReviewWriteController() {
		
		// 
		
		return "";
	}
	
	@RequestMapping(value="/ReviewWriteAction")
	public String ReviewWriteActionController() {
		
		//insertReview
		
		return "";
	}

}
