package com.tian.myweb.base.model;

import java.util.Date;

public class BaseModel {
	
	private String openFlag;
	private String createUid;
	private Date createDate;
	private String modifyUid;
	private Date modifyDate;
	public String getOpenFlag() {
		return openFlag;
	}
	public void setOpenFlag(String openFlag) {
		this.openFlag = openFlag;
	}
	public String getCreateUid() {
		return createUid;
	}
	public void setCreateUid(String createUid) {
		this.createUid = createUid;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getModifyUid() {
		return modifyUid;
	}
	public void setModifyUid(String modifyUid) {
		this.modifyUid = modifyUid;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}
