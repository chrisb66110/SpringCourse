package com.projectone.beans;

/*
import java.util.List;
*/

public class Pais {
	
	private String nombre;
	
	/*
	private List<Ciudad> ciudades;

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}*/
	
	/*
	 * Metodo antes de iniciar el bean, puede ser cualquier nombre
	 * */
	private void init() {
		System.out.println("Antes de inicializar el bean Pais: " + nombre);
	}
	
	/*
	 * Metodo antes eliminar el bean, puede ser cualquier nombre
	 * */
	private void destroy() {
		System.out.println("Antes de eliminar el bean Pais: " + nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
