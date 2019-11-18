package com.projectone.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Persona implements InitializingBean, DisposableBean{
	
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
	/*
	@PostConstruct
	private void init() {
		System.out.println("Antes de inicializar el bean Persona: " + nombre);
	}
	*/
	
	/*
	 * Metodo antes eliminar el bean, puede ser cualquier nombre
	 *		Mediante:
	 * 			-xml
	 * 			-anotaciones en esta clase
	 * */
	/*
	@PreDestroy
	private void destroy() {
		System.out.println("Antes de eliminar el bean Persona: " + nombre);
	}
	*/

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

	/*
	 * Metodo que se hace cuando se implementa la interfaz InitializingBean
	 * 		Es como el PostConstruct pero mediante interfaces
	 * */
	public void afterPropertiesSet() throws Exception {
		System.out.println("Antes de inicializar el bean Persona: " + nombre);
	}

	/*
	 * Metodo que se hace cuando se implementa la interfaz DisposableBean
	 * 		Es como el PreDestroy pero mediante interfaces
	 * */
	public void destroy() throws Exception {
		System.out.println("Antes de eliminar el bean Persona: " + nombre);
	}
	
}
