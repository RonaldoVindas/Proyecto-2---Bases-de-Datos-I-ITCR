DROP procedure IF EXISTS `sellsPerGender`;


DELIMITER $$

USE `pe`$$

CREATE procedure `sellsPerGender` ()

BEGIN
select count(a.identificantion), b.name
from person a
join genre b
on a.id_genre = b.id_gen
join person_sell_product c
on a.indentification = c.id_person
group by a.id_genre;
END$$