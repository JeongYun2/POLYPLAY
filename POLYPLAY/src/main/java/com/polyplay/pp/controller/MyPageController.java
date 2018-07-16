package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {
	
	
	@RequestMapping(value="/AddToBasket")
	public String addToBasketController() {
		
		//addToBasket
		
		return "";
	}
	
	
	@RequestMapping(value="/AddToWishList")
	public String addToWishListController() {

		//addToWishList
		
		return "";
	}
	
	
	@RequestMapping(value="/MyBasketList")
	public String myBasketListController() {
		
		//selectBasketList
		
		return "";
	}
	
	
	@RequestMapping(value="/FromBaToWish")
	public String fromBaToWishController() {
		
		//fromBaToWish
		
		return "";
	}
	
	
	@RequestMapping(value="/MyBasketDelete")
	public String myBasketDeleteController() {
		
		//deleteBasket
		
		return "";
	}
	
	
	@RequestMapping(value="/MyContents")
	public String myContentsController() {
		
		//selectMyContents
		
		return "";
	}
	
	@RequestMapping(value="/MyContentsPlay")
	public String myContentsPlayController() {
		
		//selectMyVideo
		
		return "";
	}
	
	@RequestMapping(value="/MyOrder")
	public String myOrderController() {
		
		//selectMyOrder
		
		return "";
	}
	
	@RequestMapping(value="/MyOrderContent")
	public String myOrderContentController() {
		
		//selectMyOrderContent
		
		return "";
	}
	
	@RequestMapping(value="/MyMemberModify")
	public String myMemberModifyController() {
		
		//selectMyMember
		
		return "";
	}
	
	@RequestMapping(value="/MyMemberNickCheck")
	public String myMemberNickCheckController() {
		
		//selectMyMember
		
		return "";
	}
	
	
	@RequestMapping(value="/MyMemberModifyAction")
	public String myMemberModifyActionController() {
		
		//modiDelMember
		
		return "";
	}
	
	

}
