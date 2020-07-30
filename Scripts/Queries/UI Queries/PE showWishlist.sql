DROP procedure IF EXISTS `showWishList`;


DELIMITER $$


USE `pe`$$


CREATE procedure `showWishList` (pid_person INT)


BEGIN

select name, Description, year, Price

from pr.product a

join wishlist_has_product b

on a.id_product = b.id_product

join person c

on c.id_wishlist = b.id_wishlist

where pid_person = c.identification;


END$$
