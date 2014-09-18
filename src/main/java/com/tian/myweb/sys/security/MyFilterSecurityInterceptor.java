package com.tian.myweb.sys.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

public class MyFilterSecurityInterceptor extends AbstractSecurityInterceptor
		implements Filter {

	private FilterInvocationSecurityMetadataSource securityMetadataSource;

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		FilterInvocation fi = new FilterInvocation(arg0, arg1, arg2);
	}

	@Override
	public Class<?> getSecureObjectClass() {
		// TODO Auto-generated method stub
		return FilterInvocation.class;
	}

	public void invoke(FilterInvocation fi) throws IOException,
			ServletException {
		InterceptorStatusToken token = super.beforeInvocation(fi);
		try {
			fi.getChain().doFilter(fi.getRequest(), fi.getResponse());//核心 ，即在执行doFilter之前，进行权限的检查
		} finally {
			super.afterInvocation(token, null);
		}
	}
	
	@Override
	public SecurityMetadataSource obtainSecurityMetadataSource() {
		// TODO Auto-generated method stub
		 return this.securityMetadataSource;
	}

	
	public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {
		return securityMetadataSource;
	}
	public void setSecurityMetadataSource(
			FilterInvocationSecurityMetadataSource securityMetadataSource) {
		this.securityMetadataSource = securityMetadataSource;
	}

	public void init(FilterConfig arg0) throws ServletException {
	}
	public void destroy() {
	}
}
