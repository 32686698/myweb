package com.tian.myweb.sys.dao;

import java.util.List;

import com.tian.myweb.sys.domain.SysRole;

public interface SysRoleDAO {

	/**
	 * 新增一个角色
	 * @param user
	 */
	void insertSysRole(SysRole user);
	
	/**
	 * 查找全部角色
	 * @return
	 */
	List findAllSysRole();
	
	/**
	 * 根据ID查找角色
	 * @param id
	 * @return
	 */
	List findSysRoleById(String id);
	
	/**
	 * 根据角色名得到角色
	 * @param username
	 * @return
	 */
	SysRole findSysRoleByUsername(String username);
	
	/**
	 * 根据用户ID得到这个用户的角色
	 * @param id
	 * @return
	 */
	List findSysRoleByUserId(String id);
	
}
