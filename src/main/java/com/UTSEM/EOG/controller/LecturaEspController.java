package com.UTSEM.EOG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UTSEM.EOG.dto.LecturaESPdto;
import com.UTSEM.EOG.model.LecturaESP;
import com.UTSEM.EOG.service.LecturaEspService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin("*")
@RestController
@RequestMapping("/lectura")
public class LecturaEspController {

	@Autowired
	LecturaEspService lecturaEspService;

	@GetMapping("/prueba")
	public String pruebaApi() {
		return "API funcionando correctamente";
	}

	/*@PostMapping("/guardarLectura")
	public String guardarLecturaESP32(@RequestBody LecturaESPdto lecturaESPdto) {

		return lecturaEspService.guardarLectura(lecturaESPdto);

	}*/
	
	@GetMapping("/obtenerLecturas")
	public List<LecturaESP> obtenerLecturas() {
		return lecturaEspService.obtenerLecturas();
	}

	
	@PostMapping("/actualizar")
	public String actualizar(@RequestBody LecturaESPdto esPdto) {
		return lecturaEspService.actualizar(esPdto);
	}
	
	
	

}
