package com.nieyue.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 手机号码
 * @author yy
 *
 */
public class PhoneNumber implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 手机号码id
	 */
	private Integer phoneNumberId;
	/**
	 * 手机号码
	 */
	private String number;
	/**
	 * 运营设备
	 */
	private String operatingEquipment;
	/**
	 * 操作设备
	 */
	private String robotEquipment;
	/**
	 * ip地址
	 */
	private String ipAddress;
	/**
	 * 微信号
	 */
	private String wechatNumber;
	/**
	 * 微信号类型
	 */
	private String wechatType;
	/**
	 * 微信密码
	 */
	private String wechatPassword;
	/**
	 * 微信注册日期
	 */
	private Date wechatRegDate;
	/**
	 * QQ号
	 */
	private String qqNumber;
	/**
	 * qq号类型
	 */
	private String qqType;
	/**
	 * qq密码
	 */
	private String qqPassword;
	/**
	 * qq注册日期
	 */
	private Date qqRegDate;
	/**
	 * 陌陌号
	 */
	private String momoNumber;
	/**
	 * 陌陌号类型
	 */
	private String momoType;
	/**
	 * 陌陌密码
	 */
	private String momoPassword;
	/**
	 * 陌陌注册日期
	 */
	private Date momoRegDate;
	/**
	 * 微博号
	 */
	private String microblogNumber;
	/**
	 * 微博号类型
	 */
	private String microblogType;
	/**
	 * 微博密码
	 */
	private String microblogPassword;
	/**
	 * 微博注册日期
	 */
	private Date microblogRegDate;
	/**
	 * 手机号码创建日期
	 */
	private Date createDate;
	/**
	 * 手机号码修改日期
	 */
	private Date updateDate;
	/**
	 * 备注
	 */
	private String remark;
	
	
	public PhoneNumber() {
		super();
	}



	public PhoneNumber(Integer phoneNumberId, String number,
			String operatingEquipment, String robotEquipment, String ipAddress,
			String wechatNumber, String wechatType, String wechatPassword,
			Date wechatRegDate, String qqNumber, String qqType,
			String qqPassword, Date qqRegDate, String momoNumber,
			String momoType, String momoPassword, Date momoRegDate,
			String microblogNumber, String microblogType,
			String microblogPassword, Date microblogRegDate, Date createDate,
			Date updateDate, String remark) {
		super();
		this.phoneNumberId = phoneNumberId;
		this.number = number;
		this.operatingEquipment = operatingEquipment;
		this.robotEquipment = robotEquipment;
		this.ipAddress = ipAddress;
		this.wechatNumber = wechatNumber;
		this.wechatType = wechatType;
		this.wechatPassword = wechatPassword;
		this.wechatRegDate = wechatRegDate;
		this.qqNumber = qqNumber;
		this.qqType = qqType;
		this.qqPassword = qqPassword;
		this.qqRegDate = qqRegDate;
		this.momoNumber = momoNumber;
		this.momoType = momoType;
		this.momoPassword = momoPassword;
		this.momoRegDate = momoRegDate;
		this.microblogNumber = microblogNumber;
		this.microblogType = microblogType;
		this.microblogPassword = microblogPassword;
		this.microblogRegDate = microblogRegDate;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.remark = remark;
	}



	public Integer getPhoneNumberId() {
		return phoneNumberId;
	}


	public void setPhoneNumberId(Integer phoneNumberId) {
		this.phoneNumberId = phoneNumberId;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getOperatingEquipment() {
		return operatingEquipment;
	}


	public void setOperatingEquipment(String operatingEquipment) {
		this.operatingEquipment = operatingEquipment;
	}


	public String getRobotEquipment() {
		return robotEquipment;
	}


	public void setRobotEquipment(String robotEquipment) {
		this.robotEquipment = robotEquipment;
	}


	public String getIpAddress() {
		return ipAddress;
	}


	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}


	public String getWechatNumber() {
		return wechatNumber;
	}


	public void setWechatNumber(String wechatNumber) {
		this.wechatNumber = wechatNumber;
	}


	public String getWechatType() {
		return wechatType;
	}


	public void setWechatType(String wechatType) {
		this.wechatType = wechatType;
	}


	public String getWechatPassword() {
		return wechatPassword;
	}


	public void setWechatPassword(String wechatPassword) {
		this.wechatPassword = wechatPassword;
	}


	public Date getWechatRegDate() {
		return wechatRegDate;
	}


	public void setWechatRegDate(Date wechatRegDate) {
		this.wechatRegDate = wechatRegDate;
	}


	public String getQqNumber() {
		return qqNumber;
	}


	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}


	public String getQqType() {
		return qqType;
	}


	public void setQqType(String qqType) {
		this.qqType = qqType;
	}


	public String getQqPassword() {
		return qqPassword;
	}


	public void setQqPassword(String qqPassword) {
		this.qqPassword = qqPassword;
	}


	public Date getQqRegDate() {
		return qqRegDate;
	}


	public void setQqRegDate(Date qqRegDate) {
		this.qqRegDate = qqRegDate;
	}


	public String getMomoNumber() {
		return momoNumber;
	}


	public void setMomoNumber(String momoNumber) {
		this.momoNumber = momoNumber;
	}


	public String getMomoType() {
		return momoType;
	}


	public void setMomoType(String momoType) {
		this.momoType = momoType;
	}


	public String getMomoPassword() {
		return momoPassword;
	}


	public void setMomoPassword(String momoPassword) {
		this.momoPassword = momoPassword;
	}


	public Date getMomoRegDate() {
		return momoRegDate;
	}


	public void setMomoRegDate(Date momoRegDate) {
		this.momoRegDate = momoRegDate;
	}


	public String getMicroblogNumber() {
		return microblogNumber;
	}


	public void setMicroblogNumber(String microblogNumber) {
		this.microblogNumber = microblogNumber;
	}


	public String getMicroblogType() {
		return microblogType;
	}


	public void setMicroblogType(String microblogType) {
		this.microblogType = microblogType;
	}


	public String getMicroblogPassword() {
		return microblogPassword;
	}


	public void setMicroblogPassword(String microblogPassword) {
		this.microblogPassword = microblogPassword;
	}


	public Date getMicroblogRegDate() {
		return microblogRegDate;
	}


	public void setMicroblogRegDate(Date microblogRegDate) {
		this.microblogRegDate = microblogRegDate;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
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
