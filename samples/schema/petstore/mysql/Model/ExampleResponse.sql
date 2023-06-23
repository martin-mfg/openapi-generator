--
-- dummy.
-- Prepared SQL queries for 'ExampleResponse' definition.
--


--
-- SELECT template for table `ExampleResponse`
--
SELECT `emptyString`, `numberString`, `boolString`, `nullString`, `aBool`, `zero` FROM `ExampleResponse` WHERE 1;

--
-- INSERT template for table `ExampleResponse`
--
INSERT INTO `ExampleResponse`(`emptyString`, `numberString`, `boolString`, `nullString`, `aBool`, `zero`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ExampleResponse`
--
UPDATE `ExampleResponse` SET `emptyString` = ?, `numberString` = ?, `boolString` = ?, `nullString` = ?, `aBool` = ?, `zero` = ? WHERE 1;

--
-- DELETE template for table `ExampleResponse`
--
DELETE FROM `ExampleResponse` WHERE 0;

