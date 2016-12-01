package com.nieyue.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nieyue.bean.DayPlus;
import com.nieyue.dao.DayPlusDao;
import com.nieyue.service.DayPlusService;
@Service("dayPlusService")
public class DayPlusServiceImpl implements DayPlusService{
	@Resource
	DayPlusDao dayPlusDao;

	@Override
	public boolean addDayPlus(DayPlus dayPlus) {
		dayPlus.setUpdateDate(new Date());
		boolean b = dayPlusDao.addDayPlus(dayPlus);
		return b;
	}

	@Override
	public boolean delDayPlus(Integer dayPlusId) {
		boolean b = dayPlusDao.delDayPlus(dayPlusId);
		return b;
	}

	@Override
	public boolean updateDayPlus(DayPlus dayPlus) {
		dayPlus.setUpdateDate(new Date());
		boolean b = dayPlusDao.updateDayPlus(dayPlus);
		return b;
	}

	@Override
	public DayPlus loadDayPlus(Integer dayPlusId) {
		DayPlus r = dayPlusDao.loadDayPlus(dayPlusId);
		return r;
	}

	@Override
	public int countAll() {
		int c = dayPlusDao.countAll();
		return c;
	}

	@Override
	public List<DayPlus> browsePagingDayPlus(int pageNum, int pageSize,
			String orderName, String orderWay) {
		if(pageNum<1){
			pageNum=1;
		}
		if(pageSize<1){
			pageSize=0;//没有数据
		}
		List<DayPlus> l = dayPlusDao.browsePagingDayPlus(pageNum-1, pageSize, orderName, orderWay);
		return l;
	}

	
}
