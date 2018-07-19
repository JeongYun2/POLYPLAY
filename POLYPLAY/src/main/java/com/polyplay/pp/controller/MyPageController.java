package com.polyplay.pp.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.polyplay.pp.domain.BasketListVo;
import com.polyplay.pp.domain.BasketVo;
import com.polyplay.pp.service.MyPageService;
import com.polyplay.pp.service.MyPageServiceImpl;

@Controller
public class MyPageController {
	
//	@Resource(name="myPageServiceImpl")
//	private MyPageService mps;
	
	@Autowired
	private MyPageService mps;
	
	
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
	public String myBasketListController(Model model) { //@RequestParam("midx") int midx,
		
		System.out.println("myBasketListController들어옴");
		
		ArrayList<BasketListVo> alist = null;
		
		alist = mps.selectBasketList(1);
//		alist = mps.selectBasketList(midx);
		
		model.addAttribute("basketList", alist);
		
		System.out.println("메소드실행하고 장바구니리스트뿌리기");
		
		return "views/mypage/myBasket";
	}
	
	
	@RequestMapping(value="/FromBaToWish")
	public String fromBaToWishController() {

		System.out.println("fromBaToWishController들어옴");
		//fromBaToWish
		
		return "views/mypage/myWishList";
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
