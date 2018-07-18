package com.polyplay.pp.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.polyplay.pp.domain.BasketListVo;
import com.polyplay.pp.domain.BasketVo;
import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.domain.OrderPayVo;
import com.polyplay.pp.domain.WishListVo;
import com.polyplay.pp.persistence.MyPageService_Mapper;


@Service("MyPageServiceImpl")
public class MyPageServiceImpl implements MyPageService {
	
	@Autowired
	SqlSession sqlSession;
	
	

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
	public ArrayList<BasketListVo> selectBasketList(int midx) {
		
		MyPageService_Mapper mpsm = sqlSession.getMapper(com.polyplay.pp.persistence.MyPageService_Mapper.class);
		ArrayList<BasketListVo> alist = mpsm.selectBasketList(midx);
		
		return alist;
	}
	
	
	@Transactional
	@Override
	public int fromBaToWish(int midx, int cidx) {
		
		MyPageService_Mapper mpsm = sqlSession.getMapper(com.polyplay.pp.persistence.MyPageService_Mapper.class);
		int result1 = mpsm.deleteBasket(midx, cidx);
		System.out.println("deleteBasket : "+result1);
/*		int result2 = mpsm.selectWishListCheck(midx, cidx);
		System.out.println("selectWishListCheck : "+result2);*/

		int result3 = mpsm.insertWishList(midx, cidx);
		System.out.println("insertWishList : "+result3);
		
		
		
		return result3;
	}

	@Override
	public int deleteBasket(BasketVo bav) {

		MyPageService_Mapper mpsm = sqlSession.getMapper(com.polyplay.pp.persistence.MyPageService_Mapper.class);
		
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
