package com.polyplay.pp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.polyplay.pp.domain.ReviewVo;
import com.polyplay.pp.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired 
	ReviewService rs;
	
	@RequestMapping(value="/ReviewList")
	public String reviewListController(Model model) {
		//selectMyReview	
		//selectLikeReview
		
		ArrayList<ReviewVo> alist = null;
		alist = rs.selectLikeReview();
		
		ReviewVo rv  = null;
		rv = rs.selectMyReview(6,8);
		
		model.addAttribute("rv", rv);
		model.addAttribute("alist", alist);	
		
		return "views/contents/contentsReview";
	}
	
	@RequestMapping(value="/ReviewDelete")
	public String reviewDeleteController(@ModelAttribute("rv") ReviewVo rv) {
		//deleteMyReview
		String page = "";
		
		int cc = rs.deleteMyReview(rv);
		 System.out.println("들어옵니다 :"+cc);
		if (cc == 1) {
			page = "/ReviewList";
		}else{
			page = "/index";
		}
		return page;
			
	
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
	public String reviewWriteController(@ModelAttribute("rv") ReviewVo rv) {
		
		rs.insertReview(rv);
		
		return "views/contents/contentsReview";
	}
	
	@RequestMapping(value="/ReviewWriteAction")
	public String reviewWriteActionController() {
		
		//insertReview
		
		
		
		
		return "";
	}

}
