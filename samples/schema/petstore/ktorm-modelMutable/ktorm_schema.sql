

-- --------------------------------------------------------------------------
-- Table structure for table `dummy_200_response` generated from model 'dummy200Response'
--

CREATE TABLE IF NOT EXISTS `dummy_200_response` (
  `outerProp` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `dummy_200_response_outerProp` generated from model 'dummy200ResponseOuterProp'
--

CREATE TABLE IF NOT EXISTS `dummy_200_response_outerProp` (
  `innerProp` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `dummy_200_response_outerProp_innerProp` generated from model 'dummy200ResponseOuterPropInnerProp'
--

CREATE TABLE IF NOT EXISTS `dummy_200_response_outerProp_innerProp` (
  `myBool` boolean
); 


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
