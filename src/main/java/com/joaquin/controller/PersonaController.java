package com.joaquin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joaquin.model.Curso;
import com.joaquin.model.Persona;

@Controller
@RequestMapping("/persona")
public class PersonaController {

	
	@RequestMapping(value="/",method=RequestMethod.GET,produces = "application/json")
	public @ResponseBody Persona mostrar() {
		
		Persona per = new Persona();
		per.setId(1);
		per.setNombre("Joaquin");
		
		Curso c = new Curso();
		c.setId(1);
		c.setNombre("Spring Developer");
		
		per.setCurso(c);

		return per;
	}
	
}
