CREATE TABLE `mg_user` (
  `userId` int(11) NOT NULL COMMENT '用户编号',
  `userAccount` varchar(50) NOT NULL COMMENT '用户账号',
  `userName` varchar(50) NOT NULL COMMENT '用户名称',
  `userPwd` varchar(50) NOT NULL COMMENT '用户密码',
  `orgId` int(11) NOT NULL COMMENT '所属机构',
  `userRole` int(11) NOT NULL COMMENT '用户角色',
  `lastLoginTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最后登录时间',
  `lastLoginIp` varchar(50) DEFAULT NULL COMMENT '最后登录IP',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';
