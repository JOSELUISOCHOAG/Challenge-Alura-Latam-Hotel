package com.alura.latam.hotel.controller;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import com.alura.latam.hotel.dao.ClienteDao;
import com.alura.latam.hotel.modelo.Cliente;
import com.alura.latam.hotel.toolsApp.mySqlFactory;

public class ClienteController {

	private ClienteDao clienteDao;

	public ClienteController() {
		Connection conDB = new mySqlFactory().setConexion();
		this.clienteDao = new ClienteDao(conDB);
	}

	public void guardar(Cliente cliente) {
		this.clienteDao.guardar(cliente);
	}

	public List<Cliente> listarClientes() {
		return this.clienteDao.listarClientes();
	}

	public List<Cliente> listarClientesId(Integer idCliente) {
		return this.clienteDao.buscarId(id);
	}

	public void actualizar(String nombre, String apellido, LocalDate fechaN, String nacionalidad, String telefono,
			Integer idReserva, Integer idCliente) {
		this.clienteDao.Actualizar(nombre, apellido, fechaN, nacionalidad, telefono, idReserva, idCliente);
	}

	public void Eliminar(Integer idCliente) {
		this.clienteDao.Eliminar(idCliente);
	}
}
