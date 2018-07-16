package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	
	
	@RequestMapping(value="/OrderPay")
	public String orderPayController() {
		
		//insertOrderPay
		
		return "";
	}
	
	
	@RequestMapping(value="/OrderComplete")
	public String orderCompleteController() {
		
		//selectCheckOrder
		
		return "";
	}

}
