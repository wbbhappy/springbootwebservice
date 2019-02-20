/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50618
Source Host           : localhost:3306
Source Database       : shoperate

Target Server Type    : MYSQL
Target Server Version : 50618
File Encoding         : 65001

Date: 2019-02-20 11:15:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('test01', 'wbb', '33');
