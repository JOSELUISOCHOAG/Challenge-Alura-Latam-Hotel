create database if not exists alura_hotel 
DEFAULT CHARACTER SET utf8mb4
COLLATE utf8mb4_general_ci;

use alura_hotel;

drop table if exists reservas;
drop table if exists clientes; 
drop table if exists paises;
drop table if exists usuarios;

CREATE TABLE `alura_hotel`.`paises` (
  `nac_id` INT UNIQUE AUTO_INCREMENT ,
  `nac_pais` varchar(30) NOT NULL PRIMARY KEY)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
COMMENT = 'Tabla de PAISES hotel. Alura, Challenge G5 JAVA-MYSQL';

CREATE TABLE `alura_hotel`.`clientes` (
  `cli_id` INT NOT NULL AUTO_INCREMENT,
  `cli_dni` VARCHAR(20) NOT NULL,
  `cli_nombre` VARCHAR(100) NOT NULL,
  `cli_apellido` VARCHAR(45) NOT NULL,
  `cli_fechaNac` DATE,
  `cli_nacion` varchar(30),
  `cli_telefono` varchar(20),
  `cli_reserva` int,
  PRIMARY KEY (`cli_id`),
  FOREIGN KEY (`cli_nacion`) REFERENCES `paises`(`nac_pais`) ON DELETE SET NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
COMMENT = 'Tabla Clientes/Huespedes. Alura, Challenge G5 JAVA-MYSQL';

CREATE TABLE `alura_hotel`.`reservas` (
  `res_id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `res_cliente` INT NOT NULL,
  `res_entrada` DATE NULL,
  `res_salida` DATE NULL,
  `res_valor` DOUBLE NULL,
  `res_formaPago` VARCHAR(45) NULL,
  FOREIGN KEY (res_cliente) REFERENCES clientes(cli_id) ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
COMMENT = 'Tabla de reservas hotel. Alura, Challenge G5 JAVA-MYSQL';

CREATE TABLE `alura_hotel`.`usuarios` (
  `ope_id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `ope_nombre` INT NOT NULL,
  `ope_clave` varchar(25) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
COMMENT = 'Tabla de USUARIOS hotel. Alura, Challenge G5 JAVA-MYSQL';

