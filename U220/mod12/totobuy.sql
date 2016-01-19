CREATE DATABASE `totobuy`

/* !40100 DEFAULT CHARACTER SET 	utf8  */

USE totobuy;

/*DROP TABLE IF EXISTS `totalbuy`.`customers`;*/

CREATE TABLE  customers` (
  `id` char(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `gender` char(2) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `birthday` date DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `married` tinyint(1) DEFAULT '0',
  `blood_type` varchar(2) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `discount` int(10) unsigned NOT NULL DEFAULT '0',
  `status` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO customers (id, name, gender, password, email) VALUE("","","","","")