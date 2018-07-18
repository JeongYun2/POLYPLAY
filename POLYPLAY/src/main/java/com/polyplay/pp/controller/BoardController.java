package com.polyplay.pp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.polyplay.pp.service.BoardService;

public class BoardController {

	
	@RequestMapping(value="/BoardNoticeList")
	   public String boardNoticeListController() {
	      
	      //selectNoticeList 
	      
	      return "";
	   }
	
	@RequestMapping(value="/BoardNoticeContent")
	   public String boardNoticeContentController() {
	      
	       
	      //selectNoticeContent
	      return "";
	   }
	
	
	@RequestMapping(value="/BoardFAQList")
	   public String boardFAQListController() {
	      
	      //selectFAQList 
	      return "";
	   }
	
	@RequestMapping(value="/BoardFAQContent")
	   public String boardFAQContentController() {
	      
	       
	      //selectFAQContent
	      return "";
	   }
	
	@RequestMapping(value="/BoardInquiryList")
	   public String boardInquiryListController() {
	      
	      //selectInquiryList 
	      
	      return "";
	   }
	
	@RequestMapping(value="/BoardInquiryWrite")
	   public String boardInquiryWriteController() {
	      
	      //
	      
	      return "";
	   }
	
	@RequestMapping(value="/BoardInquiryWriteAction")
	   public String boardInquiryWriteActionController() {
	      
	      //insertInquiry 
	      
	      return "";
	   }
	
	@RequestMapping(value="/BoardInquiryContent")
	   public String boardInquiryContentController() {
	      
	      //selectInquiryContent
		  
	      
	      return "";
	   }
	
	@RequestMapping(value="/BoardInquiryContentDelete")
	   public String boardInquiryContentDeleteController() {
	      
	      
		  //deleteInquiry
	      
	      return "";
	   }
	
	@RequestMapping(value="/BoardInquiryModify")
	   public String boardInquiryModifyController() {
	      
	      //selectInquiryContent
	      
	      return "";
	   }
	
	@RequestMapping(value="/BoardInquiryModifyAction")
	   public String boardInquiryModifyActionController() {
	      
	      //updateInquiry 
	      
	      return "";
	   }
	
	
}