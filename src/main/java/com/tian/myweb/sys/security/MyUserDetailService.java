package com.tian.myweb.sys.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tian.myweb.sys.domain.SysRole;
import com.tian.myweb.sys.domain.SysUser;
import com.tian.myweb.sys.service.UserService;

public class MyUserDetailService implements UserDetailsService{

	@Autowired
	private UserService userService;
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
        SysUser u = userService.findSysUserByUsername(username);
        if(null==u)
        	return null;
        
        Collection<GrantedAuthority> auths=new ArrayList<GrantedAuthority>();
        List<SysRole> roles = userService.findSysRoleByUserId(u.getId());//得到用户角色
        for (SysRole sysRole : roles) {
        	SimpleGrantedAuthority a = new SimpleGrantedAuthority(sysRole.getRoleName());
        	auths.add(a);
		}
		
        User user = new User(username,u.getPassword(),true, true, true, true, auths);
        return user;
	}

}
