

-- --------------------------------------------------------------------------
-- Table structure for table `ExampleResponse` generated from model 'exampleResponse'
-- dummy
--

CREATE TABLE IF NOT EXISTS `ExampleResponse` (
  `myOnlyProperty` long
);  /*dummy*/


-- --------------------------------------------------------------------------
-- Table structure for table `Node` generated from model 'node'
-- dummy
--

CREATE TABLE IF NOT EXISTS `Node` (
  `left` long,
  `right` long
);  /*dummy*/


-- --------------------------------------------------------------------------
-- Table structure for table `OtherObject` generated from model 'otherObject'
-- dummy
--

CREATE TABLE IF NOT EXISTS `OtherObject` (
  `myOnlyProperty2` long
);  /*dummy*/



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
