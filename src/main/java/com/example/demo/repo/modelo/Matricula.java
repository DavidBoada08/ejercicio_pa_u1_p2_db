package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {
	

	
	private LocalDateTime fechaMatricula;
	private BigDecimal valorMatricula;
	private Propietario cedula;
	private Vehiculo vehiculo;
	
	//metodo get y set
	
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Propietario getPropietario() {
		return cedula;
	}
	public void setPropietario(Propietario propietario) {
		this.cedula = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula + ", propietario="
				+ cedula + ", vehiculo=" + vehiculo + "]";
	}
	
	
	

}
