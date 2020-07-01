package com.joaquin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joaquin.model.Curso;
import com.joaquin.model.Persona;

@RestController
@RequestMapping("/persona1")
public class Persona1Controller {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Persona>> mostrar() {				

		Persona per = new Persona();
		per.setId(1);
		per.setNombre("Joaquin");

		Curso c = new Curso();
		c.setId(1);
		c.setNombre("Spring Developer");

		per.setCurso(c);
				
		Persona per1 = new Persona();
		per1.setId(2);
		per1.setNombre("Joaquin2");

		Curso c1 = new Curso();
		c1.setId(2);
		c1.setNombre("Java EE");

		per1.setCurso(c1);
		
		List<Persona> lista = new ArrayList<>();
		lista.add(per);
		lista.add(per1);

		return new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
	}
}
