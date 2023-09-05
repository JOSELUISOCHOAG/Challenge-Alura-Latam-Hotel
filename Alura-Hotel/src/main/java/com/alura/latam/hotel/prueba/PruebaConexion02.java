package com.alura.latam.hotel.prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.alura.latam.hotel.toolsApp.mySqlFactory;

public class PruebaConexion02 {

	public static void main(String[] args) throws SQLException {
	
		Connection conDb = new mySqlFactory().setConexion();
		
        System.out.println("Cerrando la conexión");

        conDb.close();
		System.out.println("Hola Mundo Cruel");
	}
	
}
