DROP DATABASE IF EXISTS `DBManager`;
CREATE DATABASE IF NOT EXISTS `DBManager` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `dbmanager`;

DROP TABLE IF EXISTS `tables`;
CREATE TABLE IF NOT EXISTS `tables` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `account` VARCHAR(32) NOT NULL COMMENT '账册名称',
  `name` VARCHAR(64) NOT NULL COMMENT '表名',
  `status` INT(11) NOT NULL DEFAULT 0 COMMENT '表状态，默认值：0 运行中',
  `operator` VARCHAR(16) NOT NULL COMMENT '建立人',
  `crTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '建立日志',
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) COMMENT='管理表的表' ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

DROP PROCEDURE IF EXISTS `tablesSave`;
DELIMITER //
CREATE PROCEDURE tablesSave (IN sAccount VARCHAR(32), IN sName VARCHAR(64), IN iStatus INT, IN sOperator VARCHAR(16), OUT iID INT)
  BEGIN
    INSERT INTO tables (account, name, operator, status)
    VALUES (sAccount, sName, sOperator, iStatus);
    SELECT LAST_INSERT_ID() INTO iID;
  END;
//
DELIMITER ;


