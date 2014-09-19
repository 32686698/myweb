/**
 * SysUserModel.java 
 * Copyright(c) 2005 hisign
 * ALL Rights Reserved.
 */
package com.tian.myweb.sys.model;
 
import com.tian.myweb.base.model.BaseModel;

/**
 * 用户表Model
 * --Last updated:2014-09-19 12:53:16---
 * @author gaoyang
 */
public class SysUserModel extends BaseModel {
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
    private String username = null;
    
    /**
     * 设置
     * 
     * @param username
     *            
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getUsername() {
        return this.username;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String password = null;
    
    /**
     * 设置
     * 
     * @param password
     *            
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getPassword() {
        return this.password;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String trueName = null;
    
    /**
     * 设置
     * 
     * @param trueName
     *            
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getTrueName() {
        return this.trueName;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String cardId = null;
    
    /**
     * 设置
     * 
     * @param cardId
     *            
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getCardId() {
        return this.cardId;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String phoneNo = null;
    
    /**
     * 设置
     * 
     * @param phoneNo
     *            
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getPhoneNo() {
        return this.phoneNo;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String email = null;
    
    /**
     * 设置
     * 
     * @param email
     *            
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getEmail() {
        return this.email;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String userLevel = null;
    
    /**
     * 设置
     * 
     * @param userLevel
     *            
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getUserLevel() {
        return this.userLevel;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String defaultModule = null;
    
    /**
     * 设置
     * 
     * @param defaultModule
     *            
     */
    public void setDefaultModule(String defaultModule) {
        this.defaultModule = defaultModule;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getDefaultModule() {
        return this.defaultModule;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String organName = null;
    
    /**
     * 设置
     * 
     * @param organName
     *            
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getOrganName() {
        return this.organName;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String organId = null;
    
    /**
     * 设置
     * 
     * @param organId
     *            
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getOrganId() {
        return this.organId;
    }
    //--------------------------------------//
    /**
     * 
     */
    private String remark = null;
    
    /**
     * 设置
     * 
     * @param remark
     *            
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    /**
     * 获得
     * 
     * @return 
     */
    public String getRemark() {
        return this.remark;
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