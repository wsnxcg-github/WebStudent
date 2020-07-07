/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : web_student

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 07/07/2020 18:56:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stno` int(11) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dept` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `course` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 20160001, '张三', '信工', '软工');
INSERT INTO `student` VALUES (2, 20160002, '李四', '信工', '计科');
INSERT INTO `student` VALUES (3, 20160003, '王五', '信工', '通信');
INSERT INTO `student` VALUES (4, 20160004, '陈六', '信工', '电气');
INSERT INTO `student` VALUES (5, 20160005, '赵七', '信工', '智能');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'root', 'root');
INSERT INTO `user` VALUES (2, '20160001', '123456');
INSERT INTO `user` VALUES (3, '20160002', '123456');
INSERT INTO `user` VALUES (4, '20160003', '123456');
INSERT INTO `user` VALUES (5, '20160004', '123456');
INSERT INTO `user` VALUES (6, '20160005', '123456');

SET FOREIGN_KEY_CHECKS = 1;
