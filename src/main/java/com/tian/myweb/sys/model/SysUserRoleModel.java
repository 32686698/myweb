/**
 * SysUserRoleModel.java 
 * Copyright(c) 2005 hisign
 * ALL Rights Reserved.
 */
package com.tian.myweb.sys.model;
 
import com.tian.myweb.base.model.BaseModel;

/**
 * 用户角色表Model
 * --Last updated:2014-09-19 12:53:16---
 * @author gaoyang
 */
public class SysUserRoleModel extends BaseModel {
    //--------------------------------------//
    /**
     * 
     */
    private String id = null;
    
    /**
     * 设置
     * 
     * @param id
     *            
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getId() {
        return this.id;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String roleId = null;
    
    /**
     * 设置
     * 
     * @param roleId
     *            
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getRoleId() {
        return this.roleId;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String userId = null;
    
    /**
     * 设置
     * 
     * @param userId
     *            
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getUserId() {
        return this.userId;
    }
    //-----------------启用标识---------------------//
    /**
     * 启用标识
     */
    private String openFlag = null;
    
    /**
     * 设置启用标识
     * 
     * @param openFlag
     *            启用标识
     */
    public void setOpenFlag(String openFlag) {
        this.openFlag = openFlag;
    }
    
    /**
     * 获得启用标识
     * 
     * @return 启用标识
     */
    public String getOpenFlag() {
        return this.openFlag;
    }
    //-----------------录入员编号---------------------//
    /**
     * 录入员编号
     */
    private String createUid = null;
    
    /**
     * 设置录入员编号
     * 
     * @param createUid
     *            录入员编号
     */
    public void setCreateUid(String createUid) {
        this.createUid = createUid;
    }
    
    /**
     * 获得录入员编号
     * 
     * @return 录入员编号
     */
    public String getCreateUid() {
        return this.createUid;
    }
    //-----------------修改人员编号---------------------//
    /**
     * 修改人员编号
     */
    private String modifyUid = null;
    
    /**
     * 设置修改人员编号
     * 
     * @param modifyUid
     *            修改人员编号
     */
    public void setModifyUid(String modifyUid) {
        this.modifyUid = modifyUid;
    }
    
    /**
     * 获得修改人员编号
     * 
     * @return 修改人员编号
     */
    public String getModifyUid() {
        return this.modifyUid;
    }

}