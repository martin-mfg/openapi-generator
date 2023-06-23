/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `dummy_200_response` generated from model 'dummyUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `dummy_200_response` (
  `outerProp` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `dummy_200_response_outerProp` generated from model 'dummyUnderscore200UnderscoreresponseUnderscoreouterProp'
--

CREATE TABLE IF NOT EXISTS `dummy_200_response_outerProp` (
  `innerProp` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `dummy_200_response_outerProp_innerProp` generated from model 'dummyUnderscore200UnderscoreresponseUnderscoreouterPropUnderscoreinnerProp'
--

CREATE TABLE IF NOT EXISTS `dummy_200_response_outerProp_innerProp` (
  `myBool` TINYINT(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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


