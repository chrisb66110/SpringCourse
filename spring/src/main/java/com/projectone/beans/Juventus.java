package com.projectone.beans;

import org.springframework.stereotype.Component;

import com.projectone.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo{

	public String mostrar() {
		return "Juventus";
	}

}
