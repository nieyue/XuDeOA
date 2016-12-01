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

import com.nieyue.bean.Solve;
import com.nieyue.exception.StateResult;
import com.nieyue.service.SolveService;


/**
 * 解决控制类
 * @author yy
 *
 */
@Controller("solveController")
@RequestMapping("/solve")
public class SolveController {
	@Resource
	private SolveService solveService;
	
	/**
	 * 解决分页浏览
	 * @param orderName 商品排序数据库字段
	 * @param orderWay 商品排序方法 asc升序 desc降序
	 * @return
	 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<Solve> browsePagingSolve(
			@RequestParam(value="pageNum",defaultValue="1",required=false)int pageNum,
			@RequestParam(value="pageSize",defaultValue="10",required=false) int pageSize,
			@RequestParam(value="orderName",required=false,defaultValue="solve_id") String orderName,
			@RequestParam(value="orderWay",required=false,defaultValue="desc") String orderWay,HttpSession session)  {
			List<Solve> list = new ArrayList<Solve>();
			list= solveService.browsePagingSolve(pageNum, pageSize, orderName, orderWay);
			return list;
	}
	/**
	 * 解决修改
	 * @return
	 */
	@RequestMapping(value = "/update", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult updateSolve(@ModelAttribute Solve solve,HttpSession session)  {
		boolean um = solveService.updateSolve(solve);
		return StateResult.getSR(um);
	}
	/**
	 * 解决增加
	 * @return 
	 */
	@RequestMapping(value = "/add", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult addSolve(@ModelAttribute Solve solve, HttpSession session) {
		boolean am = solveService.addSolve(solve);
		return StateResult.getSR(am);
	}
	/**
	 * 解决删除
	 * @return
	 */
	@RequestMapping(value = "/{solveId}/delete", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody StateResult delSolve(@PathVariable("solveId") Integer solveId,HttpSession session)  {
		boolean dm = solveService.delSolve(solveId);
		return StateResult.getSR(dm);
	}
	/**
	 * 解决浏览数量
	 * @return
	 */
	@RequestMapping(value = "/count", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody int countAll(HttpSession session)  {
		int count = solveService.countAll();
		return count;
	}
	/**
	 * 解决单个加载
	 * @return
	 */
	@RequestMapping(value = "/{solveId}", method = {RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody Solve loadSolve(@PathVariable("solveId") Integer solveId,HttpSession session)  {
		Solve solve=new Solve();
		solve = solveService.loadSolve(solveId);
		return solve;
	}
	
}
