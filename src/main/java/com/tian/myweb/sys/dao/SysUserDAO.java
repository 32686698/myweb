package com.tian.myweb.sys.dao;

import java.util.List;

import com.tian.myweb.sys.domain.SysUser;

public interface SysUserDAO {

	/**
	 * ����һ���û�
	 * @param user
	 */
	void insertSysUser(SysUser user);
	
	/**
	 * ����ȫ���û�
	 * @return
	 */
	List findAllSysUser();
	
	/**
	 * ����ID�����û�
	 * @param id
	 * @return
	 */
	List findSysUserById(String id);
	
	/**
	 * �����û����õ��û�
	 * @param username
	 * @return
	 */
	SysUser findSysUserByUsername(String username);
	
}
