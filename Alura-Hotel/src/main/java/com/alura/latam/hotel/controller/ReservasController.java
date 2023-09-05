package com.alura.latam.hotel.controller;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import com.alura.latam.hotel.dao.ReservaDao;
import com.alura.latam.hotel.modelo.Reserva;
import com.alura.latam.hotel.toolsApp.mySqlFactory;

public class ReservasController {

	private ReservaDao reservaDao;

	public ReservasController() {
		Connection conDB = new mySqlFactory().setConexion();
		this.reservaDao = new ReservaDao(conDB);
	}

	public void guardar(Reserva reserva) {
		this.reservaDao.guardar(reserva);
	}

	public List<Reserva> buscar() {
		return this.reservaDao.buscar();
	}

	public List<Reserva> buscarId(String idReserva) {
		return this.reservaDao.buscarId(idReserva);
	}

	public void actualizar(LocalDate fechaE, LocalDate fechaS, String valor, String formaPago, Integer idReserva) {
		this.reservaDao.Actualizar(fechaE, fechaS, valor, formaPago, idReserva);
	}

	public void Eliminar(Integer idReserva) {
		this.reservaDao.Eliminar(idReserva);
	}

}
