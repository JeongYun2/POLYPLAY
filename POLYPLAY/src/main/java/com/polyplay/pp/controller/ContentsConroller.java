package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContentsConroller {

	
	@RequestMapping(value="/ContentsList")
	public String contentsListController() {
		
		//selectGenreList
		//selectSearchList
		
		return "";
	}
	
	
	@RequestMapping(value="/ContentsInfo")
	public String contentsInfoController() {
		
		//selectContentsInfo
	
		return "";
	}
	

	
	@RequestMapping(value="/ContentsSimilarController")
	public String contentsSimilar() {
		
		//selectSimilarList
		
		return "";
	}
	
	@RequestMapping(value="/ContentsPlayController")
	public String contentsPlay() {
		
		//playVideo
		
		return "";
	}
	
}
