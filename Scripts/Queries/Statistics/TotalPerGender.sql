DROP procedure IF EXISTS `TotalPerGender`;


DELIMITER $$

USE `pe`$$

CREATE procedure `TotalPerGender` ()

BEGIN
select sum(d.price), b.name
from person a
join genre b
on a.id_genre = b.id_genre
join person_sell_product c
on a.identification = c.id_person
join pr.product d 
on c.id_product = d.id_product
group by a.id_genre;
END$$