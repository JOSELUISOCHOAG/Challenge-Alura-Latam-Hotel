package com.alura.latam.hotel.modelo;

import java.sql.Date;

public class Reserva {

	private Integer res_id;	
	private Cliente res_cliente;
	private Date res_entrada;
	private Date res_salida;
	private Double res_valor;
	private String res_fomaPago;
	
	public Reserva() {
	}
	
	public Reserva(Date res_entrada, Date res_salida,Double res_valor, String res_fomaPago) {
		this.res_entrada = res_entrada;
		this.res_salida = res_salida;
		this.res_valor = res_valor;
		this.res_fomaPago = res_fomaPago;
	}
	
	public Reserva(Cliente res_cliente,Date res_entrada, Date res_salida,Double res_valor, String res_fomaPago) {
		this.res_cliente = res_cliente;
		this.res_entrada = res_entrada;
		this.res_salida = res_salida;
		this.res_valor = res_valor;
		this.res_fomaPago = res_fomaPago;
	}
	
	public Date getRes_entrada() {
		return res_entrada;
	}
	public void setRes_entrada(Date res_entrada) {
		this.res_entrada = res_entrada;
	}
	public Date getRes_salida() {
		return res_salida;
	}
	public void setRes_salida(Date res_salida) {
		this.res_salida = res_salida;
	}
	public Double getRes_valor() {
		return res_valor;
	}
	public void setRes_valor(Double res_valor) {
		this.res_valor = res_valor;
	}

	public String getRes_fomaPago() {
		return res_fomaPago;
	}
	public void setRes_fomaPago(String res_fomaPago) {
		this.res_fomaPago = res_fomaPago;
	}
	

	public Integer getRes_id() {
		return res_id;
	}

	public void setRes_id(Integer res_id) {
		this.res_id = res_id;
	}

	public Cliente getRes_cliente() {
		return res_cliente;
	}

	public void setRes_cliente(Cliente res_cliente) {
		this.res_cliente = res_cliente;
	}

	
}
