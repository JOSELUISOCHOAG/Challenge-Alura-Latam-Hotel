package com.alura.latam.hotel.prueba;

import java.sql.SQLException;
import java.util.List;

import com.alura.latam.hotel.controller.NacionalidadController;

public class PruebaListarNacionalidad {

	public static void main(String[] args) throws SQLException {
		
		NacionalidadController entidad = new NacionalidadController();
		
		System.out.println("Cargando Nacionalidad");
		
		entidad.cargarNacionalidad();
		
		List<String> listado = entidad.listarNacionalidad();
		
		for (String string : listado) {
			System.out.println(string);
		}
	}
}
