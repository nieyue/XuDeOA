package com.nieyue.service;

import java.util.List;

import com.nieyue.bean.DayPlus;

/**
 * 日加人数逻辑层接口
 * @author yy
 *
 */
public interface DayPlusService {
	/** 新增日加人数 */	
	public boolean addDayPlus(DayPlus dayPlus) ;	
	/** 删除日加人数 */	
	public boolean delDayPlus(Integer dayPlusId) ;
	/** 更新日加人数*/	
	public boolean updateDayPlus(DayPlus dayPlus);
	/** 装载日加人数 */	
	public DayPlus loadDayPlus(Integer dayPlusId);	
	/** 日加人数总共数目 */	
	public int countAll();
	/** 分页日加人数信息 */
	public List<DayPlus> browsePagingDayPlus(int pageNum,int pageSize,String orderName,String orderWay) ;
}
