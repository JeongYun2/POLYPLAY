package com.polyplay.pp.service;

import com.polyplay.pp.domain.OrderPayVo;

public interface OrderService {

	public int insertOrderPay(OrderPayVo opv);
	
	public OrderPayVo selectCheckOrder(); 
}
