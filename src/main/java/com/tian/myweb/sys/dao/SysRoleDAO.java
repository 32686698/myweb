package com.tian.myweb.sys.dao;

import java.util.List;

import com.tian.myweb.sys.domain.SysRole;

public interface SysRoleDAO {

	/**
	 * ����һ����ɫ
	 * @param user
	 */
	void insertSysRole(SysRole user);
	
	/**
	 * ����ȫ����ɫ
	 * @return
	 */
	List findAllSysRole();
	
	/**
	 * ����ID���ҽ�ɫ
	 * @param id
	 * @return
	 */
	List findSysRoleById(String id);
	
	/**
	 * ���ݽ�ɫ���õ���ɫ
	 * @param username
	 * @return
	 */
	SysRole findSysRoleByUsername(String username);
	
	/**
	 * �����û�ID�õ�����û��Ľ�ɫ
	 * @param id
	 * @return
	 */
	List findSysRoleByUserId(String id);
	
}
