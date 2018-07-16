package com.polyplay.pp.service;

import com.polyplay.pp.domain.OrderPayVo;

public interface OrderService {

	public int insertOrder(OrderPayVo opv);
	
	public int insertPay(OrderPayVo opv);
	
	public OrderPayVo selectCheckOrder(); 
}
