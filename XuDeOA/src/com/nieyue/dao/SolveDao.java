package com.nieyue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nieyue.bean.Solve;

/**
 * 解决数据库接口
 * @author yy
 *
 */
public interface SolveDao {
	/** 新增解决*/	
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
	public List<Solve> browsePagingSolve(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize,@Param("orderName")String orderName,@Param("orderWay")String orderWay) ;		
}
