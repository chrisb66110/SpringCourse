package com.projectone.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.projectone.beans.Mundo;

@Configuration
public class AppConfig2 {

	@Bean
	public Mundo marte() {
		return new Mundo();
	}
}
