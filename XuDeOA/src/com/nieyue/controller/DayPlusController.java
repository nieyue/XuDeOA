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

import com.nieyue.bean.DayPlus;
import com.nieyue.exception.StateResult;
import com.nieyue.service.DayPlusService;


/**
 * 日加人数控制类
 * @author yy
 *
 */
@Controller("dayPlusController")
@RequestMapping("/dayPlus")
public class DayPlusController {
	@Resource
	private DayPlusService dayPlusService;
	
	/**
	 * 日加人数分页浏览
	 * @param orderName 商品排序数据库字段
	 * @param orderWay 商品排序方法 asc升序 desc降序
	 * @return
	 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<DayPlus> browsePagingDayPlus(
			@RequestParam(value="pageNum",defaultValue="1",required=false)int pageNum,
			@RequestParam(value="pageSize",defaultValue="10",required=false) int pageSize,
			@RequestParam(value="orderName",required=false,defaultValue="dayPlus_id") String orderName,
			@RequestParam(value="orderWay",required=false,defaultValue="desc") String orderWay,HttpSession session)  {
			List<DayPlus> list = new ArrayList<DayPlus>();
			list= dayPlusService.browsePagingDayPlus(pageNum, pageSize, orderName, orderWay);
			return list;
	}
	/**
	 * 日加人数修改
	 * @return
	 */
	@RequestMapping(value = "/update", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult updateDayPlus(@ModelAttribute DayPlus dayPlus,HttpSession session)  {
		boolean um = dayPlusService.updateDayPlus(dayPlus);
		return StateResult.getSR(um);
	}
	/**
	 * 日加人数增加
	 * @return 
	 */
	@RequestMapping(value = "/add", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult addDayPlus(@ModelAttribute DayPlus dayPlus, HttpSession session) {
		boolean am = dayPlusService.addDayPlus(dayPlus);
		return StateResult.getSR(am);
	}
	/**
	 * 日加人数删除
	 * @return
	 */
	@RequestMapping(value = "/{dayPlusId}/delete", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult delDayPlus(@PathVariable("dayPlusId") Integer dayPlusId,HttpSession session)  {
		boolean dm = dayPlusService.delDayPlus(dayPlusId);
		return StateResult.getSR(dm);
	}
	/**
	 * 日加人数浏览数量
	 * @return
	 */
	@RequestMapping(value = "/count", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody int countAll(HttpSession session)  {
		int count = dayPlusService.countAll();
		return count;
	}
	/**
	 * 日加人数单个加载
	 * @return
	 */
	@RequestMapping(value = "/{dayPlusId}", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody DayPlus loadDayPlus(@PathVariable("dayPlusId") Integer dayPlusId,HttpSession session)  {
		DayPlus dayPlus=new DayPlus();
		dayPlus = dayPlusService.loadDayPlus(dayPlusId);
		return dayPlus;
	}
	
}
