package com.alura.latam.hotel.modelo;

import java.time.LocalDate;

public class Reserva {

	private Integer reserva_id;
	private LocalDate reserva_entrada;
	private LocalDate reserva_salida;
	private Double reserva_valor;
	private String reserva_fomaPago;
	
	public Reserva() {
	}
	
	public Reserva(LocalDate reserva_entrada, LocalDate reserva_salida, String reserva_fomaPago) {
		this.reserva_entrada = reserva_entrada;
		this.reserva_salida = reserva_salida;
		this.reserva_fomaPago = reserva_fomaPago;
	}
	public LocalDate getReserva_entrada() {
		return reserva_entrada;
	}
	public void setReserva_entrada(LocalDate reserva_entrada) {
		this.reserva_entrada = reserva_entrada;
	}
	public LocalDate getReserva_salida() {
		return reserva_salida;
	}
	public void setReserva_salida(LocalDate reserva_salida) {
		this.reserva_salida = reserva_salida;
	}
	public Double getReserva_valor() {
		return reserva_valor;
	}
	public void setReserva_valor(Double reserva_valor) {
		this.reserva_valor = reserva_valor;
	}
	public String getReserva_fomaPago() {
		return reserva_fomaPago;
	}
	public void setReserva_fomaPago(String reserva_fomaPago) {
		this.reserva_fomaPago = reserva_fomaPago;
	}
	public Integer getReserva_id() {
		return reserva_id;
	}
	
	
	
}
