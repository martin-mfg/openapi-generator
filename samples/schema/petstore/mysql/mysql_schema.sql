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
  `myOnlyProperty` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='dummy';

--
-- Table structure for table `Node` generated from model 'Node'
-- dummy
--

CREATE TABLE IF NOT EXISTS `Node` (
  `left` TEXT DEFAULT NULL,
  `right` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='dummy';

--
-- Table structure for table `OtherObject` generated from model 'OtherObject'
-- dummy
--

CREATE TABLE IF NOT EXISTS `OtherObject` (
  `myOnlyProperty2` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='dummy';


