package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

	
	
	
	
	@RequestMapping(value="/AdminMember", method=RequestMethod.GET)
	public String adminMemberController() {
		
//		selectAdMember
		
		return "";
	}
	
	@RequestMapping(value="/AdminMemberUpdateAuth", method=RequestMethod.POST)
	public String adminMemberUpdateAuthController() {
		
		//	updateAuthMember
		
		return "";
	}
	
	@RequestMapping(value="/AdminContents", method=RequestMethod.GET)
	public String adminContentsController() {
		
		//	selectAdContents
		
		return "";
	}
	
	@RequestMapping(value="/AdminContentsWrite", method=RequestMethod.GET)
	public String adminContentsWriteController() {
		
		return "";
	}
	
	@RequestMapping(value="/AdminContentsWriteAction", method=RequestMethod.POST)
	public String adminContentsWriteActionController() {
		
		//	 insertContents
		
		return "";
	}
	
	@RequestMapping(value="/AdminContentsModify", method=RequestMethod.GET)
	public String adminContentsModifyController() {

		return "";
	}
	
	@RequestMapping(value="/AdminContentsModifyAction", method=RequestMethod.POST)
	public String adminContentsModifyActionController() {
		
		//	updateContents

		return "";
	}
	
	@RequestMapping(value="/AdminContentsDelete", method=RequestMethod.GET)
	public String adminContentsDeleteController() {
		
		return "";
	}
	
	@RequestMapping(value="/AdminContentsDeleteAction", method=RequestMethod.POST)
	public String adminContentsDeleteActionController() {
		
		//	 deleteContents
		
		return "";
	}
	
	@RequestMapping(value="/AdminOrderPay", method=RequestMethod.GET)
	public String adminOrderPayController() {
		
		//	 selectAdOrder
		
		return "";
	}
	
	@RequestMapping(value="/AdminOrderPayDelete", method=RequestMethod.POST)
	public String adminOrderPayDeleteController() {
		
		//	deleteAdOrder
		
		return "";
	}
	
	@RequestMapping(value="/AdminUpdatePay", method=RequestMethod.GET)
	public String adminUpdatePayController() {
		
		//	 updateAdPay
		
		return "";
	}
	

	

	
	@RequestMapping(value="/AdminReview", method=RequestMethod.GET)
	public String adminReviewController() {
		
		//	 selectAdReview 
		
		return "";
	}
	
	@RequestMapping(value="/AdminReviewDelete", method=RequestMethod.POST)
	public String adminReviewDeleteController() {
		
		//	 deleteAdReview  
		
		return "";
	}
	
	@RequestMapping(value="/AdminBoard")
	   public String adminBoardController() {
	      
	      //
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardList")
	   public String adminBoardListController() {
	      
	      //selectAdBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardContent")
	   public String adminBoardContentController() {
	      
	      //selectAdBoardContent
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardDelete")
	   public String adminBoardDeleteController() {
	      
	      //deleteAdBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardWrite")
	   public String adminBoardWriteController() {
	      
	      //
		
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardWriteAction")
	   public String adminBoardWriteActionController() {
	      
	      //insertAdBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardReplyWrite")
	   public String adminBoardReplyWriteController() {
	      
		 //selectAdBoardContent
	      
	      return "";
	   }

	@RequestMapping(value="/AdminBoardReplyWriteAction")
	   public String adminBoardReplyWriteActionController() {
	      
	
		 //∆Æ∑£¿Ëº« adReplyBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardModify")
	   public String adminBoardModifyController() {
	      
		//selectAdBoardContent
		
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardModifyAction")
	   public String adminBoardModifyActionController() {
	      
		//updateAdBoard
		
	      return "";
	   }
}