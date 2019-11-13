package com.projectone.beans;

public class Ciudad {
	
	private String nombre;
	
	/*
	 * Metodo antes de iniciar el bean, puede ser cualquier nombre
	 * */
	private void init() {
		System.out.println("Antes de inicializar el bean Ciudad: " + nombre);
	}
	
	/*
	 * Metodo antes eliminar el bean, puede ser cualquier nombre
	 * */
	private void destroy() {
		System.out.println("Antes de eliminar el bean Ciudad: " + nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
