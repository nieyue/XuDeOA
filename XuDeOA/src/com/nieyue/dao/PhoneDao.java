package com.nieyue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nieyue.bean.Phone;

/**
 *  手机信息数据库接口
 * @author yy
 *
 */
public interface PhoneDao {
	/** 新增手机信息 */	
	public boolean addPhone(Phone phone) ;	
	/** 删除手机信息 */	
	public boolean delPhone(Integer phoneId) ;
	/** 更新手机信息*/	
	public boolean updatePhone(Phone phone);
	/** 装载手机信息 */	
	public Phone loadPhone(Integer phoneId);	
	/** 手机信息总共数目 */	
	public int countAll();
	/**根据mac地址查询手机 */	
	public Phone loadPhoneByMac(String mac);	
	/** 分页手机信息 */
	public List<Phone> browsePagingPhone(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize,@Param("orderName")String orderName,@Param("orderWay")String orderWay) ;		
}
