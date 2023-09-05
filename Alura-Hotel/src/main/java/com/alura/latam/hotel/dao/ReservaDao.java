package com.alura.latam.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

import com.alura.latam.hotel.modelo.Reserva;

public class ReservaDao {
	
	private Connection conDB;

	public ReservaDao(Connection conDB) {
		this.conDB = conDB;
	}

	public void guardar(Reserva reserva) {
		try {
			String sqlQuery = "INSERT INTO reservas (res_cliente, res_entrada, res_salida, res_valor, res_formaPago) VALUES ( ?, ?, ?, ?, ?)";

			try (PreparedStatement pstm = conDB.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS)) {

				pstm.setInt(1, 1);
				pstm.setDate(2, reserva.getRes_entrada());
				pstm.setDate(3, reserva.getRes_salida());
				pstm.setDouble(4, ( reserva.getRes_valor()));
				pstm.setString(5, reserva.getRes_fomaPago());
				
				pstm.execute();
				System.out.println("dasdasda");
				try (ResultSet rst = pstm.getGeneratedKeys()) {
					while (rst.next()) {
						reserva.setRes_id(rst.getInt(1));
					}
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		// TODO Auto-generated method stub
		

	}

	public List<Reserva> buscar() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Reserva> buscarId(String idReserva) {
		// TODO Auto-generated method stub
		return null;
	}

	public void Actualizar(LocalDate fechaE, LocalDate fechaS, String valor, String formaPago, Integer idReserva) {
		// TODO Auto-generated method stub
		
	}

	public void Eliminar(Integer idReserva) {
		// TODO Auto-generated method stub
		
	}

}
