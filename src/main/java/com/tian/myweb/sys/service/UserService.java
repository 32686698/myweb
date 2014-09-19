package com.tian.myweb.sys.service;

import java.util.List;

import com.tian.myweb.sys.domain.SysUser;


public interface UserService {

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
