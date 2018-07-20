package com.polyplay.pp.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.WebUtils;

import com.polyplay.pp.controller.MemberController;
import com.polyplay.pp.domain.MemberVo;
import com.polyplay.pp.service.MemberService;



public class AuthInterceptor extends HandlerInterceptorAdapter{
	
	@Autowired
	MemberService ms;
	
	private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
		
		logger.info("AuthInterceptordp 들어왔습니다.");
		HttpSession session = request.getSession();		
		Object login = session.getAttribute("login");
		
		logger.info("login: "+login);
		
		if(login == null){		// 로그인한 세션이 없는 경우
			
			saveDest(request);
			Cookie loginCookie = WebUtils.getCookie(request,"loginCookie");		// client에서 loginCookie를 받아온다.  
			System.out.println(loginCookie);
			
			if (loginCookie  != null){ 			//쿠키가 존재할 때
				
				System.out.println("loginCookie  != null");
				// sessionId값으로 DB에 유효기간이 지나지않은 것을 갔고 온다. 
				String sessionId = loginCookie.getValue();
				MemberVo mv =  ms.selectAutoLogin(sessionId);
				logger.info("sessionId: "+sessionId+", mv: "+mv);
				
				if (mv != null) {
					
					System.out.println("mv != null");
					session.setAttribute("login", mv);
					response.sendRedirect(request.getContextPath()+"/MemberModify");
					return false;
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

