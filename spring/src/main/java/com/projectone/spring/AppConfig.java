package com.projectone.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.projectone.beans.Mundo;

@Configuration
public class AppConfig {

	@Bean
	public Mundo mundo() {
		return new Mundo();
	}
}
