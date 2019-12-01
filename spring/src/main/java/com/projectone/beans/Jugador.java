package com.projectone.beans;

import org.springframework.beans.factory.annotation.Required;

import com.projectone.interfaces.IEquipo;

public class Jugador {
	
	private int numero;
	
	private String nombre;
	
	private IEquipo equipo;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public IEquipo getEquipo() {
		return equipo;
	}
	
	@Required //esta anotacion va en el metodo set del atributo
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	
	

}
