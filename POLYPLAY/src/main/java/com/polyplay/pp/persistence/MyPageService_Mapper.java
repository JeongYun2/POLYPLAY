package com.polyplay.pp.persistence;

import java.util.ArrayList;

import com.polyplay.pp.domain.BasketListVo;
import com.polyplay.pp.domain.BasketVo;
import com.polyplay.pp.domain.WishListVo;

public interface MyPageService_Mapper {
	
	public ArrayList<BasketListVo> selectBasketList(int midx);
	

	
	public int selectWishListCheck(int midx, int cidx);
	
//	public int fromBaToWish(WishListVo wv);

	public int deleteBasket(int midx, int cidx);
	
	public int insertWishList(int midx, int cidx);
	


}
