package com.simpsons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simpsons.dto.Personaje;
import com.simpsons.services.Servicio;


	@Controller
	public class SimpsonsController {
	
		@Autowired
		private Personaje personaje;		

		@Autowired
		private Servicio servicio;
		
		@RequestMapping(path = "{nombre}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody public Personaje consultar(@PathVariable("nombre") String nombre) {
			
			personaje.setNombre(nombre);
			
			servicio.getSimpson(personaje);
									
			return personaje;
		}
		
		@RequestMapping(path = "{nombre}/padre", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody public Personaje consultarPadre(@PathVariable("nombre") String nombre) {
			
			personaje.setNombre(nombre);
			
			servicio.getSimpson(personaje);
				
			personaje.setNombre(personaje.getPadre());
			
			return personaje;
		}
	}
