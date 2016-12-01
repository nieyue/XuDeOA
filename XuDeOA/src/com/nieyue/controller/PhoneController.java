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

import com.nieyue.bean.Phone;
import com.nieyue.exception.StateResult;
import com.nieyue.service.PhoneService;


/**
 * 手机控制类
 * @author yy
 *
 */
@Controller("phoneController")
@RequestMapping("/phone")
public class PhoneController {
	@Resource
	private PhoneService phoneService;
	
	/**
	 * 手机分页浏览
	 * @param orderName 商品排序数据库字段
	 * @param orderWay 商品排序方法 asc升序 desc降序
	 * @return
	 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<Phone> browsePagingPhone(
			@RequestParam(value="pageNum",defaultValue="1",required=false)int pageNum,
			@RequestParam(value="pageSize",defaultValue="10",required=false) int pageSize,
			@RequestParam(value="orderName",required=false,defaultValue="phone_id") String orderName,
			@RequestParam(value="orderWay",required=false,defaultValue="desc") String orderWay,HttpSession session)  {
			List<Phone> list = new ArrayList<Phone>();
			list= phoneService.browsePagingPhone(pageNum, pageSize, orderName, orderWay);
			return list;
	}
	/**
	 * 手机修改
	 * @return
	 */
	@RequestMapping(value = "/update", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult updatePhone(@ModelAttribute Phone phone,HttpSession session)  {
		boolean um = phoneService.updatePhone(phone);
		return StateResult.getSR(um);
	}
	/**
	 * 手机增加
	 * @return
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws ParseException 
	 */
	@RequestMapping(value = "/add", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult addPhone(@ModelAttribute Phone phone, HttpSession session) {
		boolean am = phoneService.addPhone(phone);
		return StateResult.getSR(am);
	}
	/**
	 * 手机删除
	 * @return
	 */
	@RequestMapping(value = "/{phoneId}/delete", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult delPhone(@PathVariable("phoneId") Integer phoneId,HttpSession session)  {
		boolean dm = phoneService.delPhone(phoneId);
		return StateResult.getSR(dm);
	}
	/**
	 * 手机浏览数量
	 * @return
	 */
	@RequestMapping(value = "/count", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody int countAll(HttpSession session)  {
		int count = phoneService.countAll();
		return count;
	}
	/**
	 * 手机单个加载
	 * @return
	 */
	@RequestMapping(value = "/{phoneId}", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody Phone loadPhone(@PathVariable("phoneId") Integer phoneId,HttpSession session)  {
		Phone phone=new Phone();
		phone = phoneService.loadPhone(phoneId);
		return phone;
	}
	/**
	 *手机根据mac单个加载
	 * @return
	 */
	@RequestMapping(value = "/mac/{mac}", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody Phone loadMerByMac(@PathVariable("mac") String mac,HttpSession session)  {
		Phone phone=new Phone();
		phone = phoneService.loadPhoneByMac(mac);
		return phone;
	}
	
}
