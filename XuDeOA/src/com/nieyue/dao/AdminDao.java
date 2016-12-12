package com.nieyue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nieyue.bean.Admin;

/**
 * 管理员数据库接口
 * @author yy
 *
 */
public interface AdminDao {
	/** 新增管理员 */	
	public boolean addAdmin(Admin admin) ;	
	/** 删除管理员  */	
	public boolean delAdmin(Integer adminId) ;
	/** 更新管理员 */	
	public boolean updateAdmin(Admin admin);
	/** 装载管理员  */	
	public Admin loadAdmin(Integer adminId);
	/** 登录管理员 */	
	public Admin loginAdmin(@Param("adminName")String adminName,@Param("password")String password);
	/** 管理员 总共数目 */	
	public int countAll();
	/** 所有登录手机号 */	
	public List<String> browseAllAdminPhone();	
	/** 所有登录邮箱 */	
	public List<String> browseAllAdminEmail();	
	/** 管理员 分页信息 */
	public List<Admin> browsePagingAdmin(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize,@Param("orderName")String orderName,@Param("orderWay")String orderWay) ;		
}
