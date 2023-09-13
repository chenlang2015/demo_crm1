/*
 Navicat Premium Data Transfer

 Source Server         : qiao
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : emp_manager

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001
# dddddddddd
 Date: 10/01/2020 19:51:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dept_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1000 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, '人事部');
INSERT INTO `department` VALUES (2, '行政部');
INSERT INTO `department` VALUES (3, '产品研发部');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `emp_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '员工名',
  `dept_id` int(11) NOT NULL COMMENT '关联部门表主键',
  `gender` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '邮箱',
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号',
  `hire_date` datetime(0) DEFAULT NULL COMMENT '入职时间',
  PRIMARY KEY (`emp_id`) USING BTREE,
  INDEX `dept_id`(`dept_id`) USING BTREE,
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `department` (`dept_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1008 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1000, ' 伍六七', 1, '男', '1127@qq.com', ' 15319618298', '2020-01-01 23:32:27');
INSERT INTO `employee` VALUES (1001, '梅十三', 2, ' 女', ' 2237@qq.com', ' 12345678909', '2020-01-07 23:33:28');
INSERT INTO `employee` VALUES (1002, '汪疯', 1, '男', 'wang@163.com', '2444666661', '2019-06-06 08:20:00');
INSERT INTO `employee` VALUES (1007, '江主任', 1, '女', '122@163.com', '12332211233', '2019-09-09 10:26:30');

SET FOREIGN_KEY_CHECKS = 1;
