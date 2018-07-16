package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

	
	
	
	
	@RequestMapping(value="/AdminMember", method=RequestMethod.GET)
	public String AdminMemberController() {
		
//		selectAdMember
		
		return "";
	}
	
	@RequestMapping(value="/AdminMemberUpdateAuth", method=RequestMethod.POST)
	public String AdminMemberUpdateAuthController() {
		
		//	updateAuthMember
		
		return "";
	}
	
	@RequestMapping(value="/AdminContents", method=RequestMethod.GET)
	public String AdminContentsController() {
		
		//	selectAdContents
		
		return "";
	}
	
	@RequestMapping(value="/AdminContentsWrite", method=RequestMethod.GET)
	public String AdminContentsWriteController() {
		
		return "";
	}
	
	@RequestMapping(value="/AdminContentsWriteAction", method=RequestMethod.POST)
	public String AdminContentsWriteActionController() {
		
		//	 insertContents
		
		return "";
	}
	
	@RequestMapping(value="/AdminContentsModify", method=RequestMethod.GET)
	public String AdminContentsModifyController() {

		return "";
	}
	
	@RequestMapping(value="/AdminContentsModifyAction", method=RequestMethod.POST)
	public String AdminContentsModifyActionController() {
		
		//	updateContents

		return "";
	}
	
	@RequestMapping(value="/AdminContentsDelete", method=RequestMethod.GET)
	public String AdminContentsDeleteController() {
		
		return "";
	}
	
	@RequestMapping(value="/AdminContentsDeleteAction", method=RequestMethod.POST)
	public String AdminContentsDeleteActionController() {
		
		//	 deleteContents
		
		return "";
	}
	
	@RequestMapping(value="/AdminOrderPay", method=RequestMethod.GET)
	public String AdminOrderPayController() {
		
		//	 selectAdOrder
		
		return "";
	}
	
	@RequestMapping(value="/AdminOrderPayDelete", method=RequestMethod.POST)
	public String AdminOrderPayDeleteController() {
		
		//	deleteAdOrder
		
		return "";
	}
	
	@RequestMapping(value="/AdminUpdatePay", method=RequestMethod.GET)
	public String AdminUpdatePayController() {
		
		//	 updateAdPay
		
		return "";
	}
	

	

	
	@RequestMapping(value="/AdminReview", method=RequestMethod.GET)
	public String AdminReviewController() {
		
		//	 selectAdReview 
		
		return "";
	}
	
	@RequestMapping(value="/AdminReviewDelete", method=RequestMethod.POST)
	public String AdminReviewDeleteController() {
		
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