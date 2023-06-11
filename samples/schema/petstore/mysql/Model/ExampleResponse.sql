--
-- Some example.
-- Prepared SQL queries for 'ExampleResponse' definition.
--


--
-- SELECT template for table `ExampleResponse`
--
SELECT `myOnlyProperty` FROM `ExampleResponse` WHERE 1;

--
-- INSERT template for table `ExampleResponse`
--
INSERT INTO `ExampleResponse`(`myOnlyProperty`) VALUES (?);

--
-- UPDATE template for table `ExampleResponse`
--
UPDATE `ExampleResponse` SET `myOnlyProperty` = ? WHERE 1;

--
-- DELETE template for table `ExampleResponse`
--
DELETE FROM `ExampleResponse` WHERE 0;

