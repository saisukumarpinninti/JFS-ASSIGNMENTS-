-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 15, 2022 at 06:00 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employeeid` int(11) NOT NULL,
  `employeeName` text NOT NULL,
  `employeeDepartment` text NOT NULL,
  `employeeDesignation` text NOT NULL,
  `employeeSalary` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employeeid`, `employeeName`, `employeeDepartment`, `employeeDesignation`, `employeeSalary`) VALUES
(1, 'sai', 'cse', 'student', 0),
(2, 'SASHWAT BHARDWAJ', 'ece', 'student', 0),
(3, 'Siddhant Salgia', 'cse', 'intern', 2),
(4, 'Vamsi Krishna Oruganti', 'it', 'student', 4),
(5, 'Varun Maheshwari', 'eee', 'developer', 6),
(6, 'Nikhil Pandey', 'mech', 'intern', 8),
(7, 'Sravan Mikkilineni', 'eee', 'student', 10),
(8, 'Madaparthi harshavardhan', 'mech', 'intern', 12),
(9, 'Madhu satya kiran Manepalli', 'cse', 'student', 14),
(10, 'Malavikka Sokkalingam', 'it', 'developer', 16),
(11, 'POONGUZHALI A', 'eee', 'intern', 18),
(12, 'Pottabathula Hruthik Shiva', 'it', 'student', 20),
(13, 'Gudipati yaswanth', 'ece', 'intern', 22),
(14, 'Kothuri Srija', 'cse', 'student', 24),
(15, 'Kriti Dhaulakhandi', 'it', 'developer', 26),
(16, 'Prajwal Bisht', 'eee', 'intern', 28),
(17, 'R Nusair Basha', 'mech', 'student', 30),
(18, 'SHAIK MOHSIN S', 'eee', 'intern', 32),
(19, 'SYuvan karthick', 'mech', 'student', 34),
(20, 'Mujahid Hussain Khan', 'cse', 'developer', 36),
(21, 'Polisetty. Bala Vamsi Gupta', 'it', 'intern', 38),
(22, 'Pulkit Chauhan', 'eee', 'student', 40),
(23, 'Sai Venkata Anirudh Tallavajhula', 'it', 'intern', 42),
(24, 'Swathy Gopal N', 'ece', 'student', 44),
(25, 'Neha Bhatt', 'cse', 'developer', 46),
(26, 'RISHABH GANGWAR', 'it', 'intern', 48),
(27, 'Sarthak Ahluwalia', 'eee', 'student', 50),
(28, 'Spandan Kapil', 'mech', 'intern', 52),
(29, 'Tarun Krishna Khunteta', 'eee', 'student', 54),
(30, 'Karanam Rohit Chowdari', 'mech', 'developer', 56),
(31, 'Kovvuri venkata satya manikanta reddy', 'cse', 'intern', 58),
(32, 'SEEDRALA VENKATA SAI SRI GANESH', 'it', 'student', 60),
(33, 'Sri Shashank Mandava', 'eee', 'intern', 62),
(34, 'K.subhash chowdary', 'it', 'student', 64),
(35, 'Milind Manoj Nair', 'ece', 'developer', 66),
(36, 'priyanshi singh', 'cse', 'intern', 68),
(37, 'RAVI KUMAR', 'it', 'student', 70),
(38, 'Shivansh Kumar', 'eee', 'intern', 72),
(39, 'Sourav Kumar kuila', 'mech', 'student', 74);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employeeid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `employeeid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
