DROP procedure IF EXISTS `TopRatedUsers`;


DELIMITER $$

USE `pr`$$

CREATE procedure `TopRatedUsers` ()


BEGIN
select a.first_name, a.last_name, sum(calification)/count(1) as average
from person a
join person_review_person b
on a.identification = b.id_person_receiver
group by a.identification 
order by average desc 
limit 5;
end$$