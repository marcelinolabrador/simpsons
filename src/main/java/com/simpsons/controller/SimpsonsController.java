package com.simpsons.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simpsons.dto.Personaje;
import com.simpsons.services.Servicio;

@RestController
public class SimpsonsController {

	@Autowired
	private Servicio servicio;

	@GetMapping(path = "{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Personaje consultar(@PathVariable("nombre") String nombre) {
		
		return  servicio.getSimpson(nombre);
	}

	@GetMapping(path = "{nombre}/padre", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Personaje consultarPadre(@PathVariable("nombre") String nombre) {

		Personaje personaje = servicio.getSimpson(nombre);
		
		return servicio.getSimpson(personaje.getPadre());
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Personaje> consultarTodos() {

		return servicio.consultarTodos();
	}

	@GetMapping(params = "apellido", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Personaje> consultarApellidos(@RequestParam String apellido) {

		return servicio.consultarApellido(apellido);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> insertarPersonaje(@RequestBody Personaje personaje) {

		return new ResponseEntity<String>("creado el personaje: " + personaje, HttpStatus.CREATED);
	}


	@DeleteMapping("{id}")
	public ResponseEntity<String> borrado(@PathVariable String id) {
		return new ResponseEntity<String>("Borrado el id: " + id, HttpStatus.ACCEPTED);
	}

}
