package com.alura.latam.hotel.controller;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.alura.latam.hotel.dao.NacionalidadDao;
import com.alura.latam.hotel.toolsApp.mySqlFactory;

public class NacionalidadController {

	private NacionalidadDao nacionDao;

	public NacionalidadController() throws SQLException  {
		
		System.out.println("instanciando controller de nacion");
		
		Connection conDB = new mySqlFactory().conectar();
		
		this.nacionDao = new NacionalidadDao(conDB);
		
	}

	public List<String> listarNacionalidad() {

		return this.nacionDao.listarNacionalidad();
	}
	
	public void cargarNacionalidad() {
		this.nacionDao.cargarNacionalidad();
	}

}