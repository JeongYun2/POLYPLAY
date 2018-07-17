package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	@RequestMapping(value="/GoToHome")
	public String HomeController() {
		
		
		
		return "home";
	}
	
	
	
	@RequestMapping(value="/MainList")
	public String mainListController() {
		
		//selectRecentList
		//selectViewCntList
		//selectStarPointList
		//selectSalesList
		
		return "";
	}

		
		
	

}
