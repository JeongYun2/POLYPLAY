package com.polyplay.pp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class AuthInterceptor extends HandlerInterceptorAdapter{
	

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
			

		 return true;		
	 	}
	
	
	
	
	 private void saveDest(HttpServletRequest req){
		 
	 }
	 

}

