CREATE TABLE `zz_sys_param` (
  `sys_param_id` varchar(20) NOT NULL DEFAULT '0',
  `sys_root_key` varchar(20) NOT NULL DEFAULT '0',
  `sys_parent_key` varchar(20) NOT NULL DEFAULT '0',
  `sys_sub_key` varchar(20) NOT NULL DEFAULT '0',
  `sys_param_name` varchar(40) NOT NULL DEFAULT '0',
  `sys_param_key` varchar(40) NOT NULL DEFAULT '0',
  `sys_param_value` varchar(100) NOT NULL DEFAULT '0',
  `sys_param_content` varchar(250) NOT NULL DEFAULT '0',
  `modify_datetime` varchar(20) NOT NULL DEFAULT '0',
  `remark_string` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`sys_param_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


