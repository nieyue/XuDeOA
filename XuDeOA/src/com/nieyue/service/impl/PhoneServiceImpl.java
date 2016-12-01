package com.nieyue.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nieyue.bean.Phone;
import com.nieyue.dao.PhoneDao;
import com.nieyue.service.PhoneService;
@Service("phoneService")
public class PhoneServiceImpl implements PhoneService{
	@Resource
	PhoneDao phoneDao;
	@Override
	public boolean addPhone(Phone phone) {
		phone.setCreateDate(new Date());
		phone.setUpdateDate(new Date());
		boolean b = phoneDao.addPhone(phone);
		return b;
	}

	@Override
	public boolean delPhone(Integer phoneId) {
		boolean b = phoneDao.delPhone(phoneId);
		return b;
	}

	@Override
	public boolean updatePhone(Phone phone) {
		phone.setUpdateDate(new Date());
		boolean b = phoneDao.updatePhone(phone);
		return b;
	}

	@Override
	public Phone loadPhone(Integer phoneId) {
		 Phone p = phoneDao.loadPhone(phoneId);
		return p;
	}

	@Override
	public int countAll() {
		int p = phoneDao.countAll();
		return p;
	}

	@Override
	public Phone loadPhoneByMac(String mac) {
		 Phone p = phoneDao.loadPhoneByMac(mac);
	     return p;
	}

	@Override
	public List<Phone> browsePagingPhone(int pageNum, int pageSize,
			String orderName, String orderWay) {
		if(pageNum<1){
			pageNum=1;
		}
		if(pageSize<1){
			pageSize=0;//没有数据
		}
		List<Phone> l = phoneDao.browsePagingPhone(pageNum-1, pageSize, orderName, orderWay);
		return l;
	}

}
