package com.alura.latam.hotel.prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion01 {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "Soporte1");

        System.out.println("Cerrando la conexión");

        con.close();
		System.out.println("Hola Mundo Cruel");
	}
	
}
