package com.polyplay.pp.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.polyplay.pp.domain.BoardVo;
import com.polyplay.pp.service.BoardService;
import com.polyplay.pp.service.BoardServiceImpl;

@Controller
public class BoardController {

	 @Autowired
	   BoardServiceImpl bs;
	
	 
	 
	@RequestMapping(value="/BoardNoticeList")
	   public String boardNoticeListController(Model model) {
		ArrayList<BoardVo> alist =  bs.selectNoticeList();		
		model.addAttribute("alist", alist);	
	
	      //selectNoticeList 
	      
	      return "views/board/boardNoticeList";
	   }
	

	@RequestMapping(value="/BoardNoticeContent")
	public String BoardNoticeContentController(@RequestParam("bidx") int bidx, Model model){


		BoardVo bvo = bs.selectInquiryContent(bidx);		
		model.addAttribute("bvo", bvo);
	
		return "views/board/boardNoticeContent";
	}
	
	
	@RequestMapping(value="/BoardFAQList")
	   public String boardFAQListController(Model model) {
		ArrayList<BoardVo> alist =  bs.selectFAQList();		
		model.addAttribute("alist", alist);	
	      //selectFAQList 
	      return "views/board/boardFAQList";
	   }
	/*
	@RequestMapping(value="/BoardFAQContent")
	   public String boardFAQContentController() {
	      
	       
	      //selectFAQContent
	      return "";
	   }
	*/
	@RequestMapping(value="/BoardInquiryList")
	   public String boardInquiryListController(Model model) {
		ArrayList<BoardVo> alist =  bs.selectInquiryList();		
		model.addAttribute("alist", alist);	
	      //selectInquiryList 
	      
	      return "views/board/boardInquiryList";
	   }
	
	@RequestMapping(value="/BoardInquiryWrite")
	   public String boardInquiryWriteController() {
	      
	      //
	      
	      return "views/board/boardInquiryWrite";
	   }
	
	@RequestMapping(value="/BoardInquiryWriteAction")
	public String boardInquiryWriteActionController(HttpServletRequest request,
			@RequestParam("bSubCate") String bSubcate,
			@RequestParam("bWriter") String bWriter,
			@RequestParam("bSubject") String bSubject,
			@RequestParam("bContent") String bContent
			
			) throws UnknownHostException {
				
		
		
		InetAddress local = InetAddress.getLocalHost();		
		String bIp = local.getHostAddress();		
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String bWriteday = sdf.format(dt);
		bWriteday = bWriteday.substring(2);		
		
		int res = bs.insertInquiry(bSubcate, bWriter,bSubject, bContent,   bIp);
		
		
		return "redirect:/BoardInquiryList";
	}
	   		
	@RequestMapping(value="/BoardInquiryContent")
	public String BoardInquiryContentController(@RequestParam("bidx") int bidx, Model model){


		BoardVo bvo = bs.selectInquiryContent(bidx);		
		model.addAttribute("bvo", bvo);
	
		return "views/board/boardInquiryContent";
	}
	
	@RequestMapping(value="/BoardInquiryContentDelete")
	public String BoardInquiryContentDelete(HttpServletRequest request,
			
			@RequestParam("bidx") int bidx ,Model model) throws UnknownHostException {
		
		
			
		InetAddress local = InetAddress.getLocalHost();							
		String bIp=local.getHostAddress();	
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String bModifyday = sdf.format(dt);
		bModifyday = bModifyday.substring(2);			
		
		int res = bs.deleteInquiry(bIp, bidx);
				
		return "redirect:/BoardInquiryList";
	}
	
	@RequestMapping(value="/BoardInquiryModify")
	public String BoardInquiryModifyController(@RequestParam("bidx") int bidx, Model model){

		BoardVo bvo= null;
		bvo= bs.selectInquiryContent(bidx);
		model.addAttribute("bvo",bvo);
	
		return "views/board/boardInquiryModify";
	}
	
	@RequestMapping(value="/BoardInquiryModifyAction")
	public String boardInquiryModifyActionController(HttpServletRequest request,
			
			@RequestParam("bSubcate") String bSubcate,
			@RequestParam("bSubject") String bSubject,
			@RequestParam("bContent") String bContent,
			@RequestParam("bidx") int bidx, Model model) throws UnknownHostException {		
			
		InetAddress local = InetAddress.getLocalHost();		
		String bIp  = local.getHostAddress();			
			
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String bModifyday = sdf.format(dt);
		bModifyday = bModifyday.substring(2);			
	
		int res = bs.updateInquiry(bSubcate,bSubject, bContent, bIp, bidx);			
			
		
		return "redirect:/BoardInquiryContent?bidx="+bidx;
		
	}
	
	
}
