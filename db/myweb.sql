/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50513
Source Host           : localhost:3306
Source Database       : myweb

Target Server Type    : MYSQL
Target Server Version : 50513
File Encoding         : 65001

Date: 2014-09-19 18:11:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` varchar(32) NOT NULL,
  `name` varchar(200) NOT NULL COMMENT '授权名称',
  `parent_id` varchar(32) DEFAULT NULL COMMENT '父节点ID',
  `operation` varchar(200) DEFAULT NULL COMMENT '操作描述',
  `description` varchar(500) DEFAULT NULL COMMENT '授权描述',
  `open_flag` varchar(1) DEFAULT NULL COMMENT '启用标识，1启用，0禁用',
  `create_date` date DEFAULT NULL,
  `create_uid` char(32) DEFAULT NULL,
  `modify_date` date DEFAULT NULL,
  `modify_uid` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', 'p1', null, null, null, '1', null, null, null, null);
INSERT INTO `sys_permission` VALUES ('2', 'p2', null, null, null, '1', null, null, null, null);

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(32) NOT NULL,
  `role_name` varchar(50) NOT NULL,
  `description` varchar(400) DEFAULT NULL,
  `open_flag` varchar(1) DEFAULT NULL COMMENT '启用标识，1启用，0禁用',
  `create_date` date DEFAULT NULL,
  `create_uid` char(32) DEFAULT NULL,
  `modify_date` date DEFAULT NULL,
  `modify_uid` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '管理员', null, '1', null, null, null, null);

-- ----------------------------
-- Table structure for `sys_role_permis`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permis`;
CREATE TABLE `sys_role_permis` (
  `id` varchar(32) NOT NULL,
  `role_id` varchar(32) NOT NULL,
  `permission_id` varchar(32) NOT NULL,
  `open_flag` varchar(1) DEFAULT NULL COMMENT '启用标识，1启用，0禁用',
  `create_date` date DEFAULT NULL,
  `create_uid` char(32) DEFAULT NULL,
  `modify_date` date DEFAULT NULL,
  `modify_uid` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permis
-- ----------------------------
INSERT INTO `sys_role_permis` VALUES ('1', '1', '1', null, null, null, null, null);
INSERT INTO `sys_role_permis` VALUES ('2', '1', '2', null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(32) NOT NULL,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL,
  `true_name` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `card_id` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `phone_no` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `user_level` char(1) DEFAULT NULL COMMENT '用户等级',
  `default_module` varchar(100) DEFAULT NULL COMMENT '默认主页',
  `organ_name` varchar(200) DEFAULT NULL COMMENT '单位名称',
  `organ_id` varchar(32) DEFAULT NULL COMMENT '单位ID',
  `remark` varchar(4000) DEFAULT NULL COMMENT '备注',
  `open_flag` varchar(1) DEFAULT NULL COMMENT '启用标识，1启用，0禁用',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `create_uid` char(32) DEFAULT NULL COMMENT '创建用户',
  `modify_date` date DEFAULT NULL COMMENT '修改时间',
  `modify_uid` char(32) DEFAULT NULL COMMENT '修改用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'tian', 'yasheng', null, null, null, null, null, null, null, null, null, '1', null, null, null, null);

-- ----------------------------
-- Table structure for `sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` varchar(32) NOT NULL,
  `user_id` varchar(32) NOT NULL,
  `role_id` varchar(32) NOT NULL,
  `open_flag` varchar(1) DEFAULT NULL COMMENT '启用标识，1启用，0禁用',
  `create_uid` char(32) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  `modify_uid` char(32) DEFAULT NULL,
  `modify_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1', '1', null, null, null, null, null);
