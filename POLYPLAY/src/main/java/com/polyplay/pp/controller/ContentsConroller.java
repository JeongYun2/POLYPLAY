package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContentsConroller {

	
	@RequestMapping(value="/ContentsList")
	public String ContentsListController() {
		
		//selectGenreList
		//selectSearchList
		
		return "";
	}
	
	
	@RequestMapping(value="/ContentsInfo")
	public String ContentsInfoController() {
		
		//selectContentsInfo
	
		return "";
	}
	

	
	@RequestMapping(value="/ContentsSimilarController")
	public String ContentsSimilar() {
		
		//selectSimilarList
		
		return "";
	}
	
	@RequestMapping(value="/ContentsPlayController")
	public String ContentsPlay() {
		
		//playVideo
		
		return "";
	}
	
}
