package com.polyplay.pp.service;

import java.util.ArrayList;


import com.polyplay.pp.domain.BasketVo;
import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.domain.OrderPayVo;
import com.polyplay.pp.domain.WishListVo;



public interface MyPageService {

	public ArrayList<BasketVo> selectBasketList();
	
	public int deleteBasket(BasketVo mv);
	
	public int insertWishList(BasketVo mv);
	
	public WishListVo selectWishListCheck(int midx, int cidx);
	
	public WishListVo selectMyWishList(int midx);
	
	public int deleteWishList(WishListVo mv);
	
	public int insertWishList(WishListVo mv);
	
	public OrderPayVo selectMyContents(String pStatus, int midx);
	
	public OrderPayVo selectMyVideo(String pStatus, int cidx);
	
	public OrderPayVo selectMyOrder(int midx);
	
	public OrderPayVo selectMyOrderContent(int midx, String oid); 
	
	public MemberVo selectMyMember(int midx);
	
	public MemberVo selectPwConfirm(int midx, String mPassword);
	
	public int updateMember(MemberVo mv);
	
	public int deleteMember(MemberVo mv);
	
	
}
