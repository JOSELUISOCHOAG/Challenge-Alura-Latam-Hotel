use alura_hotel;
drop table if exists reservas;

CREATE TABLE `alura_hotel`.`reservas` (
  `IdReserva` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `IdHuesped` INT NOT NULL,
  `FechaEntrada` DATE NULL,
  `FechaSalida` DATE NULL,
  `Valor` DOUBLE NULL,
  `FormaPago` VARCHAR(45) NULL,
  FOREIGN KEY (idHuesped) REFERENCES huespedes(idHuesped) ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
COMMENT = 'Tabla de reservas hotel alura';
