package com.projectone.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.projectone.beans.Mundo;
import com.projectone.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Mundo
		 * 
		 * */
		
			/*
			 * Mediante el XML
			 * 
			//Como el archivo context xml esta en otro paquete lo ponemos en el constructor
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			*/
			
			/*
			 * Mediante AppConfig y AppConfig2 (puedo pasar por parametros lo que quiera)
			 * Para este se usan las anotaciones en el Bean Mundo
			 * */
			//Mandamos por parametro la clase que tiene la configuracion de los beans
			
			//Por parametros
			//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
			
			//Por metodo
			/*AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
			appContext.register(AppConfig.class);
			appContext.register(AppConfig2.class);
			appContext.refresh();
	
			
			
			//Comun a todo lo anterior
			Mundo mConmundo = (Mundo) appContext.getBean("mundo");
			System.out.println(mConmundo.getSaludo());
			
			Mundo mConmarte = (Mundo) appContext.getBean("marte");
			System.out.println(mConmarte.getSaludo());
			
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		/*
		 * Persona sin atributos objeto
		 * 
		 * */
			/*
			 * Ejemplo de inyeccion de dependencias
			 * 
			 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Persona per = (Persona) appContext.getBean("persona");
			System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo());
			
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		
		/*
		 * Persona con atributo objeto Pais
		 * 
		 * */
			/*
			 * Ejemplo de inyeccion de dependencias de objetos
			 * 
			 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Persona per = (Persona) appContext.getBean("persona");
			System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre());
			
			((ConfigurableApplicationContext)appContext).close();
		*/
		
		/*
		 * Persona con atributo objeto Pais que tiene un atributo objeto Ciudad
		 * 
		 * */
		/*
		 * Ejemplo de inyeccion de dependencias de objetos
		 * 
		 * */
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getPais().getCiudad().getNombre());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}







