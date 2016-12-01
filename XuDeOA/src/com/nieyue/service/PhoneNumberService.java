package com.nieyue.service;

import java.util.List;

import com.nieyue.bean.PhoneNumber;

/**
 * 手机号码逻辑层接口
 * @author yy
 *
 */
public interface PhoneNumberService {
	/** 新增手机号码 */	
	public boolean addPhoneNumber(PhoneNumber phoneNumber) ;	
	/** 删除手机号码 */	
	public boolean delPhoneNumber(Integer phoneNumberId) ;
	/** 更新手机号码*/	
	public boolean updatePhoneNumber(PhoneNumber phoneNumber);
	/** 装载手机号码 */	
	public PhoneNumber loadPhoneNumber(Integer phoneNumberId);	
	/** 手机号码总共数目 */	
	public int countAll();
	/** 分页手机号码 */
	public List<PhoneNumber> browsePagingPhoneNumber(int pageNum,int pageSize,String orderName,String orderWay) ;
}
