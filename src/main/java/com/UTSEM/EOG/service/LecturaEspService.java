package com.UTSEM.EOG.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.UTSEM.EOG.dto.LecturaESPdto;
import com.UTSEM.EOG.model.LecturaESP;
import com.UTSEM.EOG.repository.LecturaEspRrepsitory;

@Service
public class LecturaEspService {

	@Autowired
	LecturaEspRrepsitory lecturaEspRrepsitory;
	
	public String guardarLectura(@RequestBody LecturaESPdto lecturaESPdto) {
	    LecturaESP lecturaESPaGuardar = new LecturaESP();
	    
	   
	    if(lecturaESPdto.getFechaHoraLectura() == null) {
	        lecturaESPdto.setFechaHoraLectura(LocalDateTime.now());
	    }
	  
	    lecturaESPaGuardar.setFechaHoraLectura(lecturaESPdto.getFechaHoraLectura());
	    lecturaESPaGuardar.setSensorCO(lecturaESPdto.getSensorCO());
	    lecturaESPaGuardar.setSensorHumedad(lecturaESPdto.getSensorHumedad());
	    lecturaESPaGuardar.setSensorLLuvia(lecturaESPdto.getSensorLLuvia());
	    lecturaESPaGuardar.setSensorTemperatura(lecturaESPdto.getSensorTemperatura());
	    lecturaESPaGuardar.setLugarEstacion(lecturaESPdto.getLugarEstacion());
	    
	    System.out.println(lecturaESPdto.resumenLectura());
	    
	    lecturaEspRrepsitory.save(lecturaESPaGuardar);
	    return lecturaESPdto.resumenLectura();
	}
	
	
	public List<LecturaESP> obtenerLecturas(){
	    return lecturaEspRrepsitory.findAll();
	}
	
}
