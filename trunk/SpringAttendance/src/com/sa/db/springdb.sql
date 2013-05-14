# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                 127.0.0.1
# Database:             springdb
# Server version:       5.1.54-community
# Server OS:            Win32
# Target-Compatibility: Same as source server (MySQL 5.1.54-community)
# max_allowed_packet:   1048576
# HeidiSQL version:     3.1 RC1 Revision: 1064
# --------------------------------------------------------

/*!40100 SET CHARACTER SET latin1*/;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0*/;


#
# Database structure for database 'springdb'
#

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springdb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `springdb`;


#
# Table structure for table 'appuser'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ `appuser` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `guid` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `userrole` varchar(255) DEFAULT NULL,
  `securityquestion` varchar(255) DEFAULT 'What is your Lucky Number',
  `answer` varchar(50) DEFAULT NULL,
  `createdon` date DEFAULT NULL,
  `modifiedon` date DEFAULT NULL,
  `createdby` varchar(50) DEFAULT NULL,
  `modifiedby` varchar(50) DEFAULT NULL,
  `active` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'appuser'
#

/*!40000 ALTER TABLE `appuser` DISABLE KEYS*/;
LOCK TABLES `appuser` WRITE;
REPLACE INTO `appuser` (`id`, `guid`, `username`, `password`, `userrole`, `securityquestion`, `answer`, `createdon`, `modifiedon`, `createdby`, `modifiedby`, `active`) VALUES
	('1','b3e03810-2382-4d46-996e-fdaa11f98175','admin','a','admin','What is your school name','admin','2013-05-10','2013-05-10','admin','admin','1');
UNLOCK TABLES;
/*!40000 ALTER TABLE `appuser` ENABLE KEYS*/;


#
# Table structure for table 'faculty'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ `faculty` (
  `fid` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `email` varchar(3) DEFAULT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'faculty'
#

# (No data found.)

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS*/;
