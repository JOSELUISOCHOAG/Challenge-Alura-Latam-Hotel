package com.alura.latam.hotel.toolsApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mySqlFactory {

	 public Connection recuperaConexion() throws SQLException {
	        return DriverManager.getConnection(
	                "jdbc:mysql://localhost:3307/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
	                "root",
	                "Soporte1");
	    }


}
