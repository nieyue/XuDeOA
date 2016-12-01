package com.nieyue.service;

import java.util.List;

import com.nieyue.bean.Admin;

/**
 * 管理员逻辑层接口
 * @author yy
 *
 */
public interface AdminService {
	/** 新增管理员 */	
	public boolean addAdmin(Admin admin) ;	
	/** 删除管理员  */	
	public boolean delAdmin(Integer adminId) ;
	/** 更新管理员 */	
	public boolean updateAdmin(Admin admin);
	/** 装载 管理员 */	
	public Admin loadAdmin(Integer adminId);	
	/** 登录管理员 */	
	public Admin loginAdmin(String adminName,String password);
	/** 管理员 总共数目 */	
	public int countAll();	
	/** 管理员 分页信息 */
	public List<Admin> browsePagingAdmin(int pageNum,int pageSize,String orderName,String orderWay);		
}
