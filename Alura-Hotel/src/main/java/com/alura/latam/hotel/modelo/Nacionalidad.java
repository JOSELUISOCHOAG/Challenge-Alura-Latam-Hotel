package com.alura.latam.hotel.modelo;

public class Nacionalidad {

	private Integer nacion_id;
	private String nacion_pais;
	
	public Nacionalidad() {

	}

	public Nacionalidad(String nacion_pais) {
		this.nacion_pais = nacion_pais;
	}

	public Nacionalidad(Integer nacion_id, String nacion_pais) {
		this.nacion_id = nacion_id;
		this.nacion_pais = nacion_pais;
	}

	public Integer getNacion_id() {
		return nacion_id;
	}

	public void setNacion_id(Integer nacion_id) {
		this.nacion_id = nacion_id;
	}

	public String getNacion_pais() {
		return nacion_pais;
	}

	public void setNacion_pais(String nacion_pais) {
		this.nacion_pais = nacion_pais;
	}

	@Override
	public String toString() {
		return "Nacionalidad [nacion_id=" + nacion_id + ", nacion_pais=" + nacion_pais + "]";
	}
	
}
