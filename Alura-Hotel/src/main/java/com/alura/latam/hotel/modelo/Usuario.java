package com.alura.latam.hotel.modelo;

public class Usuario {

	private Integer usuario_id;
	private String usuario_nombre;
	private String usuario_clave;
	
	public Usuario() {
	}
	
	public Usuario(Integer usuario_id, String usuario_nombre, String usuario_clave) {
		this.usuario_id = usuario_id;
		this.usuario_nombre = usuario_nombre;
		this.usuario_clave = usuario_clave;
	}

	public String getUsuario_nombre() {
		return usuario_nombre;
	}

	public void setUsuario_nombre(String usuario_nombre) {
		this.usuario_nombre = usuario_nombre;
	}

	public String getUsuario_clave() {
		return usuario_clave;
	}

	public void setUsuario_clave(String usuario_clave) {
		this.usuario_clave = usuario_clave;
	}

	public Integer getUsuario_id() {
		return usuario_id;
	}
	
	
	
}
