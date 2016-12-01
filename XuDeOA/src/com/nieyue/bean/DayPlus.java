package com.nieyue.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 日加人数
 * @author yy
 *
 */
public class DayPlus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 日加人数id
	 */
	private Integer dayPlusId;
	/**
	 * 日期
	 */
	private Date updateDate;
	/**
	 * 当天总加人数
	 */
	private Integer totalNumber;
	/**
	 * 当天留存人数
	 */
	private Integer retainNumber;
	
	
	
	public DayPlus() {
		super();
	}



	public DayPlus(Integer dayPlusId, Date updateDate, Integer totalNumber,
			Integer retainNumber) {
		super();
		this.dayPlusId = dayPlusId;
		this.updateDate = updateDate;
		this.totalNumber = totalNumber;
		this.retainNumber = retainNumber;
	}



	public Integer getDayPlusId() {
		return dayPlusId;
	}



	public void setDayPlusId(Integer dayPlusId) {
		this.dayPlusId = dayPlusId;
	}



	public Date getUpdateDate() {
		return updateDate;
	}



	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}



	public Integer getTotalNumber() {
		return totalNumber;
	}



	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}



	public Integer getRetainNumber() {
		return retainNumber;
	}



	public void setRetainNumber(Integer retainNumber) {
		this.retainNumber = retainNumber;
	}
	

}
