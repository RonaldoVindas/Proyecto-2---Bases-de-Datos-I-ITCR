DROP procedure IF EXISTS `TopExpensiveSells`;


DELIMITER $$

USE `pr`$$

CREATE procedure `TopExpensiveSells` ()


BEGIN
select a.id_product, a.name, a.price
from product a
join pe.shopping_log_has_product b
on a.id_product = b.id_product
where b.creation_date= Curdate()
order by price desc
limit 10;
end$$