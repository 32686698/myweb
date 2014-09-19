package com.tian.myweb.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tian.myweb.sys.dao.SysUserDAO;
import com.tian.myweb.sys.domain.SysUser;
import com.tian.myweb.sys.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private SysUserDAO userDAO;
	
	public void insertSysUser(SysUser user) {
		userDAO.insertSysUser(user);
	}

}
