<?php
	
	$query ="CREATE TABLE IF NOT EXISTS `userstable` (
	`userID` int(10) unsigned NOT NULL AUTO_INCREMENT,
	`userName` char(50) NOT NULL,
	`fname` char(50) NOT NULL,
	`lname` char(50) NOT NULL,
	`dob` char(10) NOT NULL,
	`address` char(255) NOT NULL,
	`postcode` char(10) NOT NULL,
	`email` char(100) NOT NULL,
	`phonenumber` char(15) NOT NULL,
	`password` char(32) NOT NULL,
	PRIMARY KEY ('userID') UNIQUE ('userName')
);";
	mysqli_query($connect, $query);
?>