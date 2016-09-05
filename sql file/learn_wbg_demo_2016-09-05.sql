# ************************************************************
# Sequel Pro SQL dump
# Version 4529
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.14)
# Database: learn_wbg_demo
# Generation Time: 2016-09-05 08:00:46 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table learn_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `learn_user`;

CREATE TABLE `learn_user` (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '',
  `name` varchar(255) NOT NULL DEFAULT '',
  `password` varchar(255) NOT NULL DEFAULT '',
  `sex` varchar(11) DEFAULT '',
  `age` int(11) DEFAULT NULL,
  `createTime` date DEFAULT NULL,
  `status` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `learn_user` WRITE;
/*!40000 ALTER TABLE `learn_user` DISABLE KEYS */;

INSERT INTO `learn_user` (`id`, `name`, `password`, `sex`, `age`, `createTime`, `status`)
VALUES
	(X'7569645F31623962393662322D653536322D343065642D393431622D656362356133653639363338','soldier 76','2333333333','male',40,'2016-09-05',0),
	(X'7569645F32333333647361666173646635','76','1470326400000','男',23,'2016-09-02',0),
	(X'7569645F34326334663230352D373163312D346263612D613666612D613566616137363035306439','soldier 76','2333333333','male',40,'2016-09-05',0),
	(X'7569645F62313335393264642D636161342D346135312D396464352D366361373339633932303737','soldier 76','2333333333','male',40,'2016-09-05',0),
	(X'7569645F63613734366430332D323931362D346465382D613861662D656237316536363836626662','soldier 76','2333333333','male',40,'2016-09-05',0);

/*!40000 ALTER TABLE `learn_user` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table learn_user_address
# ------------------------------------------------------------

DROP TABLE IF EXISTS `learn_user_address`;

CREATE TABLE `learn_user_address` (
  `id` varchar(255) NOT NULL DEFAULT '',
  `user_id` varchar(255) NOT NULL DEFAULT '',
  `province` varchar(255) NOT NULL DEFAULT '',
  `city` varchar(255) NOT NULL DEFAULT '',
  `town` varchar(255) NOT NULL DEFAULT '',
  `detail` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `learn_user_address` WRITE;
/*!40000 ALTER TABLE `learn_user_address` DISABLE KEYS */;

INSERT INTO `learn_user_address` (`id`, `user_id`, `province`, `city`, `town`, `detail`)
VALUES
	('aid_57ccd7db2dfa380788b1edc9','uid_ca746d03-2916-4de8-a8af-eb71e6686bfb','coco','yoyo','jojo','lolo'),
	('aid_67b2c05d-9029-4bc6-8d8d-036b983a7f06','uid_b13592dd-caa4-4a51-9dd5-6ca739c92077','coco','yoyo','jojo','lolo'),
	('aid_bd89ccb3-1905-4641-ba84-010affa360a3','uid_1b9b96b2-e562-40ed-941b-ecb5a3e69638','coco','yoyo','jojo','lolo'),
	('aid_d68815d4-193a-4888-934f-56514ddd272e','uid_42c4f205-71c1-4bca-a6fa-a5faa76050d9','coco','yoyo','jojo','lolo'),
	('uid_1233425adfsadsf','uid_2333dsafasdf5','jojo','us','tete','unknown');

/*!40000 ALTER TABLE `learn_user_address` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
