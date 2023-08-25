-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2021 at 06:08 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.4.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `40512375`
--

-- --------------------------------------------------------

--
-- Table structure for table `userstable`
--

CREATE TABLE `userstable` (
  `userID` int(10) UNSIGNED NOT NULL,
  `type` int(1) NOT NULL DEFAULT 0,
  `role` char(10) NOT NULL,
  `userName` char(50) NOT NULL,
  `fname` char(50) NOT NULL,
  `lname` char(50) NOT NULL,
  `dob` char(10) NOT NULL,
  `address` char(255) NOT NULL,
  `postcode` char(10) NOT NULL,
  `phonenumber` char(15) NOT NULL,
  `email` char(100) NOT NULL,
  `password` char(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userstable`
--

INSERT INTO `userstable` (`userID`, `type`, `role`, `userName`, `fname`, `lname`, `dob`, `address`, `postcode`, `phonenumber`, `email`, `password`) VALUES
(42, 1, '', 'TolisSouv', 'Apostolos', 'Souvleris', '01/01/1990', '67 London Road', 'eh2 5rt', '06348517635', 'nick@e-magine.com.gr', 'e01fdf8707d1cc08bbfb0ecb6ee47ee8'),
(44, 0, '', 'Nikos', 'Nikos', 'Nikos', '01/01/1990', '37/1 Elbe Street', 'EH6 7HL', '07759845521', 'nick@e-magine.com.gr', 'e01fdf8707d1cc08bbfb0ecb6ee47ee8');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `userstable`
--
ALTER TABLE `userstable`
  ADD PRIMARY KEY (`userID`),
  ADD UNIQUE KEY `userName` (`userName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `userstable`
--
ALTER TABLE `userstable`
  MODIFY `userID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
