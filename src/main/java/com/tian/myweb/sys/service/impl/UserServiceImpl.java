package com.tian.myweb.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tian.myweb.sys.dao.UserDAO;
import com.tian.myweb.sys.model.UserModel;
import com.tian.myweb.sys.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	
	private UserDAO userDAO;
	
	public void insertUser(UserModel user) {
		userDAO.insertUser(user);
	}

}
