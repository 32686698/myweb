package com.tian.myweb.sys.dao;

import java.util.List;

import com.tian.myweb.sys.domain.SysUser;

public interface SysUserDAO {

	/**
	 * 新增一个用户
	 * @param user
	 */
	void insertSysUser(SysUser user);
	
	/**
	 * 查找全部用户
	 * @return
	 */
	List findAllSysUser();
	
	/**
	 * 根据ID查找用户
	 * @param id
	 * @return
	 */
	List findSysUserById(String id);
	
	/**
	 * 根据用户名得到用户
	 * @param username
	 * @return
	 */
	SysUser findSysUserByUsername(String username);
	
}
