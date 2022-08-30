DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
    `name` varchar(50) NOT NULL COMMENT '用户名',
    `age` int(11) NOT NULL COMMENT '年纪',
    `city_id` int(11) NOT NULL COMMENT '城市编号',
    primary key (`id`)
)ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET = utf8 COMMENT '用户表';

INSERT INTO `user`  VALUES (1, '李磊', 20,  1);
INSERT INTO `user`  VALUES (2, '陈雨', 22,  2);
INSERT INTO `user`  VALUES (3, '张华', 28,  3);
INSERT INTO `user`  VALUES (4, '黄文树', 25,  4);
INSERT INTO `user`  VALUES (5, '巴颂', 28,  5);

DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
    `city_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '城市编号',
    `city_name` varchar(50) NOT NULL COMMENT '城市名',
    `country` varchar(50) NOT NULL COMMENT '国家',
    primary key (`city_id`)
)ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET = utf8 COMMENT '城市表';

INSERT INTO `city` VALUES (1, '北京', '中国');
INSERT INTO `city` VALUES (2, '上海', '中国');
INSERT INTO `city` VALUES (3, '杭州', '中国');
INSERT INTO `city` VALUES (4, '岘港', '越南');
INSERT INTO `city` VALUES (5, '曼谷', '泰国');

DROP TABLE IF EXISTS `scenic`;
CREATE TABLE `scenic` (
    `scenic_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '景点编号',
    `city_id` int(11) NOT NULL COMMENT '城市编号',
    `scenic_name` varchar(50) NOT NULL COMMENT '景点名',
    `price` int(11) NOT NULL COMMENT '价格',
    primary key (`scenic_id`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT '景点表';
INSERT INTO `scenic` VALUES (1, 1, '故宫', 40);
INSERT INTO `scenic` VALUES (2, 1, '颐和园',20 );
INSERT INTO `scenic` VALUES (3, 2, '外滩', 0);
INSERT INTO `scenic` VALUES (4, 2, '辰山植物园', 60);
INSERT INTO `scenic` VALUES (5, 3, '西湖', 0);
INSERT INTO `scenic` VALUES (6, 4, '巴拿山', 600000);
INSERT INTO `scenic` VALUES (7, 4, '岘港大教堂', 0);
INSERT INTO `scenic` VALUES (8, 5, '大皇宫', 500);