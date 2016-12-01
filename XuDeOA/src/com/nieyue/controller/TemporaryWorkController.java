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

import com.nieyue.bean.TemporaryWork;
import com.nieyue.exception.StateResult;
import com.nieyue.service.TemporaryWorkService;


/**
 * 临时工作控制类
 * @author yy
 *
 */
@Controller("temporaryWorkController")
@RequestMapping("/temporaryWork")
public class TemporaryWorkController {
	@Resource
	private TemporaryWorkService temporaryWorkService;
	
	/**
	 * 临时工作分页浏览
	 * @param orderName 商品排序数据库字段
	 * @param orderWay 商品排序方法 asc升序 desc降序
	 * @return
	 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<TemporaryWork> browsePagingTemporaryWork(
			@RequestParam(value="pageNum",defaultValue="1",required=false)int pageNum,
			@RequestParam(value="pageSize",defaultValue="10",required=false) int pageSize,
			@RequestParam(value="orderName",required=false,defaultValue="temporaryWork_id") String orderName,
			@RequestParam(value="orderWay",required=false,defaultValue="desc") String orderWay,HttpSession session)  {
			List<TemporaryWork> list = new ArrayList<TemporaryWork>();
			list= temporaryWorkService.browsePagingTemporaryWork(pageNum, pageSize, orderName, orderWay);
			return list;
	}
	/**
	 * 临时工作修改
	 * @return
	 */
	@RequestMapping(value = "/update", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult updateTemporaryWork(@ModelAttribute TemporaryWork temporaryWork,HttpSession session)  {
		boolean um = temporaryWorkService.updateTemporaryWork(temporaryWork);
		return StateResult.getSR(um);
	}
	/**
	 * 临时工作增加
	 * @return 
	 */
	@RequestMapping(value = "/add", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult addTemporaryWork(@ModelAttribute TemporaryWork temporaryWork, HttpSession session) {
		boolean am = temporaryWorkService.addTemporaryWork(temporaryWork);
		return StateResult.getSR(am);
	}
	/**
	 * 临时工作删除
	 * @return
	 */
	@RequestMapping(value = "/{temporaryWorkId}/delete", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult delTemporaryWork(@PathVariable("temporaryWorkId") Integer temporaryWorkId,HttpSession session)  {
		boolean dm = temporaryWorkService.delTemporaryWork(temporaryWorkId);
		return StateResult.getSR(dm);
	}
	/**
	 * 临时工作浏览数量
	 * @return
	 */
	@RequestMapping(value = "/count", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody int countAll(HttpSession session)  {
		int count = temporaryWorkService.countAll();
		return count;
	}
	/**
	 * 临时工作单个加载
	 * @return
	 */
	@RequestMapping(value = "/{temporaryWorkId}", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody TemporaryWork loadTemporaryWork(@PathVariable("temporaryWorkId") Integer temporaryWorkId,HttpSession session)  {
		TemporaryWork temporaryWork=new TemporaryWork();
		temporaryWork = temporaryWorkService.loadTemporaryWork(temporaryWorkId);
		return temporaryWork;
	}
	
}
