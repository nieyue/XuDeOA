package com.nieyue.service;

import java.util.List;

import com.nieyue.bean.Solve;

/**
 * 解决逻辑层接口
 * @author yy
 *
 */
public interface SolveService {
	/** 新增解决 */	
	public boolean addSolve(Solve solve) ;	
	/** 删除解决 */	
	public boolean delSolve(Integer solveId) ;
	/** 更新解决*/	
	public boolean updateSolve(Solve solve);
	/** 装载解决 */	
	public Solve loadSolve(Integer solveId);	
	/** 解决总共数目 */	
	public int countAll();
	/** 分页解决信息 */
	public List<Solve> browsePagingSolve(int pageNum,int pageSize,String orderName,String orderWay) ;
}
