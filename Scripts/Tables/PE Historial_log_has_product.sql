CREATE TABLE `pe`.`historial_log_has_product` (
/*Author: Ronaldo Vindas B 2018238697*/

/*================= COLUMNAS ====================================*/

  `id_historial_log` INT NOT NULL COMMENT 'historial_log identifiction.',
  `id_product` INT NOT NULL COMMENT 'Product identification.',
  `Last_view` INT NULL COMMENT 'Quantity of products in the shopping cart.',

/*================ CAMPOS DE AUDITORÍA ==========================*/ 

  `creation_date` DATE NULL COMMENT 'Date in which the entry was made.',
  `creation_user` VARCHAR(45) NULL COMMENT 'User who created the entry.',
  `date_last_modification` DATE NULL COMMENT 'Date in which the entry was updated.',
  `user_last_modification` VARCHAR(45) NULL COMMENT 'Last user who updated the entry.',

/*================ LLAVES =======================================*/

  PRIMARY KEY (`id_historial_log`, `id_product`),
  INDEX `fk_historial_log_has_product_id_product_idx` (`id_product` ASC) VISIBLE,
  CONSTRAINT `fk_historial_logt_has_product_id_historial_log`
    FOREIGN KEY (`id_historial_log`)
    REFERENCES `pe`.`historial_log` (`id_historial_log`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_historial_log_has_product_id_product`
    FOREIGN KEY (`id_product`)
    REFERENCES `pr`.`product` (`id_product`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
COMMENT = 'Repository to storage the information about the products.';

/*================ TRIGGERS =======================================*/

DROP TRIGGER IF EXISTS `pe`.`historial_log_has_product_BEFORE_INSERT`;

DELIMITER $$
USE `pe`$$
CREATE DEFINER = CURRENT_USER TRIGGER `pe`.`historial_log_has_product_BEFORE_INSERT` BEFORE INSERT ON `historial_log_has_product` FOR EACH ROW
BEGIN
IF NEW.creation_date IS NULL OR NEW.creation_user IS NULL THEN 
		SET NEW.creation_date = CURDATE();
        SET NEW.creation_user = SYSTEM_USER();
	END IF;
END$$
DELIMITER ;
DROP TRIGGER IF EXISTS `pe`.`historial_log_has_product_BEFORE_UPDATE`;

DELIMITER $$
USE `pe`$$
CREATE DEFINER = CURRENT_USER TRIGGER `pe`.`historial_log_has_product_BEFORE_UPDATE` BEFORE UPDATE ON `historial_log_has_product` FOR EACH ROW
BEGIN
IF NEW.date_last_modification IS NULL OR NEW.user_last_modification IS NULL THEN
		SET NEW.date_last_modification = CURDATE();
        SET NEW.user_last_modification = SYSTEM_USER();
		
	END IF;
END$$
DELIMITER ;

