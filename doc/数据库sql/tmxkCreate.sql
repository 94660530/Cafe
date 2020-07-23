CREATE SCHEMA `tmxk` ;

/*用户*/
create table if not exists USER(
	userid int primary key not null auto_increment, /*用户id 系统生成 非敏感*/
    username varchar(20)not null, /*用户名 用户自定义 非敏感*/
    userpwd char(20) not null, /*密码 用户自定义，不超过20位，具体格式与前端用统一 敏感*/
    userphone char(11) not null, /*手机号 用户输入 敏感*/
    
    userbirthday date, /*生日 用户输入 非敏感*/
    usergender char(1), /*用户性别 null值，0=男，1=女 非敏感*/
    useremail char(254) /*电子邮箱 正则表达式规范 非敏感*/
);
/*管理员*/
create table if not exists ADMIN(
	adminid int primary key not null auto_increment, /*管理员id（同职员id）， 系统生成*/
    adminpwd char(20) not null, /*密码 用户自定义，不超过20位，具体格式与前端用统一*/
    adminname varchar(20) not null,/*管理员名字 录入*/
    adminpos varchar(20) not null/*职位*/
);
/*食物*/
create table if not exists FOOD(
	foodid int primary key not null auto_increment,/*食物代号 系统自动生成*/
    foodname char(20) not null, /*食物名称*/
    foodtype char(1) not null, /*食物类型*/
    foodstock long not null,/*库存量*/
    foodunit varchar(10) not null,/*单位*/
    foodprice double not null,
    foodimg char(100) not null /*食物图片路径*/
);
/*订单*/
create table if not exists ORDERINF(
	orderid int primary key not null auto_increment,/*订单号 系统自动生成*/
    ordertime datetime not null,/*生成日期*/
    orderstatus char(1) not null /*订单状态 分配中，进行中，已完成，取消*/
);

/*权限*/
create table if not exists AUTHOR(
	authorid int primary key not null auto_increment, /*权限id*/
    authorname varchar(50)not null /*权限名称*/
);
/*角色*/
create table if not exists ROLETABLE(
	roleid int primary key not null auto_increment,/*角色id*/
    rolename varchar(20) not null /*角色名称*/
);

/*订单-管理员-用户*/
create table if not exists oa(
	orderid int not null,
    adminid int not null,
    userid int not null
);

/*订单-食物-用户*/
create table if not exists ofu(
	orderid int not null,
    foodid int not null,
    foodnumber int not null /*购买数量*/
);
/*用户-角色*/
create table if not exists ru(
	userid int not null,
    roleid int not null
);
/*管理员-角色*/
create table if not exists au(
	adminid int not null,
    roleid int not null
);
/*角色-权限*/
create table if not exists ra(
	roleid int not null,
    authorid int not null
);