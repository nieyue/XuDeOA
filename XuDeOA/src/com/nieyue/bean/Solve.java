package com.nieyue.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 解决方法(微信号、QQ号、陌陌号、微博号)
 * @author yy
 *
 */
public class Solve implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 解决id
	 */
	private Integer solveId;
	/**
	 * 解决方法
	 */
	private String method;
	/**
	 * 解决方法创建日期
	 */
	private Date createDate;
	/**
	 * 是否被采纳 默认否0，采纳是1
	 */
	private Integer isAdopt;
	/**
	 * 解决创建者 外键
	 */
	private Integer adminId;
	/**
	 * 问题 外键
	 */
	private Integer problemId;
	
	
	public Solve() {
		super();
	}


	public Solve(Integer solveId, String method, Date createDate,
			Integer isAdopt, Integer adminId, Integer problemId) {
		super();
		this.solveId = solveId;
		this.method = method;
		this.createDate = createDate;
		this.isAdopt = isAdopt;
		this.adminId = adminId;
		this.problemId = problemId;
	}


	public Integer getSolveId() {
		return solveId;
	}


	public void setSolveId(Integer solveId) {
		this.solveId = solveId;
	}


	public String getMethod() {
		return method;
	}


	public void setMethod(String method) {
		this.method = method;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Integer getIsAdopt() {
		return isAdopt;
	}


	public void setIsAdopt(Integer isAdopt) {
		this.isAdopt = isAdopt;
	}


	public Integer getAdminId() {
		return adminId;
	}


	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}


	public Integer getProblemId() {
		return problemId;
	}


	public void setProblemId(Integer problemId) {
		this.problemId = problemId;
	}
  
}
