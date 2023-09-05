use alura_hotel;
select * from reservas;
select * from huespedes;
INSERT INTO `alura_hotel`.`huespedes` 
(`Nombres`, `Apellidos`, `FechaNacimiento`, `Nacionalidad`, `Telefono`) 
VALUES ( 'jose1', 'GONZALEZ', '1976-03-05', 'ven', '01');
INSERT INTO `alura_hotel`.`huespedes` 
(`Nombres`, `Apellidos`, `FechaNacimiento`, `Nacionalidad`, `Telefono`) 
VALUES ( 'jose2', 'GONZALEZ', '1976-04-05', 'ven', '01');
INSERT INTO `alura_hotel`.`huespedes` 
(`Nombres`, `Apellidos`, `FechaNacimiento`, `Nacionalidad`, `Telefono`) 
VALUES ( 'jose3', 'GONZALEZ', '1976-05-05', 'ven', '01');
INSERT INTO `alura_hotel`.`huespedes` 
(`Nombres`, `Apellidos`, `FechaNacimiento`, `Nacionalidad`, `Telefono`) 
VALUES ( 'jose4', 'GONZALEZ', '1976-05-05', 'ven', '01');


INSERT INTO `alura_hotel`.`reservas` 
(`idHuesped`,`FechaEntrada`, `FechaSalida`, `Valor`, `FormaPago`) 
VALUES (1,'2023-08-20', '2023-08-25', '5', 'EFECTIVO');
INSERT INTO `alura_hotel`.`reservas` 
(`idHuesped`,`FechaEntrada`, `FechaSalida`, `Valor`, `FormaPago`) 
VALUES (2,'2023-08-20', '2023-08-25', '5', 'EFECTIVO');
INSERT INTO `alura_hotel`.`reservas` 
(`idHuesped`,`FechaEntrada`, `FechaSalida`, `Valor`, `FormaPago`) 
VALUES (1,'2023-08-20', '2023-08-25', '5', 'EFECTIVO');

select * from reservas;
select * from huespedes;
SELECT reservas.IdReserva, reservas.IdHuesped, huespedes.IdHuesped, FECHAENTRADA,FECHASALIDA, nombres  FROM reservas inner join huespedes on reservas.Idhuesped = huespedes.IdHuesped order by reservas.idhuesped;


