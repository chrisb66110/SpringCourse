package com.projectone.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.projectone.beans.Barcelona;
import com.projectone.beans.Camiseta;
import com.projectone.beans.Jugador;
import com.projectone.beans.Juventus;
import com.projectone.beans.Marca;
import com.projectone.interfaces.IEquipo;

@Configuration
public class AppConfigExerciseJavaBased {
	
	@Bean //Para indicar que hace un bean
	public Jugador jugador1() {
		return new Jugador();
	}
	
	@Bean //Para indicar que hace un bean
	public IEquipo barcelona() {
		return new Barcelona();
	}
	
	@Bean //Para indicar que hace un bean
	public IEquipo juventus() {
		return new Juventus();
	}
	
	@Bean //Para indicar que hace un bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
	
	@Bean //Para indicar que hace un bean
	public Marca marca() {
		return new Marca();
	}

}
