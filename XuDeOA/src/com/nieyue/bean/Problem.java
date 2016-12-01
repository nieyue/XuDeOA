package com.nieyue.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题(微信号、QQ号、陌陌号、微博号)
 * @author yy
 *
 */
public class Problem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 问题id
	 */
	private Integer problemId;
	/**
	 * 问题号名称（手机、微信、qq、陌陌、微博）
	 */
	private String name;
	/**
	 * 问题名称号码(手机号、微信号、qq号、陌陌号、微博号)可以根据number查询手机号信息
	 */
	private String number;
	/**
	 * 问题内容
	 */
	private String content;
	/**
	 * 问题是否解决
	 */
	private Integer isSolve;
	/**
	 * 问题创建日期
	 */
	private Date createDate;
	/**
	 * 问题创建者 外键
	 */
	private Integer adminId;
	
	
	
	public Problem() {
		super();
	}



	public Problem(Integer problemId, String name, String number,
			String content, Integer isSolve, Date createDate, Integer adminId) {
		super();
		this.problemId = problemId;
		this.name = name;
		this.number = number;
		this.content = content;
		this.isSolve = isSolve;
		this.createDate = createDate;
		this.adminId = adminId;
	}

	public Integer getProblemId() {
		return problemId;
	}

	public void setProblemId(Integer problemId) {
		this.problemId = problemId;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getIsSolve() {
		return isSolve;
	}

	public void setIsSolve(Integer isSolve) {
		this.isSolve = isSolve;
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
