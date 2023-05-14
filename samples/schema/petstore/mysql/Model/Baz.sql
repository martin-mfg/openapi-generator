--
-- OpenAPI Petstore.
-- Prepared SQL queries for 'Baz' definition.
--


--
-- SELECT template for table `Baz`
--
SELECT `innerBaz` FROM `Baz` WHERE 1;

--
-- INSERT template for table `Baz`
--
INSERT INTO `Baz`(`innerBaz`) VALUES (?);

--
-- UPDATE template for table `Baz`
--
UPDATE `Baz` SET `innerBaz` = ? WHERE 1;

--
-- DELETE template for table `Baz`
--
DELETE FROM `Baz` WHERE 0;

