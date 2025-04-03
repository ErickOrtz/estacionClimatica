package com.UTSEM.EOG.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LecturaESP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column
	Integer sensorLLuvia;
	@Column
	Integer sensorCO;
	@Column
	Float sensorTemperatura;
	@Column
	Float sensorHumedad;
	@Column
	@CreationTimestamp
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime fechaHoraLectura;
	
	///////////////////////
	
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
	public Float getSensorHumedad() {
		return sensorHumedad;
	}
	public void setSensorHumedad(Float sensorHumedad) {
		this.sensorHumedad = sensorHumedad;
	}
	public LocalDateTime getFechaHoraLectura() {
		return fechaHoraLectura;
	}
	public void setFechaHoraLectura(LocalDateTime fechaHoraLectura) {
		this.fechaHoraLectura = fechaHoraLectura;
	}

	
	
}
