package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {
	
	
	@RequestMapping(value="/AddToBasket")
	public String AddToBasketController() {
		
		//addToBasket
		
		return "";
	}
	
	
	@RequestMapping(value="/AddToWishList")
	public String AddToWishListController() {

		//addToWishList
		
		return "";
	}
	
	
	@RequestMapping(value="/MyBasketList")
	public String MyBasketListController() {
		
		//selectBasketList
		
		return "";
	}
	
	
	@RequestMapping(value="/FromBaToWish")
	public String FromBaToWishController() {
		
		//fromBaToWish
		
		return "";
	}
	
	
	@RequestMapping(value="/MyBasketDelete")
	public String MyBasketDeleteController() {
		
		//deleteBasket
		
		return "";
	}
	
	
	@RequestMapping(value="/MyContents")
	public String MyContentsController() {
		
		//selectMyContents
		
		return "";
	}
	
	@RequestMapping(value="/MyContentsPlay")
	public String MyContentsPlayController() {
		
		//selectMyVideo
		
		return "";
	}
	
	@RequestMapping(value="/MyOrder")
	public String MyOrderController() {
		
		//selectMyOrder
		
		return "";
	}
	
	@RequestMapping(value="/MyOrderContent")
	public String MyOrderContentController() {
		
		//selectMyOrderContent
		
		return "";
	}
	
	@RequestMapping(value="/MyMemberModify")
	public String MyMemberModifyController() {
		
		//selectMyMember
		
		return "";
	}
	
	@RequestMapping(value="/MyMemberNickCheck")
	public String MyMemberNickCheckController() {
		
		//selectMyMember
		
		return "";
	}
	
	
	@RequestMapping(value="/MyMemberModifyAction")
	public String MyMemberModifyActionController() {
		
		//modiDelMember
		
		return "";
	}
	
	

}
