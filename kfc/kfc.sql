-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 17, 2023 at 08:08 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kfc`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_customer`
--

CREATE TABLE `tbl_customer` (
  `CustomerID` varchar(5) NOT NULL,
  `Firstname` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `PhoneNumber` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_customer`
--

INSERT INTO `tbl_customer` (`CustomerID`, `Firstname`, `LastName`, `PhoneNumber`) VALUES
('01', 'นพมาศ', 'ชานุเรือน', '0983203394'),
('02', 'เอกชัย', 'ถนอมเมือง', '0627830345'),
('03', 'วรรณนภา', 'ทองคำ', '0928788086');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_food`
--

CREATE TABLE `tbl_food` (
  `FoodID` varchar(3) NOT NULL,
  `FoodName` varchar(20) NOT NULL,
  `FoodDescription` varchar(300) NOT NULL,
  `FoodPrice` int(11) NOT NULL,
  `MenuID` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_food`
--

INSERT INTO `tbl_food` (`FoodID`, `FoodName`, `FoodDescription`, `FoodPrice`, `MenuID`) VALUES
('F01', 'ไก่ทอดสูตรผู้พัน', 'ไก่สดคัดพิเศษคลุกเคล้ากับเครื่องเทศ 11 ชนิด ปรุงสดใหม่ ทอดจนสุก เป็นไก่ทอดเนื้อนุ่มคลาสสิคสูตรต้นตำรับของเคเอฟซี', 37, '01'),
('F02', 'ไก่ฮอทแอนด์สไปซี่', 'ไก่สดคัดพิเศษชุบด้วยเกล็ดขนมปัง คลุกเคล้ากับผงพริกและเครื่องเทศ นำไปทอดจนสุกเหลืองกรอบหอมกรุ่นพร้อมเสริฟ์', 37, '01'),
('F03', 'ข้าวผู้พันแซ่บ', 'ข้าวแซ่บใหม่! อร่อยลงตัวขึ้นกับข้าวสูตรพิเศษที่หุงพร้อมเครื่องเทศ 11 ชนิด และยำไก่แซ่บรสจัดจ้าน', 69, '02'),
('F04', 'ข้าวผู้พันซี๊ด', 'ใหม่! อรอยซี๊ดลงตัวกว่าเดิมกับข้าวสูตรลับหุงด้วยเครื่องเทศ 11 ชนิด เสริฟ์พร้อมยำไก่ซี๊ดสูตรพิเศษ', 69, '02');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_menu`
--

CREATE TABLE `tbl_menu` (
  `MenuID` char(2) NOT NULL,
  `MenuName` varchar(90) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_menu`
--

INSERT INTO `tbl_menu` (`MenuID`, `MenuName`) VALUES
('01', 'ไก่'),
('02', 'ข้าวและโบว์ล'),
('03', 'เบอร์เกอร์'),
('04', 'ทานเล่น'),
('05', 'เครื่องเคียง');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `tbl_food`
--
ALTER TABLE `tbl_food`
  ADD PRIMARY KEY (`FoodID`),
  ADD KEY `PMR` (`MenuID`);

--
-- Indexes for table `tbl_menu`
--
ALTER TABLE `tbl_menu`
  ADD PRIMARY KEY (`MenuID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_food`
--
ALTER TABLE `tbl_food`
  ADD CONSTRAINT `PMR` FOREIGN KEY (`MenuID`) REFERENCES `tbl_menu` (`MenuID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
