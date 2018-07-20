package com.polyplay.pp.interceptor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.WebUtils;

import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.service.MemberService;



public class AuthInterceptor extends HandlerInterceptorAdapter{
	
	@Autowired
	MemberService ms;
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
		
		HttpSession session = request.getSession();		
		Object sMidx = session.getAttribute("sMidx");
		
		if(sMidx == null){		// 로그인한 세션이 없는 경우
			
			saveDest(request);
			Cookie loginCookie = WebUtils.getCookie(request,"loginCookie");		// client에서 loginCookie를 받아온다.  
			 
			if (loginCookie  != null){ 			//쿠키가 존재할 때
				
				// sessionId값으로 DB에 유효기간인 것을 갔고 온다. 
				String sessionId = loginCookie.getValue();
				MemberVo mv =  ms.selectAutoLogin(sessionId);
				
				if (mv != null) {
					
					session.setAttribute("sMidx", mv.getMidx());
					return true;
				}
				 
			}
			
			response.sendRedirect(request.getContextPath()+"/MemberLogin");
			return false;
		}
		return true;	
	}
	
	
	
	private void saveDest(HttpServletRequest req){
		
		String uri = req.getRequestURI();		 
		String query = req.getQueryString();
		
		 
		if (query ==null || query.equals("null")){
			query = "";
		}else {
			query = "?" + query;
		}
		
//		method가 GET이면 url과 query를 합친다.
		if (req.getMethod().equals("GET")){
			 req.getSession().setAttribute("dest", uri+query);
			
		}		 
	 }	
	 

}

