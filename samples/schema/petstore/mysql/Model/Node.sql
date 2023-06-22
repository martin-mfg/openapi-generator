--
-- dummy.
-- Prepared SQL queries for 'Node' definition.
--


--
-- SELECT template for table `Node`
--
SELECT `left`, `right` FROM `Node` WHERE 1;

--
-- INSERT template for table `Node`
--
INSERT INTO `Node`(`left`, `right`) VALUES (?, ?);

--
-- UPDATE template for table `Node`
--
UPDATE `Node` SET `left` = ?, `right` = ? WHERE 1;

--
-- DELETE template for table `Node`
--
DELETE FROM `Node` WHERE 0;

