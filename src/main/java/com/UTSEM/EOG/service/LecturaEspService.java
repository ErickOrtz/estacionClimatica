package com.UTSEM.EOG.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
	    
	    System.out.println("LugarEstacion recibido: " + lecturaESPdto.getLugarEstacion());
	    if(lecturaESPdto.getFechaHoraLectura() == null) {
	        lecturaESPdto.setFechaHoraLectura(LocalDateTime.now());
	    }
	  
	    //lecturaESPaGuardar.setFechaHoraLectura(lecturaESPdto.getFechaHoraLectura());
	    lecturaESPaGuardar.setSensorCO(lecturaESPdto.getSensorCO());
	    lecturaESPaGuardar.setSensorHumedad(lecturaESPdto.getSensorHumedad());
	    lecturaESPaGuardar.setSensorLLuvia(lecturaESPdto.getSensorLLuvia());
	    lecturaESPaGuardar.setSensorTemperatura(lecturaESPdto.getSensorTemperatura());
	    lecturaESPaGuardar.setLugarEstacion(lecturaESPdto.getLugarEstacion());
	    
	    System.out.println(lecturaESPdto.resumenLectura());
	    
	    lecturaEspRrepsitory.save(lecturaESPaGuardar);
	    return lecturaESPdto.resumenLectura();
	}
	
	public String actualizar(LecturaESPdto lecturaESP) {
	    Optional<LecturaESP> laLectura = lecturaEspRrepsitory.findById(lecturaESP.getId());
	    
	    if(laLectura.isPresent()) {
	        LecturaESP lecturaActualizar = laLectura.get();
	        lecturaActualizar.setFechaHoraLectura(lecturaESP.getFechaHoraLectura());
	        lecturaActualizar.setSensorCO(lecturaESP.getSensorCO());
	        lecturaActualizar.setSensorHumedad(lecturaESP.getSensorHumedad());
	        lecturaActualizar.setSensorLLuvia(lecturaESP.getSensorLLuvia()); // Asegúrate que coincida
	        lecturaActualizar.setSensorTemperatura(lecturaESP.getSensorTemperatura());
	        lecturaActualizar.setLugarEstacion(lecturaESP.getLugarEstacion()); // Añade esta línea
	        
	        lecturaEspRrepsitory.save(lecturaActualizar);
	        
	        return "Lectura Actualizada: " + lecturaESP.resumenLectura();
	    }
	    return "Lectura No encontrada";
	}
	
	public List<LecturaESP> obtenerLecturas(){
	    return lecturaEspRrepsitory.findAll();
	}
	
}
