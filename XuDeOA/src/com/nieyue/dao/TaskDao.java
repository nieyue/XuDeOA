package com.nieyue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nieyue.bean.Task;

/**
 * 每日工作数据库接口
 * @author yy
 *
 */
public interface TaskDao {
	/** 新增每日工作*/	
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
	public List<Task> browsePagingTask(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize,@Param("orderName")String orderName,@Param("orderWay")String orderWay) ;		
}
