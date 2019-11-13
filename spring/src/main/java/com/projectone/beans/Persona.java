package com.projectone.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Persona {
	
	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;
	
	/*
	 * Metodo antes de iniciar el bean, puede ser cualquier nombre
	 * 		Mediante:
	 * 			-xml
	 * 			-anotaciones en esta clase
	 * */
	@PostConstruct
	private void init() {
		System.out.println("Antes de inicializar el bean Persona: " + nombre);
	}
	
	/*
	 * Metodo antes eliminar el bean, puede ser cualquier nombre
	 *		Mediante:
	 * 			-xml
	 * 			-anotaciones en esta clase
	 * */
	@PreDestroy
	private void destroy() {
		System.out.println("Antes de eliminar el bean Persona: " + nombre);
	}
	

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

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
	
	public String getApodo() {
		return apodo;
	}
	
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
}
