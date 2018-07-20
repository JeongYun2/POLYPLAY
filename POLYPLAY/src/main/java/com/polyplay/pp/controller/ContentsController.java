package com.polyplay.pp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.polyplay.pp.domain.ContentsVo;
import com.polyplay.pp.service.ContentsService;
import com.polyplay.pp.service.ContentsServiceImpl;

@Controller
public class ContentsController {

	@Autowired
	ContentsService cs;
	
	@RequestMapping(value="/ContentsList")
	public String contentsListController(Model model) {
		//selectGenreList
		//selectSearchList
		
		ArrayList<ContentsVo> alist = null;
				
		alist = cs.selectGenreList(1);
		
		model.addAttribute("alist", alist);
		
		
		
		return "views/contents/contentsList";
	}
	
	
	@RequestMapping(value="/ContentsInfo")
	public String contentsInfoController(Model model) {
		//selectContentsInfo
		ContentsVo cv = null;
		
		cv = cs.selectContentsInfo(11);
		
		model.addAttribute("cv", cv);
		
		
		
		
		return "views/contents/contentsInfo";
	}
	

	
	@RequestMapping(value="/ContentsSimilar")
	public String contentsSimilarController(Model model) {
		
		//selectSimilarList
		ArrayList<ContentsVo> alist = null;
		
		alist = cs.selectlSimilarList(1);
		
		model.addAttribute("alist", alist);
		
		
		
		return "views/contents/contentsSimilar";
	}
	
	@RequestMapping(value="/ContentsPlay")
	public String contentsPlayController(@RequestParam("cidx") int cidx,Model model) {
		//playVideo
		
		ContentsVo cv = cs.selectPreVideo(cidx);
		model.addAttribute("cv", cv);
		return "/views/contents/contentsPlay";
	}
	
}