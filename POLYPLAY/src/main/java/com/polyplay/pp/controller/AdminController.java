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
	
	@RequestMapping(value="/AdminMemberAuthAction", method=RequestMethod.POST)
	public String adminMemberAuthActionController() {
		
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
	
	@RequestMapping(value="/AdminOrderPayAction", method=RequestMethod.POST)
	public String adminOrderPayActionController() {
		
		//	deleteAdOrder
		
		return "";
	}
	
	@RequestMapping(value="/AdminReview", method=RequestMethod.GET)
	public String adminReviewController() {
		
		//	 selectAdReview 
		
		return "";
	}
	
	@RequestMapping(value="/AdminReviewAction", method=RequestMethod.POST)
	public String adminReviewActionController() {
		
		//	 deleteAdReview  
		
		return "";
	}
	
	@RequestMapping(value="/AdminBoard")
	   public String AdminBoardController() {
	      
	      //
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardList")
	   public String AdminBoardListController() {
	      
	      //selectAdBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardContent")
	   public String AdminBoardContentController() {
	      
	      //selectAdBoardContent
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardDelete")
	   public String AdminBoardDeleteController() {
	      
	      //deleteAdBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardWrite")
	   public String AdminBoardWriteController() {
	      
	      //
		
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardWriteAction")
	   public String AdminBoardWriteActionController() {
	      
	      //insertAdBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardReplyWrite")
	   public String AdminBoardReplyWriteController() {
	      
		 //selectAdBoardContent
	      
	      return "";
	   }

	@RequestMapping(value="/AdminBoardReplyWriteAction")
	   public String AdminBoardReplyWriteActionController() {
	      
		 //insertAdReplyBoard
		 //updateReplyBoard
		 //∆Æ∑£¿Ëº« adReplyBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardModify")
	   public String AdminBoardModifyController() {
	      
		//selectAdBoardContent
		
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardModifyAction")
	   public String AdminBoardModifyActionController() {
	      
		//updateAdBoard
		
	      return "";
	   }
}