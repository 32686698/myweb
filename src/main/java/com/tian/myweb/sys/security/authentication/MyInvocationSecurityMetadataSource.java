package com.tian.myweb.sys.security.authentication;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;

import com.tian.myweb.sys.service.UserService;

/**
 * @description ��ԴԴ���ݶ��壬�����е���Դ��Ȩ�޶�Ӧ��ϵ����������������ĳһ��Դ���Ա���Щ��ɫ����
 */
public class MyInvocationSecurityMetadataSource implements
		FilterInvocationSecurityMetadataSource {
	@Autowired
	private UserService userService;
	private AntPathMatcher urlMatcher = new AntPathMatcher();
	/* ������Դ��Ȩ�޵Ķ�Ӧ��ϵ key-��Դurl value-Ȩ�� */
	private static Map<String, Collection<ConfigAttribute>> resourceMap = null;

	public MyInvocationSecurityMetadataSource() {
		loadResourceDefine();
	}

	private void loadResourceDefine() {
	}

	public Collection<ConfigAttribute> getAttributes(Object object)
			throws IllegalArgumentException {
		return null;
	}

	public boolean supports(Class<?> clazz) {
		return true;
	}

	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

}
