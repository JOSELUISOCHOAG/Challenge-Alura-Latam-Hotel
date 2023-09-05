package com.alura.latam.hotel.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

import com.alura.latam.hotel.modelo.Cliente;

public class ClienteDao {

	private Connection conDB;
	
	public ClienteDao(Connection conDB) {
		this.conDB = conDB;
		// TODO Auto-generated constructor stub
	}

	public void guardar(Cliente cliente) {
		try {
			String sqlQuery = "INSERT INTO clientes (cli_dni, cli_nombre, cli_apellido, cli_fechaNac, cli_nacion, cli_telefono, cli_reserva) VALUES (?,?, ?, ?, ?,?,?)";

			try (PreparedStatement pstm = conDB.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS)) {

				pstm.setString(1, cliente.getCli_dni());
				pstm.setString(2, cliente.getCli_nombre());
				pstm.setString(3, cliente.getCli_apellido());
				pstm.setDate(4, ( cliente.getCli_fechaNac()));
				pstm.setString(5, cliente.getCli_nacion());
				pstm.setString(6, cliente.getCli_telefono());
				pstm.setInt(7, 0);

				pstm.execute();
				
				try (ResultSet rst = pstm.getGeneratedKeys()) {
					while (rst.next()) {
						cliente.setCli_id(rst.getInt(1));
					}
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		// TODO Auto-generated method stub
		
	}

	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> buscarId(String idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	public void Actualizar(String nombre, String apellido, LocalDate fechaN, String nacionalidad, String telefono,
			Integer idReserva, Integer idCliente) {
		// TODO Auto-generated method stub
		
	}

	public void Eliminar(Integer idCliente) {
		// TODO Auto-generated method stub
		
	}

}
