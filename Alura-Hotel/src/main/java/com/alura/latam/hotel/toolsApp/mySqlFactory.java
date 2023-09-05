package com.alura.latam.hotel.toolsApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mySqlFactory {

	// private Connection conDB;

	public Connection conectar() throws SQLException {
		Connection conDB = DriverManager.getConnection(
				"jdbc:mysql://localhost:3307/alura_hotel?useTimeZone=true&serverTimeZone=UTC"
				, "root"
				, "Soporte1");
		// this.conDB = setConexion();
		System.out.println("se abrio la conexion..!");
		return conDB;

//			System.out.println("no se logro conectar");

	}

	public Connection setConexion() {
		try {
			Connection conDB = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/alura_hotel?useTimeZone=true&serverTimeZone=UTC", "root", "Soporte1");
			System.out.println("se abrio la conexion..!");
			return conDB;
		} catch (SQLException e) {
			System.out.println("no se logro conectar");
			throw new RuntimeException(e);
		}

	}

}
