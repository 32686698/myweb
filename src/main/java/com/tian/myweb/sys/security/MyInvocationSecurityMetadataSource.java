package com.tian.myweb.sys.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.core.io.Resource;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;

import com.tian.myweb.sys.domain.SysRole;
import com.tian.myweb.sys.service.UserService;

/**
 * @description 资源源数据定义，将所有的资源和权限对应关系建立起来，即定义某一资源可以被哪些角色访问
 */
public class MyInvocationSecurityMetadataSource implements
		FilterInvocationSecurityMetadataSource {
	@Autowired
	private UserService userService;
	private AntPathMatcher urlMatcher = new AntPathMatcher();
	/* 保存资源和权限的对应关系 key-资源url value-权限 */
	private static Map<String, Collection<ConfigAttribute>> resourceMap = null;

	public MyInvocationSecurityMetadataSource() {
		loadResourceDefine();
	}

	private void loadResourceDefine() {
		resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
		// Collection<ConfigAttribute> configAttributes1 = new
		// ArrayList<ConfigAttribute>() ;
		// ConfigAttribute configAttribute1 = new SecurityConfig("ROLE_ADMIN");
		// configAttributes1.add(configAttribute1);
		// resourceMap.put("/leftmenu.action", configAttributes1);
		/*
		System.out.println("MySecurityMetadataSource.loadResourcesDefine()--------------开始加载资源列表数据--------");
		List<SysRole> roles = userService.findAllRoles();
		for (SysRole role : roles) {
			List<Resource> resources = userService.findResourcesByRoleName(role.getId());
			for (Resource resource : resources) {
				Collection<ConfigAttribute> configAttributes = null;
				ConfigAttribute configAttribute = new SecurityConfig(role.getId());
				if (resourceMap.containsKey(resource.getUrl())) {
					configAttributes = resourceMap.get(resource.getUrl());
					configAttributes.add(configAttribute);
				} else {
					configAttributes = new ArrayList<ConfigAttribute>();
					configAttributes.add(configAttribute);
					resourceMap.put(resource.getUrl(), configAttributes);
				}
			}
		}*/
	}

	public Collection<ConfigAttribute> getAttributes(Object object)
			throws IllegalArgumentException {
		// guess object is a URL.
		String url = ((FilterInvocation) object).getRequestUrl();
		Iterator<String> ite = resourceMap.keySet().iterator();
		while (ite.hasNext()) {
			String resURL = ite.next();
			if (urlMatcher.match(resURL, url)) {
				return resourceMap.get(resURL);
			}
		}
		return null;
	}

	public boolean supports(Class<?> clazz) {
		return true;
	}

	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

}
