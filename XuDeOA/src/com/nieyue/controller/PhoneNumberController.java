package com.nieyue.controller;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
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

import com.nieyue.bean.PhoneNumber;
import com.nieyue.exception.StateResult;
import com.nieyue.service.PhoneNumberService;


/**
 * 手机号码控制类
 * @author yy
 *
 */
@Controller("phoneNumberController")
@RequestMapping("/phoneNumber")
public class PhoneNumberController {
	@Resource
	private PhoneNumberService phoneNumberService;
	
	/**
	 * 手机号码分页浏览
	 * @param orderName 商品排序数据库字段
	 * @param orderWay 商品排序方法 asc升序 desc降序
	 * @return
	 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<PhoneNumber> browsePagingPhoneNumber(
			@RequestParam(value="pageNum",defaultValue="1",required=false)int pageNum,
			@RequestParam(value="pageSize",defaultValue="10",required=false) int pageSize,
			@RequestParam(value="orderName",required=false,defaultValue="phoneNumber_id") String orderName,
			@RequestParam(value="orderWay",required=false,defaultValue="desc") String orderWay,HttpSession session)  {
			List<PhoneNumber> list = new ArrayList<PhoneNumber>();
			list= phoneNumberService.browsePagingPhoneNumber(pageNum, pageSize, orderName, orderWay);
			return list;
	}
	/**
	 * 手机号码修改
	 * @return
	 */
	@RequestMapping(value = "/update", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult updatePhoneNumber(@ModelAttribute PhoneNumber phoneNumber,HttpSession session)  {
		boolean um = phoneNumberService.updatePhoneNumber(phoneNumber);
		return StateResult.getSR(um);
	}
	/**
	 * 手机号码增加
	 * @return
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws ParseException 
	 */
	@RequestMapping(value = "/add", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult addPhoneNumber(@ModelAttribute PhoneNumber phoneNumber, HttpSession session) {
		boolean am = phoneNumberService.addPhoneNumber(phoneNumber);
		return StateResult.getSR(am);
	}
	/**
	 * 手机号码删除
	 * @return
	 */
	@RequestMapping(value = "/{phoneNumberId}/delete", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult delPhoneNumber(@PathVariable("phoneNumberId") Integer phoneNumberId,HttpSession session)  {
		boolean dm = phoneNumberService.delPhoneNumber(phoneNumberId);
		return StateResult.getSR(dm);
	}
	/**
	 * 手机号码浏览数量
	 * @return
	 */
	@RequestMapping(value = "/count", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody int countAll(HttpSession session)  {
		int count = phoneNumberService.countAll();
		return count;
	}
	/**
	 * 手机号码单个加载
	 * @return
	 */
	@RequestMapping(value = "/{phoneNumberId}", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody PhoneNumber loadPhoneNumber(@PathVariable("phoneNumberId") Integer phoneNumberId,HttpSession session)  {
		PhoneNumber phoneNumber=new PhoneNumber();
		phoneNumber = phoneNumberService.loadPhoneNumber(phoneNumberId);
		return phoneNumber;
	}
}
