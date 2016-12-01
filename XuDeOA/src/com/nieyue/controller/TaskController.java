package com.nieyue.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nieyue.bean.Task;
import com.nieyue.exception.StateResult;
import com.nieyue.service.TaskService;


/**
 * 每日工作控制类
 * @author yy
 *
 */
@Controller("taskController")
@RequestMapping("/task")
public class TaskController {
	@Resource
	private TaskService taskService;
	
	/**
	 * 每日工作分页浏览
	 * @param orderName 商品排序数据库字段
	 * @param orderWay 商品排序方法 asc升序 desc降序
	 * @return
	 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<Task> browsePagingTask(
			@RequestParam(value="pageNum",defaultValue="1",required=false)int pageNum,
			@RequestParam(value="pageSize",defaultValue="10",required=false) int pageSize,
			@RequestParam(value="orderName",required=false,defaultValue="task_id") String orderName,
			@RequestParam(value="orderWay",required=false,defaultValue="desc") String orderWay,HttpSession session)  {
			List<Task> list = new ArrayList<Task>();
			list= taskService.browsePagingTask(pageNum, pageSize, orderName, orderWay);
			return list;
	}
	/**
	 * 每日工作修改
	 * @return
	 */
	@RequestMapping(value = "/update", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult updateTask(@ModelAttribute Task task,HttpSession session)  {
		boolean um = taskService.updateTask(task);
		return StateResult.getSR(um);
	}
	/**
	 * 每日工作增加
	 * @return 
	 */
	@RequestMapping(value = "/add", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult addTask(@ModelAttribute Task task, HttpSession session) {
		boolean am = taskService.addTask(task);
		return StateResult.getSR(am);
	}
	/**
	 * 每日工作删除
	 * @return
	 */
	@RequestMapping(value = "/{taskId}/delete", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult delTask(@PathVariable("taskId") Integer taskId,HttpSession session)  {
		boolean dm = taskService.delTask(taskId);
		return StateResult.getSR(dm);
	}
	/**
	 * 每日工作浏览数量
	 * @return
	 */
	@RequestMapping(value = "/count", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody int countAll(HttpSession session)  {
		int count = taskService.countAll();
		return count;
	}
	/**
	 * 每日工作单个加载
	 * @return
	 */
	@RequestMapping(value = "/{taskId}", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody Task loadTask(@PathVariable("taskId") Integer taskId,HttpSession session)  {
		Task task=new Task();
		task = taskService.loadTask(taskId);
		return task;
	}
	
}