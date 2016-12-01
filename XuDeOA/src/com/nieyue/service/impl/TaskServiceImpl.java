package com.nieyue.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nieyue.bean.Task;
import com.nieyue.dao.TaskDao;
import com.nieyue.service.TaskService;
@Service("TaskService")
public class TaskServiceImpl implements TaskService{
	@Resource
	TaskDao taskDao;

	@Override
	public boolean addTask(Task task) {
		task.setCreateDate(new Date());
		task.setUpdateDate(new Date());
		boolean b = taskDao.addTask(task);
		return b;
	}

	@Override
	public boolean delTask(Integer taskId) {
		boolean b = taskDao.delTask(taskId);
		return b;
	}

	@Override
	public boolean updateTask(Task task) {
		task.setUpdateDate(new Date());
		boolean b = taskDao.updateTask(task);
		return b;
	}

	@Override
	public Task loadTask(Integer taskId) {
		Task r = taskDao.loadTask(taskId);
		return r;
	}

	@Override
	public int countAll() {
		int c = taskDao.countAll();
		return c;
	}

	@Override
	public List<Task> browsePagingTask(int pageNum, int pageSize,
			String orderName, String orderWay) {
		if(pageNum<1){
			pageNum=1;
		}
		if(pageSize<1){
			pageSize=0;//没有数据
		}
		List<Task> l = taskDao.browsePagingTask(pageNum-1, pageSize, orderName, orderWay);
		return l;
	}

	
}
