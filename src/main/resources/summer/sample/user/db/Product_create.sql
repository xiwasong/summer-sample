CREATE TABLE `mg_product` (
  `productId` varchar(12) NOT NULL COMMENT '产品编号(4位cateId+4位bandId+4位序号)',
  `productName` varchar(50) NOT NULL COMMENT '产品名',
  `cateId` int(11) NOT NULL COMMENT '类别',
  `bandId` int(11) NOT NULL COMMENT '品牌',
  `mainImg` varchar(255) DEFAULT NULL COMMENT '主图片',
  `sellLevel` int(11) NOT NULL COMMENT '销售级别(对应字典项中销售级别值)',
  `recommend` int(1) NOT NULL DEFAULT '0' COMMENT '是否推荐(0:不推荐,1:推荐)',
  `addTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  `updateTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品(主要产品信息)';
