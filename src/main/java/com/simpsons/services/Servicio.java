package com.simpsons.services;

import org.springframework.stereotype.Service;

import com.simpsons.dto.Personaje;

@Service
public class Servicio {

	public Personaje getSimpson(Personaje personaje) {

		switch (personaje.getNombre()) {
		case "Bart":
			personaje.setApellido("Simpson");
			personaje.setNombre("Bart");
			personaje.setPadre("Homer");
			break;
		case "Lisa":
			personaje.setApellido("Simpson");
			personaje.setNombre("Lisa");
			personaje.setPadre("Homer");
			break;
		case "Homer":
			personaje.setApellido("Simpson");
			personaje.setNombre("Homer");
			personaje.setPadre("Abraham");
			break;
		}
		return personaje;
	}

}
