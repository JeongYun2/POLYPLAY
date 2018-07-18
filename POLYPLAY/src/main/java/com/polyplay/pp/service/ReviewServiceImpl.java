package com.polyplay.pp.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polyplay.pp.domain.ReviewVo;
import com.polyplay.pp.persistence.ReviewService_Mapper;

@Service("ReviewServiceImpl")
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ReviewVo selectMyReview(int midx, int cidx) {
		
		ReviewService_Mapper rsm = sqlSession.getMapper(ReviewService_Mapper.class);
		ReviewVo rv = rsm.selectMyReview(midx, cidx);
		
		return rv;
	}

	@Override
	public ArrayList<ReviewVo> selectLikeReview() {
		
		ReviewService_Mapper rsm = sqlSession.getMapper(ReviewService_Mapper.class);
		ArrayList<ReviewVo> alist = rsm.selectLikeReview();
		
		return alist;
	}

	@Override
	public int deleteMyReview(ReviewVo rv) {
		
		ReviewService_Mapper rsm = sqlSession.getMapper(ReviewService_Mapper.class);
		int result = rsm.deleteMyReview(rv);
		
		return result;
	}

	@Override
	public int updateLikePlus(ReviewVo rv) {
		
		ReviewService_Mapper rsm = sqlSession.getMapper(ReviewService_Mapper.class);
		int result = rsm.updateLikePlus(rv);
		
		return result;
	}

	@Override
	public int updateLikeMinus(ReviewVo rv) {
		
		ReviewService_Mapper rsm = sqlSession.getMapper(ReviewService_Mapper.class);
		int result = rsm.updateLikeMinus(rv);
		
		return result;
	}

	@Override
	public int insertReview(ReviewVo rv) {

		ReviewService_Mapper rsm = sqlSession.getMapper(ReviewService_Mapper.class);
		int result = rsm.insertReview(rv);
		
		return result;
	}

}
