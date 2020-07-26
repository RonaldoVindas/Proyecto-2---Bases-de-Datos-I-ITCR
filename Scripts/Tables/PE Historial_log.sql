CREATE TABLE `pe`.`historial_log` (
/*Author: Jose Andres Blanco*/

/*================= COLUMNAS ====================================*/	

  `id_historial_log` INT NOT NULL AUTO_INCREMENT COMMENT 'historial_log identifiction.',
 
 
/*================ CAMPOS DE AUDITORÍA ==========================*/ 

 `creation_date` DATE NULL COMMENT 'Date in which the entry was made.',
  `creation_user` VARCHAR(45) NULL COMMENT 'User who created the entry.',
  `date_last_modification` DATE NULL COMMENT 'Date in which the entry was updated.',
  `user_last_modification` VARCHAR(45) NULL COMMENT 'Last user who updated the entry.',
  PRIMARY KEY (`id_historial_log`),
  UNIQUE INDEX `id_historial_log_UNIQUE` (`id_historial_log` ASC) VISIBLE)
COMMENT = 'Repository to storage information regarding Person´s historial_log.';

/*================ LLAVES =======================================*/

DROP TRIGGER IF EXISTS `pe`.`historial_log_BEFORE_INSERT`;

DELIMITER $$
USE `pe`$$
CREATE DEFINER = CURRENT_USER TRIGGER `pe`.`historial_log_BEFORE_INSERT` BEFORE INSERT ON `historial_log` FOR EACH ROW
BEGIN
IF NEW.creation_date IS NULL OR NEW.creation_user IS NULL THEN 
		SET NEW.creation_date = CURDATE();
        SET NEW.creation_user = SYSTEM_USER();
	END IF;
END$$
DELIMITER ;
DROP TRIGGER IF EXISTS `pe`.`historial_log_BEFORE_UPDATE`;

DELIMITER $$
USE `pe`$$
CREATE DEFINER = CURRENT_USER TRIGGER `pe`.`historial_log_BEFORE_UPDATE` BEFORE UPDATE ON `historial_log` FOR EACH ROW
BEGIN
IF NEW.date_last_modification IS NULL OR NEW.user_last_modification IS NULL THEN
		SET NEW.date_last_modification = CURDATE();
        SET NEW.user_last_modification = SYSTEM_USER();
		
	END IF;
END$$
DELIMITER ;
