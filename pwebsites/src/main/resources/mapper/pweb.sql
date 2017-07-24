/*
Navicat MySQL Data Transfer

Source Server         : .
Source Server Version : 50521
Source Host           : localhost:3306
Source Database       : pweb

Target Server Type    : MYSQL
Target Server Version : 50521
File Encoding         : 65001

Date: 2017-07-24 12:13:25
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `media_info`
-- ----------------------------
DROP TABLE IF EXISTS `media_info`;
CREATE TABLE `media_info` (
  `id` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `type_id` varchar(100) NOT NULL,
  `title` varchar(200) NOT NULL,
  `content` text,
  `path` text,
  `remark` text,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mi001` (`username`),
  KEY `mi002` (`type_id`),
  CONSTRAINT `mi001` FOREIGN KEY (`username`) REFERENCES `user_base_info` (`username`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `mi002` FOREIGN KEY (`type_id`) REFERENCES `media_info_type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of media_info
-- ----------------------------
INSERT INTO media_info VALUES ('0293bfa4-6d36-483d-af26-36ddeb327ebc', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识5', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:56:56', '2017-07-23 13:56:56');
INSERT INTO media_info VALUES ('149a047b-5156-47be-a701-c610c2dfae3e', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识第二章标签', 'ul：无序列表\ndisc是实心圆点\ncircle是空心圆点\nsquare是实心正方型点\n一般用ul li {list-style:none;}消除前面的点\nul非常有用，可以用于做导航等；老实说初学html5的时候只觉得ul li标签很有用，可以做导航，做轮展图；现在用插件比较多，为了项目的快速开发。比如做导航可以用Mmenu（Mmenu学习）轮展图可以用bootstrap的插件，瞬间觉得之前学的都白学了。其实基础还是要有的，不出错还好，出错都不造怎么开始找问题。', null, null, '2017-07-23 13:55:34', '2017-07-23 13:55:34');
INSERT INTO media_info VALUES ('17537746-f3e0-42a3-a293-8bc59bbdbb8b', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识15', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:59:46', '2017-07-23 13:59:46');
INSERT INTO media_info VALUES ('29ceafd9-2602-42b7-8c11-7e1cc3e6b60b', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识8', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:57:42', '2017-07-23 13:57:42');
INSERT INTO media_info VALUES ('33936df4-e3df-4069-ad59-a95fdf075c07', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识13', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:59:12', '2017-07-23 13:59:12');
INSERT INTO media_info VALUES ('43727e37-37b0-4524-901b-6effdffc5c9b', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识15', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 14:35:56', '2017-07-23 14:35:56');
INSERT INTO media_info VALUES ('6234ddd1-4472-44a2-88b9-43df6b24fa77', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识9', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:57:57', '2017-07-23 13:57:57');
INSERT INTO media_info VALUES ('6ee2a4b6-e422-4871-b124-e5ce1a1a1536', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识11', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:58:30', '2017-07-23 13:58:30');
INSERT INTO media_info VALUES ('7ba90ac0-b02e-4092-b6f0-9e444e835f73', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'HTML5 简介', '超文本标记语言（英语：HyperText Markup Language，简称：HTML）是一种用于创建网页的标准标记语言。\n您可以使用 HTML 来建立自己的 WEB 站点，HTML 运行在浏览器上，由浏览器来解析。\n在本教程中，您将学习如何使用 HTML 来创建站点。\nHTML 很容易学习！相信您能很快学会它！', null, null, '2017-07-23 13:53:16', '2017-07-23 13:53:16');
INSERT INTO media_info VALUES ('968f849a-a7c0-4c7d-b75e-803c3a6e9b33', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识6', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:57:11', '2017-07-23 13:57:11');
INSERT INTO media_info VALUES ('b2635acb-6130-46f3-9bde-78977114573b', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识12', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:58:47', '2017-07-23 13:58:47');
INSERT INTO media_info VALUES ('dcf5601c-48ab-4aaa-aba5-24d336111dc0', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识10', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:58:14', '2017-07-23 13:58:14');
INSERT INTO media_info VALUES ('ee30984c-188f-4a2a-b5c3-a49afbb38ffa', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识14', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:59:28', '2017-07-23 13:59:28');
INSERT INTO media_info VALUES ('f17b484a-20f8-4874-ada4-0135cb9815ed', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识7', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:57:27', '2017-07-23 13:57:27');
INSERT INTO media_info VALUES ('f3309e30-80c5-4809-bf5a-8f9dee18a2e3', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识4', '我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。', null, null, '2017-07-23 13:56:38', '2017-07-23 13:56:38');
INSERT INTO media_info VALUES ('f5435cfa-8e89-4820-91bd-8b225611565f', 'admin', '45b468f7-38ae-481a-aa04-07d45f7d5e04', 'html5基础知识第一章语法', 'HTML <!DOCTYPE> 标签\n<!DOCTYPE> 声明位于文档中的最前面的位置，处于 <html> 标签之前。此标签可告知浏览器文档使用哪种 HTML 或 XHTML 规范。\n该标签可声明三种 DTD 类型，分别表示严格版本（Strict)、过渡版本（Transitional )以及基于框架(Frameset）的 HTML 文档。', null, null, '2017-07-23 13:54:26', '2017-07-23 13:54:26');

-- ----------------------------
-- Table structure for `media_info_type`
-- ----------------------------
DROP TABLE IF EXISTS `media_info_type`;
CREATE TABLE `media_info_type` (
  `id` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `title` varchar(200) NOT NULL,
  `remark` text,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mit001` (`username`),
  CONSTRAINT `mit001` FOREIGN KEY (`username`) REFERENCES `user_base_info` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of media_info_type
-- ----------------------------
INSERT INTO media_info_type VALUES ('26e8f50b-a613-4744-bf0e-f1e71ed05dc4', 'admin', '科技趣闻', '', '2017-07-23 13:49:05', '2017-07-23 13:49:05');
INSERT INTO media_info_type VALUES ('45b468f7-38ae-481a-aa04-07d45f7d5e04', 'admin', 'HTML/CSS', '', '2017-07-23 13:46:08', '2017-07-23 13:46:08');
INSERT INTO media_info_type VALUES ('813fc977-2231-4825-b4e3-98ee9c689824', 'admin', '服务端', '', '2017-07-23 13:46:56', '2017-07-23 13:46:56');
INSERT INTO media_info_type VALUES ('88fbe288-9d69-4e88-84bf-a8936f7d636b', 'admin', '移动端', '', '2017-07-23 13:47:37', '2017-07-23 13:47:37');
INSERT INTO media_info_type VALUES ('8c47c1e0-2198-4dc3-9d68-9821c02b3e8d', 'admin', 'Web Service', '', '2017-07-23 13:48:03', '2017-07-23 13:48:03');
INSERT INTO media_info_type VALUES ('c7e357d3-3e72-4c0b-a156-281e85f95d88', 'admin', '数据库', '', '2017-07-23 13:47:14', '2017-07-23 13:47:14');
INSERT INTO media_info_type VALUES ('d810258a-9ebb-499c-9371-7f5b5c0fb4c3', 'admin', '其他', '', '2017-07-23 13:48:37', '2017-07-23 13:48:37');
INSERT INTO media_info_type VALUES ('fd2b79f2-4614-4dc0-9991-b118ddde69d7', 'admin', 'JavaScript', '', '2017-07-23 13:46:34', '2017-07-23 13:46:34');

-- ----------------------------
-- Table structure for `user_base_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_base_info`;
CREATE TABLE `user_base_info` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `sex` enum('未知','女','男') DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `politics` varchar(10) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `wechat` varchar(20) DEFAULT NULL,
  `address` text,
  `family_address` text,
  `highest_education` varchar(100) DEFAULT NULL,
  `graducated_school` varchar(100) DEFAULT NULL,
  `college` varchar(100) DEFAULT NULL,
  `major` varchar(100) DEFAULT NULL,
  `research_direction` varchar(100) DEFAULT NULL,
  `remark` text,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_base_info
-- ----------------------------
INSERT INTO user_base_info VALUES ('admin', 'admin', '刘兆龙', '男', '27', '1990-06-14', '群众', '1282118543@qq.com', '18215667302', '1282118543', '18215667302', '四川省郫都区林湾家园', '山东省临沂市沂水县', '研究生', '重庆邮电大学', '计算机科学与技术学院', '计算机科学与技术', '信息安全', null, '2017-07-15 13:05:40', '2017-07-15 13:05:43');

-- ----------------------------
-- Table structure for `user_education`
-- ----------------------------
DROP TABLE IF EXISTS `user_education`;
CREATE TABLE `user_education` (
  `id` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `education` varchar(100) DEFAULT NULL,
  `graducated_school` varchar(100) DEFAULT NULL,
  `duty` varchar(50) DEFAULT NULL,
  `date` varchar(200) DEFAULT NULL,
  `remark` text,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ue001` (`username`),
  CONSTRAINT `ue001` FOREIGN KEY (`username`) REFERENCES `user_base_info` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_education
-- ----------------------------
INSERT INTO user_education VALUES ('3d783961-8698-4ecd-a9d7-074743ae80ef', 'admin', '研究生', '重庆邮电大学', '班长', '2013.09—2016.06', '学业奖学金二等奖一次，学业奖学金三等奖二次，“校级优秀研究生干部”称号，“校级优秀硕士论文”称号。', '2017-07-23 13:36:27', '2017-07-23 13:36:27');
INSERT INTO user_education VALUES ('603a5041-877b-4713-828e-dc4452ce9246', 'admin', '大学', '山东省滨州学院', '班长', '2009.09—2013.07', '学业奖学金一等奖一次，学业奖学金二等奖三次，“校级优秀学生”称号，“校级优秀团员”称号，“校级优秀毕业生”称号。', '2017-07-23 13:35:48', '2017-07-23 13:35:48');
INSERT INTO user_education VALUES ('bd80deae-1e97-49fe-b239-b69610a60392', 'admin', '高中', '山东省沂水县沂水二中', '学生', '2005.09—2009.07', null, '2017-07-23 13:34:58', '2017-07-23 13:34:58');
INSERT INTO user_education VALUES ('d0682db3-b9f7-434a-91ea-85634a12733e', 'admin', '小学(6)', '山东省沂水县长虹小学', '学生', '2002.03—2002.07', null, '2017-07-23 13:32:48', '2017-07-23 13:32:48');
INSERT INTO user_education VALUES ('d6f64250-7378-48a6-8881-05bfdda032d6', 'admin', '初中', '山东省沂水县实验中学', '卫生委员', '2002.09—2005.07', null, '2017-07-23 13:33:45', '2017-07-23 13:33:45');
INSERT INTO user_education VALUES ('fbfbd612-4dbc-4c42-a897-e47fa6b9445b', 'admin', '小学(1~5)', '山东省沂水县蛮庄小学', '组长', '1996.09—2002.01', null, '2017-07-23 13:31:40', '2017-07-23 13:31:40');

-- ----------------------------
-- Table structure for `user_other`
-- ----------------------------
DROP TABLE IF EXISTS `user_other`;
CREATE TABLE `user_other` (
  `id` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `content` text,
  `remark` text,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `uo001` (`username`),
  CONSTRAINT `uo001` FOREIGN KEY (`username`) REFERENCES `user_base_info` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_other
-- ----------------------------
INSERT INTO user_other VALUES ('20983cae-4dfd-4183-9303-dd118707ee6c', 'admin', '科研成果', '    <p style=\"text-align: justify\">\n        <strong>1.&nbsp;&nbsp;</strong>Yong Wang, Zhaolong Liu, Jianbin Ma. A pseudorandom number generator based on piecewise logistic map. Nonlinear Dynamics. 2016. 83(4):2373-2391(SCI二区).\n    </p>\n    <p style=\"text-align: justify\">\n        <strong>2.&nbsp;&nbsp;</strong>Yong Wang, Zhaolong Liu, Peng Lei. Cryptographic Properties Analysis of Piecewise Logistic Map. 2014 International Symposium on Nonlinear Theary and its Applications. 2014:393-396(国际会议).\n    </p>\n    <p style=\"text-align: justify\">\n        <strong>3.&nbsp;&nbsp;</strong>Bo, H., Peng, L., Qin, P., Liu, Z., Bo, H., & Peng, L., et al. (2013). A method for designing hash function based on chaotic neural network.Proceedings of International Workshop on Cloud Computing & Information Security, 52(2), 229-233(国际会议).\n    </p>\n    <p style=\"text-align: justify\">\n        <strong>4.&nbsp;&nbsp;</strong>软件著作权（S盒性能测试系统V1.0）\n    </p>\n    <p style=\"text-align: justify\">\n        <strong>5.&nbsp;&nbsp;</strong>校级优秀研究生毕业论文（基于混沌的流密码算法研究）\n    </p>', null, '2017-07-23 13:41:04', '2017-07-23 13:41:04');
INSERT INTO user_other VALUES ('588b1d91-913f-400c-9947-84a8c27a50e9', 'admin', '个人评价', '我是一个乐于助人、性格内向、能吃苦不怕苦、学习能力强的人。在日常生活中善于总结问题，善于发现问题，善于钻研。我能够在很短的时间内融入一个团队，并与团队共进退。', null, '2017-07-23 13:42:02', '2017-07-23 13:42:02');
INSERT INTO user_other VALUES ('5ba9cad6-016e-476c-88f9-5e02618f12ad', 'admin', '专业技能', '    <h4>服务器</h4>\n    <p style=\"text-align: justify;\">熟悉Java语言、熟悉Java WEB、了解主流框架SSH（Spring MVC + Spring+Hibernate）、SSM（Spring MVC+Spring+MyBatis）、BuguMongo等;</p>\n    <h4>前端</h4>\n    <p style=\"text-align: justify;\">熟悉网页编程(HTML+CSS+JavaScript)，熟悉JQuery，了解Angular2、JQuery Mobile、Bootstrap等网页框架;</p>\n    <h4>数据库</h4>\n    <p style=\"text-align: justify;\">\n        熟悉MySQL，了解Redis、Mongdb、Oracle等数据库;\n    </p>\n    <h4>其他技能</h4>\n    <p style=\"text-align: justify;\">\n        了解消息队列ActiveMQ，了解C/C++、Android、游戏引擎cocos2d-x、MATLAB、PS、idea插件开发等;\n    </p>\n    <h4>科研方面</h4>\n    <p style=\"text-align: justify;\">\n        熟悉混沌理论，在混沌图像加密、混沌映射改进、混沌流密码算法等方面皆有研究成果。\n    </p>', null, '2017-07-23 13:39:33', '2017-07-23 13:39:33');
INSERT INTO user_other VALUES ('myskill', 'admin', 'myskill', ' 熟悉Java语言、熟悉Java WEB、熟悉主流框架SSH（Spring MVC + Spring+Hibernate）、SSM（Spring MVC+Spring+MyBatis），了解Spring Data、Spring boot、BuguMongo等； 熟悉网页编程(HTML5 + CSS3 + JavaScript)，熟悉JS框架JQuery、Angular2,了解JS框架vue、Angularjs、JQuery Mobile、Bootstrap、AMD等； 熟悉MySQL，了解', null, null, null);
INSERT INTO user_other VALUES ('result', 'admin', 'result', 'Yong Wang, Zhaolong Liu, Jianbin Ma. A pseudorandom number generator based on piecewise logistic map. Nonlinear Dynamics. 2016. 83(4):2373-2391(SCI二区)', null, null, null);
INSERT INTO user_other VALUES ('skillinfo', 'admin', 'skillinfo', '这是完整的html代码，也就是说JQuery为我们补全了代码，为我们带来了方便，但是当我们需要精确控制html代码的时候，需要注意这一点。\r\n\r\n html函数的作用原理首先是移除目标元素内部的html代码，然后将新代码添加到目标元素', null, null, null);

-- ----------------------------
-- Table structure for `user_project`
-- ----------------------------
DROP TABLE IF EXISTS `user_project`;
CREATE TABLE `user_project` (
  `id` varchar(100) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  `project_info` text,
  `my_work` text,
  `my_duty` varchar(100) DEFAULT NULL,
  `remark` text,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `up001` (`username`),
  CONSTRAINT `up001` FOREIGN KEY (`username`) REFERENCES `user_base_info` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_project
-- ----------------------------
INSERT INTO user_project VALUES ('0bf39a87-e337-4079-9baa-780bbcca6540', 'admin', '云龙系统——JAD', '数据管理', '2017.04—至今', '数据管理', '1）前端页面编码；<br>\n2）前端bug修改；<br>\n3）前端样式风格修改。<br>\n', 'JavaWeb开发工程师', null, '2017-07-23 12:32:21', '2017-07-23 12:32:21');
INSERT INTO user_project VALUES ('3efb735f-27e5-4250-90fd-a8ed3d24e79f', 'admin', '云龙系统——Monitor', '服务器监视系统', '2017.02—2017.04', 'APP测试系统', '1）前端页面编码；<br>\n2）前端bug修改；<br>\n3）前端样式风格修改。<br>\n', 'JavaWeb开发工程师', null, '2017-07-23 12:29:49', '2017-07-23 12:29:49');
INSERT INTO user_project VALUES ('4db50349-7ae1-41fa-b338-23f21ef0dcca', 'admin', '软件生态系统——云测、众测、远程调测、运营平台', 'APP测试系统', '2016.06—至今', 'APP测试系统', '1）根据需求完成系统的设计与编码；<br>\n2）修改测试人员提出的问题；<br> \n3）与UCD对接页面；<br>\n4）辅助解答客户问题。<br>\n', 'JavaWeb开发工程师', null, '2017-07-23 12:25:22', '2017-07-23 12:25:22');
INSERT INTO user_project VALUES ('9695ece9-0058-40e8-9c09-447d51ffd889', 'admin', '基于混沌的安全高效密码算法设计', '重庆市基础与前沿研究计划项目', '2013.07—2016.06', '基于混沌的安全高效密码算法设计', ' 1）对图像加密算法的研究(利用Cat映射和Standard映射实现彩色图像置换)<br>\n    2）利用MATLAB对算法的性能指标进行测试\n', '研究员', null, '2017-07-23 12:45:27', '2017-07-23 12:45:27');
INSERT INTO user_project VALUES ('99b0c7ac-1dae-4a78-930a-502e7d358694', 'admin', '基于物理模型的新型多媒体加密算法研究', '国家自然科学基金项目', '2015.12—2018.12', '基于物理模型的新型多媒体加密算法研究', ' 1）对Logistic混沌映射存在问题进行研究并提出改进方案<br>\n2）对混沌流密码算法进行研究<br>\n3）利用C语言编码，测试算法的效率；利用MATLAB编码，测试算法及混沌映射的性能指标<br> \n', '研究员', null, '2017-07-23 12:49:25', '2017-07-23 12:49:25');
INSERT INTO user_project VALUES ('ade5ee7e-a21f-4df1-b579-10483516cfa2', 'admin', ' DevCloud（公有云）', 'APP及手游测试', '2017.05—至今', '手机APP测试，手游测试', '1）前端页面编码；<br>\n2）前端bug修改；<br>\n3）前端样式风格修改；<br>\n4）模块后台代码编写。<br>\n', 'JavaWeb开发工程师', null, '2017-07-23 12:36:33', '2017-07-23 12:36:33');
INSERT INTO user_project VALUES ('d166b220-ab33-492a-bbb9-bfde9053eeec', 'admin', '重庆邮电大学经济管理学院课程网站群与课程网站群论坛的设计与搭建', '校内实践项目', '2013.10—2014.12', '手机APP测试，手游测试', ' 1）根据已知需求设计系统功能；<br>\n2) 针对MySQL数据库特点，设计系统数据库；<br>\n3）编码。\n', 'JavaWeb开发工程师', null, '2017-07-23 12:42:07', '2017-07-23 12:42:07');
INSERT INTO user_project VALUES ('f50998bf-fe39-47f7-b414-5e0463634774', 'admin', '重庆市网络经营者交易信用标准研究', '重庆市工商局横向项目', '2013.12—2015.12', '重庆市网络经营者交易信用标准研究', ' 1）利用MATLAB对交易信用指标进行计算', '数据分析工程师', null, '2017-07-23 12:51:24', '2017-07-23 12:51:24');
INSERT INTO user_project VALUES ('fd42e4d7-b4ff-44f6-aced-2619bcab31a6', 'admin', '商户管理系统/创客管理系统', '数据管理类', '2015.08—至今', '手机APP测试，手游测试', '1）根据客户提出的需求进行系统功能设计；<br>\n2）设计系统数据库(采用MySQL数据库)；<br>\n3）利用Servlet技术对系统进行编码；<br>\n4）系统维护。\n', 'JavaWeb开发工程师', null, '2017-07-23 12:40:11', '2017-07-23 12:40:11');

-- ----------------------------
-- Table structure for `user_work`
-- ----------------------------
DROP TABLE IF EXISTS `user_work`;
CREATE TABLE `user_work` (
  `id` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  `my_duty` varchar(100) DEFAULT NULL,
  `content` text,
  `remark` text,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `uw001` (`username`),
  CONSTRAINT `uw001` FOREIGN KEY (`username`) REFERENCES `user_base_info` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_work
-- ----------------------------
INSERT INTO user_work VALUES ('9d33a999-5fb8-46aa-a066-8631a6d55d82', 'admin', '重庆费切尔科技有限公司', '2015.3—2015.8', '软件工程师(游戏服务器的开发)', '1）根据需求完成系统的设计与编码；<br>\n2）修改测试人员提出的问题；<br>\n3）辅助前台完成部分手游前端的编码。', null, '2017-07-23 13:19:39', '2017-07-23 13:19:39');
INSERT INTO user_work VALUES ('fb275ed1-597a-47a1-9da6-086553ff1b3b', 'admin', '中软国际科技有限公司（成都分公司）', '2016.6—至今', 'JavaWeb开发工程师', '1）根据需求完成系统的设计与编码；<br>\n2）修改测试人员提出的问题；<br>\n3）与UCD对接页面；<br>\n4）辅助解答客户问题。', null, '2017-07-23 13:17:54', '2017-07-23 13:17:54');
