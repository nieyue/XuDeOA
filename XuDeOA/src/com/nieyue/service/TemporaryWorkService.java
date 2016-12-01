package com.nieyue.service;

import java.util.List;

import com.nieyue.bean.TemporaryWork;

/**
 * 临时工作逻辑层接口
 * @author yy
 *
 */
public interface TemporaryWorkService {
	/** 新增临时工作 */	
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
	public List<TemporaryWork> browsePagingTemporaryWork(int pageNum,int pageSize,String orderName,String orderWay) ;
}
