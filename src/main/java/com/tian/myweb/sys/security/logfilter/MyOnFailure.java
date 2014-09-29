package com.tian.myweb.sys.security.logfilter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class MyOnFailure implements AuthenticationFailureHandler {

	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		String errorMSG = exception.getMessage();// User is disabled
		System.out.println("errorMSG:" + exception.getMessage());
		response.sendRedirect(request.getContextPath()+"/user/loginFail?msg=error");
	}

}
