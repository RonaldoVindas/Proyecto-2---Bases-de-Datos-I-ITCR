DROP procedure IF EXISTS `get_binnacle_MaxId`;

DELIMITER $$
USE `pr`$$
CREATE PROCEDURE `get_binnacle_MaxId` (
)
BEGIN

DECLARE EXIT HANDLER FOR 1062 SELECT 'Duplicate keys error encountered.' Message;
DECLARE EXIT HANDLER FOR 1105 SELECT 'Unknown error encountered.' Message;
DECLARE EXIT HANDLER FOR 1172 SELECT 'Result consisted of more than one row.' Message;
DECLARE EXIT HANDLER FOR 1176 SELECT 'Key does not exist.' Message;
DECLARE EXIT HANDLER FOR 1231 SELECT 'Variable cannot be set to that value.' Message;
DECLARE EXIT HANDLER FOR 1232 SELECT 'Incorrect argument type to variable.' Message;


	select max(id_product_binnacle)
    from product_binnacle;
END$$

DELIMITER ;