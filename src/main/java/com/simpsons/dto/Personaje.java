package com.simpsons.dto;

public class Personaje {

	public Personaje(){}
	
	public Personaje(int id, String nombre, String apellido, String padre) {
		this.setId(id);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setPadre(padre);
	}
	
	private int id;
	
	private String nombre;
	
	private String apellido;
	
	private String padre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPadre() {
		return padre;
	}

	public void setPadre(String padre) {
		this.padre = padre;
	}
}
