USE alura_hotel;
DROP TABLE  IF EXISTS usuarios;
CREATE TABLE `usuarios` (
  `IdUser` INT NOT NULL AUTO_INCREMENT,
  `NombreUser` VARCHAR(45) NOT NULL,
  `ClaveUser` VARCHAR(50) NULL,
  PRIMARY KEY (`IdUser`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = 'Usuarios del sistema de reservas';
INSERT INTO usuarios (`NombreUser`,`ClaveUser`)
VALUES ('admin','admin');
