package com.simpsons.services;

import java.util.ArrayList;
import java.util.List;

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

	public ArrayList<Personaje> consultarTodos() {

		ArrayList<Personaje> listaTodos = new ArrayList<Personaje>();
		
		listaTodos.add(new Personaje(1, "Bart", "Simpsons", "Homer"));
		listaTodos.add(new Personaje(2, "Lisa", "Simpsons", "Homer"));
		listaTodos.add(new Personaje(3, "Homer", "Simpsons", "Abraham"));
		
		return listaTodos;
	}

	public ArrayList<Personaje> consultarApellido(String apellido) {
		
		ArrayList<Personaje> listaTodos = new ArrayList<Personaje>();
		
		switch (apellido) {
		case "Simpson":
			listaTodos.add(new Personaje(1, "Bart", "Simpsons", "Homer"));
			listaTodos.add(new Personaje(2, "Lisa", "Simpsons", "Homer"));
			listaTodos.add(new Personaje(3, "Homer", "Simpsons", "Abraham"));
			break;
		case "Bouvie":
			listaTodos.add(new Personaje(1, "Hermana1", "Bouvie", "Padre"));
			listaTodos.add(new Personaje(2, "Hermana2", "Bouvie", "Padre"));
			break;
		}
		
		return listaTodos;
	}
}
