package com.alura.latam.hotel.modelo;

import java.time.LocalDate;

public class Cliente {

	private Integer cliente_id;
	private String cliente_dni;
	private String cliente_nombre;
	private String cliente_apellido;
	private LocalDate cliente_fechaNac;
	private Nacionalidad cliente_nacionalidad;
	private String cliente_telefono;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String cliente_dni, String cliente_nombre, String cliente_apellido, LocalDate cliente_fechaNac,
			Nacionalidad cliente_nacionalidad, String cliente_telefono) {
		this.cliente_dni = cliente_dni;
		this.cliente_nombre = cliente_nombre;
		this.cliente_apellido = cliente_apellido;
		this.cliente_fechaNac = cliente_fechaNac;
		this.cliente_nacionalidad = cliente_nacionalidad;
		this.cliente_telefono = cliente_telefono;
	}

	public String getCliente_dni() {
		return cliente_dni;
	}

	public void setCliente_dni(String cliente_dni) {
		this.cliente_dni = cliente_dni;
	}

	public String getCliente_nombre() {
		return cliente_nombre;
	}

	public void setCliente_nombre(String cliente_nombre) {
		this.cliente_nombre = cliente_nombre;
	}

	public String getCliente_apellido() {
		return cliente_apellido;
	}

	public void setCliente_apellido(String cliente_apellido) {
		this.cliente_apellido = cliente_apellido;
	}

	public LocalDate getCliente_fechaNac() {
		return cliente_fechaNac;
	}

	public void setCliente_fechaNac(LocalDate cliente_fechaNac) {
		this.cliente_fechaNac = cliente_fechaNac;
	}

	public String getCliente_telefono() {
		return cliente_telefono;
	}

	public void setCliente_telefono(String cliente_telefono) {
		this.cliente_telefono = cliente_telefono;
	}
	
}
