package com.nieyue.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nieyue.bean.PhoneNumber;
import com.nieyue.dao.PhoneNumberDao;
import com.nieyue.service.PhoneNumberService;
@Service("phoneNumberService")
public class PhoneNumberServiceImpl implements PhoneNumberService{
	@Resource
	PhoneNumberDao phoneNumberDao;
	@Override
	public boolean addPhoneNumber(PhoneNumber phoneNumber) {
		phoneNumber.setCreateDate(new Date());
		phoneNumber.setUpdateDate(new Date());
		boolean b = phoneNumberDao.addPhoneNumber(phoneNumber);
		return b;
	}

	@Override
	public boolean delPhoneNumber(Integer phoneNumberId) {
		boolean b = phoneNumberDao.delPhoneNumber(phoneNumberId);
		return b;
	}

	@Override
	public boolean updatePhoneNumber(PhoneNumber phoneNumber) {
		phoneNumber.setUpdateDate(new Date());
		boolean b =phoneNumberDao.updatePhoneNumber(phoneNumber);
		return b;
	}

	@Override
	public PhoneNumber loadPhoneNumber(Integer phoneNumberId) {
		 PhoneNumber p = phoneNumberDao.loadPhoneNumber(phoneNumberId);
		return p;
	}

	@Override
	public int countAll() {
		int p = phoneNumberDao.countAll();
		return p;
	}


	@Override
	public List<PhoneNumber> browsePagingPhoneNumber(int pageNum, int pageSize,
			String orderName, String orderWay) {
		if(pageNum<1){
			pageNum=1;
		}
		if(pageSize<1){
			pageSize=0;//没有数据
		}
		List<PhoneNumber> l = phoneNumberDao.browsePagingPhoneNumber(pageNum-1, pageSize, orderName, orderWay);
		return l;
	}

}
