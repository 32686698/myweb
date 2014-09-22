package com.tian.myweb.sys.security.authentication;

import java.util.Collection;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;

/** 
 * @description  访问决策器，决定某个用户具有的角色，是否有足够的权限去访问某个资源 ;做最终的访问控制决定 
 */  
public class MyAccessDecisionManager implements AccessDecisionManager{

	/**
	 * In this method, need to compare authentication with configAttributes.
	 * 1, A object is a URL, a filter was find permission configuration by this URL, and pass to here.
     * 2, Check authentication has attribute in permission configuration (configAttributes)
     * 3, If not match corresponding authentication, throw a AccessDeniedException.
	 */
	public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes)
			throws AccessDeniedException, InsufficientAuthenticationException {
	}

	public boolean supports(ConfigAttribute attribute) {
		return true;
	}

	public boolean supports(Class<?> clazz) {
		return true;
	}

}
