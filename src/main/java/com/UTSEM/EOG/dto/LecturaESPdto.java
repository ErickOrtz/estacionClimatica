package com.UTSEM.EOG.dto;

import java.time.LocalDateTime;

public class LecturaESPdto {
	Long id;
	Integer sensorLLuvia;
	Integer sensorCO;
	Float sensorTemperatura;
	LocalDateTime fechaHoraLectura;
	Float sensorHumedad;
	
	
	public String resumenLectura() {
		return  "Lectura Guardada:"+ "\nsensorLuvia: "+this.sensorLLuvia+"\n"
				+ "sensorCO: "+this.sensorCO+"\n"
				+ "sensorTemperatura: "+this.sensorTemperatura
				+ "\nsensorHumedad: "+this.sensorHumedad+"\n"
				+ "fechaHoraLectura: "+this.fechaHoraLectura;
	}
	
	public Float getSensorHumedad() {
		return sensorHumedad;
	}
	public void setSensorHumedad(Float sensorHumedad) {
		this.sensorHumedad = sensorHumedad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getSensorLLuvia() {
		return sensorLLuvia;
	}
	public void setSensorLLuvia(Integer sensorLLuvia) {
		this.sensorLLuvia = sensorLLuvia;
	}
	public Integer getSensorCO() {
		return sensorCO;
	}
	public void setSensorCO(Integer sensorCO) {
		this.sensorCO = sensorCO;
	}
	public Float getSensorTemperatura() {
		return sensorTemperatura;
	}
	public void setSensorTemperatura(Float sensorTemperatura) {
		this.sensorTemperatura = sensorTemperatura;
	}
	public LocalDateTime getFechaHoraLectura() {
		return fechaHoraLectura;
	}
	public void setFechaHoraLectura(LocalDateTime fechaHoraLectura) {
		this.fechaHoraLectura = fechaHoraLectura;
	}
}
