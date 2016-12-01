package com.nieyue.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 每个工作任务
 * @author yy
 *
 */
public class Task implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 工作任务id
	 */
	private Integer taskId;
	/**
	 * 任务名称（手机、微信、qq、陌陌、微博）
	 */
	private String name;
	/**
	 * 任务名称号码(手机号、微信号、qq号、陌陌号、微博号)可以根据number查询手机号信息
	 */
	private String number;
	/**
	 * 任务创建日期
	 */
	private Date createDate;
	/**
	 * 更新时间
	 */
	private Date updateDate;
	/**
	 * 当天基础人数
	 */
	private Integer baseNumber;
	/**
	 * 上午加人数
	 */
	private Integer amNumber;
	/**
	 * 14:00总人数
	 */
	private Integer amTotalNumber;
	/**
	 * 下午加人数
	 */
	private Integer pmNumber;
	/**
	 * 17:30总人数
	 */
	private Integer pmTotalNumber;
	/**
	 *晚上加人数
	 */
	private Integer nightNumber;
	/**
	 * 20:00总人数
	 */
	private Integer nightTotalNumber;
	/**
	 * 当天通过总人数=20:00总人数-基础人数
	 */
	private Integer dayTotalNumber;
	/**
	 * 当天存留总人数=第二天自己填
	 */
	private Integer dayRetainNumber;
	/**
	 * 填写人
	 */
	private Integer adminId;
	
	
	public Task() {
		super();
	}
	
	public Task(Integer taskId, String name, String number, Date createDate,
			Date updateDate, Integer baseNumber, Integer amNumber,
			Integer amTotalNumber, Integer pmNumber, Integer pmTotalNumber,
			Integer nightNumber, Integer nightTotalNumber,
			Integer dayTotalNumber, Integer dayRetainNumber, Integer adminId) {
		super();
		this.taskId = taskId;
		this.name = name;
		this.number = number;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.baseNumber = baseNumber;
		this.amNumber = amNumber;
		this.amTotalNumber = amTotalNumber;
		this.pmNumber = pmNumber;
		this.pmTotalNumber = pmTotalNumber;
		this.nightNumber = nightNumber;
		this.nightTotalNumber = nightTotalNumber;
		this.dayTotalNumber = dayTotalNumber;
		this.dayRetainNumber = dayRetainNumber;
		this.adminId = adminId;
	}



	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getBaseNumber() {
		return baseNumber;
	}
	public void setBaseNumber(Integer baseNumber) {
		this.baseNumber = baseNumber;
	}
	public Integer getAmNumber() {
		return amNumber;
	}
	public void setAmNumber(Integer amNumber) {
		this.amNumber = amNumber;
	}
	public Integer getAmTotalNumber() {
		return amTotalNumber;
	}
	public void setAmTotalNumber(Integer amTotalNumber) {
		this.amTotalNumber = amTotalNumber;
	}
	public Integer getPmNumber() {
		return pmNumber;
	}
	public void setPmNumber(Integer pmNumber) {
		this.pmNumber = pmNumber;
	}
	public Integer getPmTotalNumber() {
		return pmTotalNumber;
	}
	public void setPmTotalNumber(Integer pmTotalNumber) {
		this.pmTotalNumber = pmTotalNumber;
	}
	public Integer getNightNumber() {
		return nightNumber;
	}
	public void setNightNumber(Integer nightNumber) {
		this.nightNumber = nightNumber;
	}
	public Integer getNightTotalNumber() {
		return nightTotalNumber;
	}
	public void setNightTotalNumber(Integer nightTotalNumber) {
		this.nightTotalNumber = nightTotalNumber;
	}
	public Integer getDayTotalNumber() {
		return dayTotalNumber;
	}
	public void setDayTotalNumber(Integer dayTotalNumber) {
		this.dayTotalNumber = dayTotalNumber;
	}
	public Integer getDayRetainNumber() {
		return dayRetainNumber;
	}
	public void setDayRetainNumber(Integer dayRetainNumber) {
		this.dayRetainNumber = dayRetainNumber;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	
 
}
