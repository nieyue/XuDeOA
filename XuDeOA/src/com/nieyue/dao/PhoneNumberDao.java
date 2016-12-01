package com.nieyue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nieyue.bean.PhoneNumber;

/**
 *  手机号码数据库接口
 * @author yy
 *
 */
public interface PhoneNumberDao {
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
	public List<PhoneNumber> browsePagingPhoneNumber(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize,@Param("orderName")String orderName,@Param("orderWay")String orderWay) ;		
}
