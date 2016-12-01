package com.nieyue.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 手机信息
 * @author yy
 *
 */
public class Phone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 手机信息id
	 */
	private Integer phoneId;
	/**
	 * 手机信息类型
	 */
	private String type;
	/**
	 * 手机信息编号
	 */
	private String  number;
	
	/**
	 * 手机信息国际移动设备身份码
	 */
	private String  iemi;
	/**
	 * 手机信息物理地址
	 */
	private String  mac;
	/**
	 * 手机信息在库情况
	 */
	private String  inventorySituation;
	/**
	 * 手机创建时间
	 */
	private Date  createDate;
	/**
	 * 手机更新时间
	 */
	private Date  updateDate;
	
	
	public Phone() {
		super();
	}
	
	public Phone(Integer phoneId, String type, String number, String iemi,
			String mac, String inventorySituation, Date createDate,
			Date updateDate) {
		super();
		this.phoneId = phoneId;
		this.type = type;
		this.number = number;
		this.iemi = iemi;
		this.mac = mac;
		this.inventorySituation = inventorySituation;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Integer getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getIemi() {
		return iemi;
	}
	public void setIemi(String iemi) {
		this.iemi = iemi;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getInventorySituation() {
		return inventorySituation;
	}
	public void setInventorySituation(String inventorySituation) {
		this.inventorySituation = inventorySituation;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	

}
