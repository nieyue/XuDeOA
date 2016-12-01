package com.nieyue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nieyue.bean.TemporaryWork;

/**
 * 临时工作数据库接口
 * @author yy
 *
 */
public interface TemporaryWorkDao {
	/** 新增临时工作*/	
	public boolean addTemporaryWork(TemporaryWork temporaryWork) ;	
	/** 删除临时工作 */	
	public boolean delTemporaryWork(Integer temporaryWorkId) ;
	/** 更新临时工作*/	
	public boolean updateTemporaryWork(TemporaryWork temporaryWork);
	/** 装载临时工作 */	
	public TemporaryWork loadTemporaryWork(Integer temporaryWorkId);	
	/** 临时工作总共数目 */	
	public int countAll();	
	/** 分页临时工作信息 */
	public List<TemporaryWork> browsePagingTemporaryWork(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize,@Param("orderName")String orderName,@Param("orderWay")String orderWay) ;		
}
