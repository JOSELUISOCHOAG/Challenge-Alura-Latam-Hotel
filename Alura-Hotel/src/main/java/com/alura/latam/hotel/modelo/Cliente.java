package com.alura.latam.hotel.modelo;

import java.sql.Date;

public class Cliente {

	private Integer cli_id;
	private String cli_dni;
	private String cli_nombre;
	private String cli_apellido;
	private Date cli_fechaNac;
	private String cli_nacion;
	private String cli_telefono;
	private Integer cli_reserva;
	
	public Cliente() {
	}
	
	public Cliente(String cli_dni, String cli_nombre, String cli_apellido, Date cli_fechaNac,
			String cli_nacion, String cli_telefono,Integer cli_reserva) {
		this.cli_dni = cli_dni;
		this.cli_nombre = cli_nombre;
		this.cli_apellido = cli_apellido;
		this.cli_fechaNac = cli_fechaNac;
		this.setCli_nacion(cli_nacion);
		this.cli_telefono = cli_telefono;
		this.setCli_reserva(cli_reserva);
	}

	public String getCli_dni() {
		return cli_dni;
	}

	public void setCli_dni(String cli_dni) {
		this.cli_dni = cli_dni;
	}

	public String getCli_nombre() {
		return cli_nombre;
	}

	public void setCli_nombre(String cli_nombre) {
		this.cli_nombre = cli_nombre;
	}

	public String getCli_apellido() {
		return cli_apellido;
	}

	public void setCli_apellido(String cli_apellido) {
		this.cli_apellido = cli_apellido;
	}

	public Date getCli_fechaNac() {
		return cli_fechaNac;
	}

	public void setCli_fechaNac(Date cli_fechaNac) {
		this.cli_fechaNac = cli_fechaNac;
	}

	public String getCli_telefono() {
		return cli_telefono;
	}

	public void setCli_telefono(String cli_telefono) {
		this.cli_telefono = cli_telefono;
	}

	public String getCli_nacion() {
		return cli_nacion;
	}

	public void setCli_nacion(String cli_nacion) {
		this.cli_nacion = cli_nacion;
	}

	public Integer getCli_reserva() {
		return cli_reserva;
	}

	public void setCli_reserva(Integer cli_reserva) {
		this.cli_reserva = cli_reserva;
	}

	public Integer getCli_id() {
		return cli_id;
	}

	public void setCli_id(Integer cli_id) {
		this.cli_id = cli_id;
	}
	
}
