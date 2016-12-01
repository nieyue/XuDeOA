package com.nieyue.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nieyue.bean.TemporaryWork;
import com.nieyue.dao.TemporaryWorkDao;
import com.nieyue.service.TemporaryWorkService;
@Service("temporaryWorkService")
public class TemporaryWorkServiceImpl implements TemporaryWorkService{
	@Resource
	TemporaryWorkDao temporaryWorkDao;

	@Override
	public boolean addTemporaryWork(TemporaryWork temporaryWork) {
		temporaryWork.setCreateDate(new Date());
		temporaryWork.setUpdateDate(new Date());
		boolean b = temporaryWorkDao.addTemporaryWork(temporaryWork);
		return b;
	}

	@Override
	public boolean delTemporaryWork(Integer temporaryWorkId) {
		boolean b = temporaryWorkDao.delTemporaryWork(temporaryWorkId);
		return b;
	}

	@Override
	public boolean updateTemporaryWork(TemporaryWork temporaryWork) {
		temporaryWork.setUpdateDate(new Date());
		boolean b = temporaryWorkDao.updateTemporaryWork(temporaryWork);
		return b;
	}

	@Override
	public TemporaryWork loadTemporaryWork(Integer temporaryWorkId) {
		TemporaryWork r = temporaryWorkDao.loadTemporaryWork(temporaryWorkId);
		return r;
	}

	@Override
	public int countAll() {
		int c = temporaryWorkDao.countAll();
		return c;
	}

	@Override
	public List<TemporaryWork> browsePagingTemporaryWork(int pageNum, int pageSize,
			String orderName, String orderWay) {
		if(pageNum<1){
			pageNum=1;
		}
		if(pageSize<1){
			pageSize=0;//没有数据
		}
		List<TemporaryWork> l = temporaryWorkDao.browsePagingTemporaryWork(pageNum-1, pageSize, orderName, orderWay);
		return l;
	}

	
}
