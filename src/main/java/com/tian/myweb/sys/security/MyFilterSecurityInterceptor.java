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

/**
 * @description һ���Զ����filter��
 *              �������authenticationManager,accessDecisionManager,securityMetadataSource��������
 *              �� ���ǵ����п��ƽ�������������ʵ��
 */
public class MyFilterSecurityInterceptor extends AbstractSecurityInterceptor
		implements Filter {

	private FilterInvocationSecurityMetadataSource securityMetadataSource;

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// super.beforeInvocation(fi);Դ��
		// 1.��ȡ������Դ��Ȩ��
		// ִ��Collection<ConfigAttribute> attributes =SecurityMetadataSource.getAttributes(object);
		// 2.�Ƿ�ӵ��Ȩ��
		// this.accessDecisionManager.decide(authenticated, object, attributes);
		System.out.println("------------MyFilterSecurityInterceptor.doFilter()-----------��ʼ��������....");
		FilterInvocation fi = new FilterInvocation(request, response, chain);
		InterceptorStatusToken token = super.beforeInvocation(fi);
		try {
			fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			super.afterInvocation(token, null);
		}
		System.out.println("------------MyFilterSecurityInterceptor.doFilter()-----------�������÷���������....");
	}

	@Override
	public Class<?> getSecureObjectClass() {
		// TODO Auto-generated method stub
		return FilterInvocation.class;
	}

	@Override
	public SecurityMetadataSource obtainSecurityMetadataSource() {
		return this.securityMetadataSource;
	}

	public void init(FilterConfig arg0) throws ServletException {
	}

	public void destroy() {
	}

	public void setSecurityMetadataSource(
			FilterInvocationSecurityMetadataSource securityMetadataSource) {
		this.securityMetadataSource = securityMetadataSource;
	}
}
