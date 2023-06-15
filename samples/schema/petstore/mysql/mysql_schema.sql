/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `ExampleResponse` generated from model 'ExampleResponse'
-- dummy
--

CREATE TABLE IF NOT EXISTS `ExampleResponse` (
  `emptyString` TEXT,
  `numberString` TEXT,
  `boolString` TEXT,
  `nullString` TEXT DEFAULT NULL,
  `aBool` TINYINT(1) DEFAULT false,
  `zero` INT DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='dummy';


