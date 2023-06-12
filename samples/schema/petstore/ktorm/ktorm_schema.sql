

-- --------------------------------------------------------------------------
-- Table structure for table `ExampleResponse` generated from model 'exampleResponse'
-- 
--

CREATE TABLE IF NOT EXISTS `ExampleResponse` (
);  /**/

-- --------------------------------------------------------------------------
-- Table structure for table `ExampleResponseMyOnlyProperty` generated from model 'ExampleResponseMyOnlyProperty'

CREATE TABLE IF NOT EXISTS `ExampleResponseMyOnlyProperty` (
  `exampleResponse` long NOT NULL
  `myOnlyProperty` boolean NOT NULL
);



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
