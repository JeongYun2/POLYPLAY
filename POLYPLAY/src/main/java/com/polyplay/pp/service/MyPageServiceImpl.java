package com.polyplay.pp.service;

import java.util.ArrayList;

import com.polyplay.pp.domain.BasketVo;
import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.domain.OrderPayVo;
import com.polyplay.pp.domain.WishListVo;

public class MyPageServiceImpl implements MyPageService {

	@Override
	public int addToBasket(BasketVo bav) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addToWishList(WishListVo wv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<BasketVo> selectBasketList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int fromBaToWish(WishListVo wv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBasket(BasketVo bav) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OrderPayVo selectMyContents(String pStatus, int midx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderPayVo selectMyVideo(String pStatus, int cidx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderPayVo selectMyOrder(int midx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderPayVo selectMyOrderContent(int midx, String oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo selectMyMember(int midx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo selectNicknameCheck(String mNickname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modiDelMember(MemberVo mv) {
		// TODO Auto-generated method stub
		return 0;
	}

}
