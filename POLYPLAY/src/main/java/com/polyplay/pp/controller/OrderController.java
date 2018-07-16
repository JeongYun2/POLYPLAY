package com.polyplay.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	
	
	@RequestMapping(value="/Order")
	public String OrderController() {
		
		//insertOrderPay
		
		return "";
	}
	
	
	@RequestMapping(value="/OrderComplete")
	public String OrderCompleteController() {
		
		//selectCheckOrder
		
		return "";
	}

}
