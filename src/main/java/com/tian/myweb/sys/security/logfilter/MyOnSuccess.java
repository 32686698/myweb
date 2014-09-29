package com.tian.myweb.sys.security.logfilter;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.SavedRequest;

public class MyOnSuccess implements AuthenticationSuccessHandler{

	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		User user = (User) authentication.getPrincipal();
		Collection<GrantedAuthority> auths=(Collection<GrantedAuthority>) authentication.getAuthorities();
		System.out.println(authentication);
		response.sendRedirect(request.getContextPath()+"/login.jsp?msg=success");
	}

}
