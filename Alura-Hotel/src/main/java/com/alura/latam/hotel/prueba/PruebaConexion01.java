package com.alura.latam.hotel.prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion01 {

	public static void main(String[] args) {
		Connection conDB;
		try {
			conDB = DriverManager.getConnection(
					// driver + url de la conexion
			        "jdbc:mysql://localhost:3307/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
			        // usuario de la base de datos
			        "root",
			        // contrasena de la base de datos
			        "Soporte1");

			System.out.println("Cerrando la conexión");
			conDB.close();
	        
		} catch (SQLException e) {
			System.out.println("Fallo la Conexion + "+e);
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}

        
		System.out.println("Hola Mundo Cruel");
	}
	
}
