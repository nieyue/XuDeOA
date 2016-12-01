package com.nieyue.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 临时工作
 * 
 * @author yy
 * 
 */
public class TemporaryWork implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 临时工作id
	 */
	private Integer temporaryWorkId;
	/**
	 * 手机号
	 */
	private String phoneNumber;
	/**
	 * 工作人
	 */
	private String workers;
	/**
	 * 工作任务
	 */
	private String task;
	/**
	 * 完成情况
	 */
	private String taskSituation;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 更新时间
	 */
	private Date updateDate;
	/**
	 * 备注
	 */
	private String remark;

	public TemporaryWork() {
		super();
	}

	public TemporaryWork(Integer temporaryWorkId, String phoneNumber,
			String workers, String task, String taskSituation, Date createDate,
			Date updateDate, String remark) {
		super();
		this.temporaryWorkId = temporaryWorkId;
		this.phoneNumber = phoneNumber;
		this.workers = workers;
		this.task = task;
		this.taskSituation = taskSituation;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.remark = remark;
	}

	public Integer getTemporaryWorkId() {
		return temporaryWorkId;
	}

	public void setTemporaryWorkId(Integer temporaryWorkId) {
		this.temporaryWorkId = temporaryWorkId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWorkers() {
		return workers;
	}

	public void setWorkers(String workers) {
		this.workers = workers;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getTaskSituation() {
		return taskSituation;
	}

	public void setTaskSituation(String taskSituation) {
		this.taskSituation = taskSituation;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
