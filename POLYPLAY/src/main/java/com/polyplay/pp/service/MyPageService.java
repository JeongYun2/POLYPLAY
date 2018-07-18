package com.polyplay.pp.service;

import java.util.ArrayList;

import com.polyplay.pp.domain.BasketListVo;
import com.polyplay.pp.domain.BasketVo;
import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.domain.OrderPayVo;
import com.polyplay.pp.domain.WishListVo;



public interface MyPageService {

	
	public int addToBasket(BasketVo bav);
	
	public int addToWishList(WishListVo wv);
	
	public ArrayList<BasketListVo> selectBasketList(int midx);
	
	public int fromBaToWish(int midx, int cidx);
	
	public int deleteBasket(BasketVo bav);
	
	public OrderPayVo selectMyContents(String pStatus, int midx);
	
	public OrderPayVo selectMyVideo(String pStatus, int cidx);
	
	public OrderPayVo selectMyOrder(int midx);
	
	public OrderPayVo selectMyOrderContent(int midx, String oid); 
	
	public MemberVo selectMyMember(int midx);
	
	public MemberVo selectNicknameCheck(String mNickname);
	
	public int modiDelMember(MemberVo mv);
	
	
	
	
}
