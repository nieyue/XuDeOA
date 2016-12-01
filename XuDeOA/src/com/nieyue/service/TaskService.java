package com.nieyue.service;

import java.util.List;

import com.nieyue.bean.Task;

/**
 * 每日工作逻辑层接口
 * @author yy
 *
 */
public interface TaskService {
	/** 新增每日工作 */	
	public boolean addTask(Task task) ;	
	/** 删除每日工作 */	
	public boolean delTask(Integer taskId) ;
	/** 更新每日工作*/	
	public boolean updateTask(Task task);
	/** 装载每日工作 */	
	public Task loadTask(Integer taskId);	
	/** 每日工作总共数目 */	
	public int countAll();
	/** 分页每日工作信息 */
	public List<Task> browsePagingTask(int pageNum,int pageSize,String orderName,String orderWay) ;
}
