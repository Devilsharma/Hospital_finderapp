-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2019 at 12:44 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbdoctor`
--

CREATE TABLE `tbdoctor` (
  `name` varchar(30) NOT NULL,
  `age` varchar(10) NOT NULL,
  `phone_no` varchar(11) NOT NULL,
  `h_lic_no` varchar(30) NOT NULL,
  `appoinment_date` varchar(10) NOT NULL,
  `address` varchar(50) NOT NULL,
  `permision` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbdoctor`
--

INSERT INTO `tbdoctor` (`name`, `age`, `phone_no`, `h_lic_no`, `appoinment_date`, `address`, `permision`) VALUES
('', '', '', '', '', '', ''),
('', '', '', '', '', '', ''),
('', '', '', 'dfs', '', '', ''),
('nitish', '20', '789138', 'dfs', '20', 'bhopal', 'kdflja'),
('', '', '', '', '', '', ''),
('', '', '', '', '', '', ''),
('', '', '', '', '', '', ''),
('DHFag`', '21', '917398172', 'ajkdkjd', 'ajkdjs', 'ksajdh', 'jadksh'),
('DHFag`', '21', '917398172', 'ajkdkjd', 'ajkdjs', 'ksajdh', 'jadksh');

-- --------------------------------------------------------

--
-- Table structure for table `tbhospital`
--

CREATE TABLE `tbhospital` (
  `name` varchar(20) NOT NULL,
  `licence` varchar(30) NOT NULL,
  `email` varchar(20) NOT NULL,
  `address` varchar(30) NOT NULL,
  `state` varchar(20) NOT NULL,
  `district` varchar(20) NOT NULL,
  `pin code` varchar(10) NOT NULL,
  `phone no` varchar(11) NOT NULL,
  `password` varchar(20) NOT NULL,
  `owner` varchar(20) NOT NULL,
  `std year` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl`
--

CREATE TABLE `tbl` (
  `name` varchar(20) NOT NULL,
  `age` varchar(20) NOT NULL,
  `phone_no` varchar(30) NOT NULL,
  `h_lic_no` varchar(30) NOT NULL,
  `appoinment_date` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `permision` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl`
--

INSERT INTO `tbl` (`name`, `age`, `phone_no`, `h_lic_no`, `appoinment_date`, `address`, `permision`) VALUES
('', '', '', '', '', '', ''),
('sadasdsdsada', 'sada', 'sadas', 'sadsa', 'adA', 'SAD', 'dsad'),
('', '', '', '', '', '', ''),
('', '', '', '', '', '', ''),
('', '', '', '', '', '', ''),
('nitish', '11', '7477022336', 'shradha', '2/4/17', 'bhopal', 'granted');

-- --------------------------------------------------------

--
-- Table structure for table `tblapp`
--

CREATE TABLE `tblapp` (
  `name` varchar(20) NOT NULL,
  `age` varchar(20) NOT NULL,
  `phone_no` varchar(20) NOT NULL,
  `h_lic_no` varchar(20) NOT NULL,
  `appoinment_date` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
  `permision` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblapp`
--

INSERT INTO `tblapp` (`name`, `age`, `phone_no`, `h_lic_no`, `appoinment_date`, `address`, `permision`) VALUES
('', '', '', '', '', '', ''),
('chandan', '18', '80854298', '115ds', '12/02/1998', 'gandhi nagar', 'yes'),
('venu', '20', '987654300', '7654', 'eye', 'bhopal', 'yes'),
('venu', '20', '987654300', '7654', 'eye', 'bhopal', 'yes');

-- --------------------------------------------------------

--
-- Table structure for table `tbldoc`
--

CREATE TABLE `tbldoc` (
  `license` varchar(20) NOT NULL,
  `doctorid` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `emailid` varchar(20) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `specilization` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbldoc`
--

INSERT INTO `tbldoc` (`license`, `doctorid`, `name`, `emailid`, `mobile`, `specilization`) VALUES
('', '', '', '', '', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', '', '', '', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', 'deepak', '', '885429843', ''),
('', '', '', '', '', ''),
('11566', '156e', '1151e', 'deepakcse31@gmail.co', '8085429843', 'eye'),
('', '', '', '', '', ''),
('', '', '', '', '', ''),
('', '', '', '', '', ''),
('', '', '', '', '', ''),
('09876', 'venu123', 'venu', 'venu@123', '987654320', 'eye');

-- --------------------------------------------------------

--
-- Table structure for table `tblhos`
--

CREATE TABLE `tblhos` (
  `name` varchar(20) NOT NULL,
  `licence` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `state` varchar(20) NOT NULL,
  `district` varchar(20) NOT NULL,
  `pin_code` varchar(30) NOT NULL,
  `phone_no` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `owner` varchar(20) NOT NULL,
  `std_year` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblhos`
--

INSERT INTO `tblhos` (`name`, `licence`, `email`, `state`, `district`, `pin_code`, `phone_no`, `password`, `owner`, `std_year`) VALUES
('', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', ''),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('', '', '', '', '', '', '', '', '', ''),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', ''),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4'),
('deepak', 'kumar', 'deepakcse31@gmail.co', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4');

-- --------------------------------------------------------

--
-- Table structure for table `tblhosp`
--

CREATE TABLE `tblhosp` (
  `name` varchar(20) NOT NULL,
  `licence` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
  `state` varchar(20) NOT NULL,
  `district` varchar(30) NOT NULL,
  `pin_code` varchar(20) NOT NULL,
  `phone_no` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `owner` varchar(20) NOT NULL,
  `std_year` varchar(20) NOT NULL,
  `q1` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblhosp`
--

INSERT INTO `tblhosp` (`name`, `licence`, `email`, `address`, `state`, `district`, `pin_code`, `phone_no`, `password`, `owner`, `std_year`, `q1`) VALUES
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('deepak', 'kumar', 'deepakcse31@gmail.co', '', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4', ''),
('deepak', 'kumar', 'deepakcse31@gmail.co', '', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('deepak', '154f', 'deepakcse31@gmail.co', 'rampur bhikhari', 'bihar', 'munger', '811201', '8085429843', '12345', 'me', '4', ''),
('shivanu', '454', 'shivanu@abc', 'hggugh', 'fdfd', 'fgdgdf', '4342', '43243564643', '12345', 'dtrrt', 'trsere', ''),
('pooja hospital', '20202', 'poojacse@123', 'bhopal', 'mp', 'bhopal', '12345', '123456789', '12345', 'pooja', '2019', ''),
('shradha hospital', '0987', 'shradha@123', 'bhopal', 'mp', 'bhoapl', '66666', '987654321', '12345', 'shradha', '2019', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('pooja', '12345', 'pooja@123', 'bhopal', 'bhopal', 'bhopal', '12345', '123456789', '12345', 'pooja', '2019', ''),
('pooja', '12345', 'pooja@123', 'bhopal', 'bhopal', 'bhopal', '12345', '123456789', '12345', 'pooja', '2019', ''),
('pooja', '12345', 'pooja@123', 'bhopal', 'bhopal', 'bhopal', '12345', '123456789', '12345', 'pooja', '2019', ''),
('pooja', '12345', 'pooja@123', 'bhopal', 'bhopal', 'bhopal', '12345', '123456789', '12345', 'pooja', '2019', ''),
('pooja', '12345', 'pooja@123', 'bhopal', 'bhopal', 'bhopal', '12345', '123456789', '12345', 'pooja', '2019', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('pooja', '12345', 'pooja@123', 'bhopal', 'bhopal', 'bhopal', '12345', '123456789', '12345', 'pooja', '2019', ''),
('pooja', '12345', 'pooja@123', 'bhopal', 'bhopal', 'bhopal', '12345', '123456789', '12345', 'pooja', '2019', ''),
('pooja', '12345', 'pooja@123', 'bhopal', 'bhopal', 'bhopal', '12345', '123456789', '12345', 'pooja', '2019', ''),
('pooja', '12345', 'pooja@123', 'bhopal', 'bhopal', 'bhopal', '12345', '123456789', '12345', 'pooja', '2019', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('nitish', '4586', 'nitish@gmail.com', 'gandhinagar', 'bihar', 'saran', '841301', '147852369', '420325', 'pooja', '1857', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('nitish', '4586', 'nitish@gmail.com', 'gandhinagar', 'bihar', 'saran', '841301', '147852369', '420325', 'pooja', '1857', ''),
('nitish', '4586', 'nitish@gmail.com', 'gandhinagar', 'bihar', 'saran', '841301', '147852369', '420325', 'pooja', '1857', ''),
('nitish', '4586', 'nitish@gmail.com', 'gandhinagar', 'bihar', 'saran', '841301', '147852369', '420325', 'pooja', '1857', ''),
('nitish', '4586', 'nitish@gmail.com', 'gandhinagar', 'bihar', 'saran', '841301', '147852369', '420325', 'pooja', '1857', ''),
('nitish', '4586', 'nitish@gmail.com', 'gandhinagar', 'bihar', 'saran', '841301', '147852369', '420325', 'pooja', '1857', ''),
('nitish', '4586', 'nitish@gmail.com', 'gandhinagar', 'bihar', 'saran', '841301', '147852369', '420325', 'pooja', '1857', ''),
('nitish', '4586', 'nitish@gmail.com', 'gandhinagar', 'bihar', 'saran', '841301', '147852369', '420325', 'pooja', '1857', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
