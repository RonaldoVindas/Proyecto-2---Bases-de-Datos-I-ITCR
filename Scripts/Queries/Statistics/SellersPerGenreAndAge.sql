DROP procedure IF EXISTS `sellersPerGenderAndAge`;


DELIMITER $$

USE `pe`$$

CREATE procedure `sellersPerGenderAndAge` (date1 date, date2 date)


BEGIN
select	count(a.identification) as cantidad, YEAR(CURDATE()) - YEAR(a.birth_day) AS age, b.name 
from person a
join person_sell_product 
on person.identification = person_sell_product.id_person
join genre b
on person.id_genre = genre.id_genre
group by person.id_genre and age< date2 and age>date1;
END$$
