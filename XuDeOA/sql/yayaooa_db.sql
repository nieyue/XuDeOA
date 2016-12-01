#数据库
#创建数据库
DROP DATABASE IF EXISTS xudeoa_db;
CREATE DATABASE xudeoa_db;

#使用数据库
use xudeoa_db;
#创建角色表
CREATE TABLE role_tb(
role_id int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
name varchar(255) COMMENT '角色名',
duty varchar(255) COMMENT '角色职责',
update_date datetime COMMENT '角色更新时间',
PRIMARY KEY (role_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='角色表';

#创建管理员表 
CREATE TABLE admin_tb(
admin_id int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
name varchar(255) COMMENT '管理员姓名',
cell_phone varchar(255) COMMENT '手机号',
email varchar(255) COMMENT '邮箱',
password varchar(255) COMMENT '密码',
role_id int(11) COMMENT '角色id外键',
create_date datetime COMMENT '账号创建时间',
last_login_date datetime COMMENT '最新登录时间',
PRIMARY KEY (admin_id),
CONSTRAINT FK_ROLE_ADMIN FOREIGN KEY (role_id) REFERENCES role_tb (role_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX idx_role_id (role_id) USING BTREE
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='管理员表';

#创建权限表 
CREATE TABLE jurisdiction_tb(
jurisdiction_id int(11) NOT NULL AUTO_INCREMENT COMMENT '权限id',
name varchar(255) COMMENT '权限工作流名称',
addtion tinyint(4) COMMENT '增加',
deletion tinyint(4) COMMENT '删除',
updation tinyint(4) COMMENT '修改',
queries tinyint(4) COMMENT '查询',
update_date datetime COMMENT '权限更新时间',
role_id int(11) COMMENT '角色id外键',
PRIMARY KEY (jurisdiction_id),
CONSTRAINT FK_ROLE_JURISDICTION FOREIGN KEY (role_id) REFERENCES role_tb (role_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX idx_role_id (role_id) USING BTREE
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='权限表';

#创建临时工作表 
CREATE TABLE temporary_work_tb(
temporary_work_id int(11) NOT NULL AUTO_INCREMENT COMMENT '临时工作id',
phone_number varchar(255) COMMENT '手机号',
workers varchar(255) COMMENT '工作人',
task varchar(255) COMMENT '工作任务',
task_situation varchar(255) COMMENT '完成情况',
create_date datetime COMMENT '手机创建时间',
update_date datetime COMMENT '手机更新时间',
PRIMARY KEY (temporary_work_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='临时工作表';

#创建手机表 
CREATE TABLE phone_tb(
phone_id int(11) NOT NULL AUTO_INCREMENT COMMENT '手机id',
type varchar(255) COMMENT '手机信息类型',
number varchar(255) COMMENT '手机信息编号',
iemi varchar(255) COMMENT '手机信息国际移动设备身份码',
mac varchar(255) COMMENT '手机信息物理地址',
inventory_situation varchar(255) COMMENT '手机信息在库情况',
create_date datetime COMMENT '手机创建时间',
update_date datetime COMMENT '手机更新时间',
PRIMARY KEY (phone_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='手机表';


#创建手机号码表 
CREATE TABLE phone_number_tb(
phone_number_id int(11) NOT NULL AUTO_INCREMENT COMMENT '手机号码id',
number varchar(255) COMMENT '手机号',
operating_equipment varchar(255) COMMENT '运营设备',
robot_equipment varchar(255) COMMENT '操作设备',
ip_address varchar(255) COMMENT 'ip地址',
wechat_number varchar(255) COMMENT '微信号',
wechat_type varchar(255) COMMENT '微信号类型',
wechat_password varchar(255) COMMENT '微信密码',
wechat_reg_date datetime COMMENT '微信注册日期',
qq_number varchar(255) COMMENT 'qq号',
qq_type varchar(255) COMMENT 'qq类型',
qq_password varchar(255) COMMENT 'qq密码',
qq_reg_date datetime COMMENT 'qq注册日期',
momo_number varchar(255) COMMENT '陌陌号',
momo_type varchar(255) COMMENT '陌陌类型',
momo_password varchar(255) COMMENT '陌陌密码',
momo_reg_date datetime COMMENT '陌陌注册日期',
microblog_number varchar(255) COMMENT '微博号',
microblog_type varchar(255) COMMENT '微博类型',
microblog_password varchar(255) COMMENT '微博密码',
microblog_reg_date datetime COMMENT '微博注册日期',
create_date datetime COMMENT '手机号码创建时间',
update_date datetime COMMENT '手机号码更新时间',
remark varchar(255) COMMENT '备注',
PRIMARY KEY (phone_number_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='手机号码表';

#创建问题(微信号、QQ号、陌陌号、微博号)表 
CREATE TABLE problem_tb(
problem_id int(11) NOT NULL AUTO_INCREMENT COMMENT '问题id',
name varchar(255) COMMENT '问题号名称（手机、微信、qq、陌陌、微博）',
number varchar(255) COMMENT '问题名称号码(手机号、微信号、qq号、陌陌号、微博号)可以根据number查询手机号信息',
content varchar(255) COMMENT '问题内容',
is_solve tinyint(4) COMMENT '问题是否解决',
create_date datetime COMMENT '问题创建日期',
admin_id int(11) COMMENT '问题创建者 外键',
PRIMARY KEY (problem_id),
CONSTRAINT FK_ADMIN_PROBLEM FOREIGN KEY (admin_id) REFERENCES admin_tb (admin_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX idx_admin_id (admin_id) USING BTREE
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='问题表';

#创建解决方法(微信号、QQ号、陌陌号、微博号)表 
CREATE TABLE solve_tb(
solve_id int(11) NOT NULL AUTO_INCREMENT COMMENT '解决id',
method varchar(255) COMMENT '解决方法',
create_date datetime COMMENT '创建日期',
is_adopt tinyint(4) COMMENT '是否被采纳',
admin_id int(11) COMMENT '解决创建者 外键',
problem_id int(11) COMMENT '问题  外键',
PRIMARY KEY (solve_id),
CONSTRAINT FK_ADMIN_SOLVE FOREIGN KEY (admin_id) REFERENCES admin_tb (admin_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
CONSTRAINT FK_PROBLEM_SOLVE FOREIGN KEY (problem_id) REFERENCES problem_tb (problem_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX idx_admin_id (admin_id) USING BTREE,
INDEX idx_problem_id (problem_id) USING BTREE
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='解决方法表';

#创建每个工作任务表 
CREATE TABLE task_tb(
task_id int(11) NOT NULL AUTO_INCREMENT COMMENT '工作任务id',
name varchar(255) COMMENT '任务名称（手机、微信、qq、陌陌、微博）',
number varchar(255) COMMENT '任务名称号码(手机号、微信号、qq号、陌陌号、微博号)可以根据number查询手机号信息',
base_number int(11) COMMENT '当天基础人数',
am_number int(11) COMMENT '上午加人数',
am_total_number int(11) COMMENT '14:00总人数',
pm_number int(11) COMMENT '下午加人数',
pm_total_number int(11) COMMENT '17:30总人数',
night_number int(11) COMMENT '晚上加人数',
night_total_number int(11) COMMENT '20:00总人数',
day_total_number int(11) COMMENT '当天通过总人数=20:00总人数-基础人数',
day_retain_number int(11) COMMENT '当天存留总人数=第二天自己填',
create_date datetime COMMENT '任务创建日期',
update_date datetime COMMENT '更新时间',
admin_id int(11) COMMENT '填写人 外键',
PRIMARY KEY (task_id),
CONSTRAINT FK_ADMIN_TASK FOREIGN KEY (admin_id) REFERENCES admin_tb (admin_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX idx_admin_id (admin_id) USING BTREE
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='每个工作任务表';

#创建日加人数表 
CREATE TABLE day_plus_tb(
day_plus_id int(11) NOT NULL AUTO_INCREMENT COMMENT '日加人数id',
total_number int(11) COMMENT '当天总加人数',
retain_number int(11) COMMENT '当天留存人数',
update_date datetime COMMENT '日期',
PRIMARY KEY (day_plus_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='日加人数表';