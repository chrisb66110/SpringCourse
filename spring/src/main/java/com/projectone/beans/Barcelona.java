package com.projectone.beans;

import org.springframework.stereotype.Component;

import com.projectone.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	public String mostrar() {
		return "Barcelona FC";
	}

}
