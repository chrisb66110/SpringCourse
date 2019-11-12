package com.projectone.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projectone.beans.Ciudad;
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
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Persona per = (Persona) appContext.getBean("persona");
			System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getPais().getCiudad().getNombre());
			
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		
		
		/*
		 * Referenciando Beans mediante alisas mediante el <alias> en el XML
 		 * 
		 * */
			/*
			 * Ejemplo de alias
			 * 
			 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Persona per = (Persona) appContext.getBean("personaBean");//Uso el alias
			System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getPais().getCiudad().getNombre());
			
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		
		
		/*
		 * Referenciando Beans mediante alisas mediante el tag name en <bean> en el XML
 		 * 
		 * */
			/*
			 * Ejemplo de tag name en <bean>
			 * 
			 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Persona per = (Persona) appContext.getBean("personaBean2");//Uso el name del <bean>
			System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getPais().getCiudad().getNombre());
			
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		
		/*
		 * Referenciando Beans con atributo que es una coleccion
 		 * 
		 * */
			/*
			 * Ejemplo de declaracion de colecciones de un bean en el xml y aqui se muestran
			 * 
			 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Persona per = (Persona) appContext.getBean("personaBean2");
			String nombresCiudades = "\t";
			for(Ciudad ciudad : per.getPais().getCiudades()) {
				nombresCiudades += ciudad.getNombre() + "\n\t";
			}
			
			System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudades:\n" + nombresCiudades);
			
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		
		
		/*
		 * Usa de AutoWire
 		 * 
		 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Persona per = (Persona) appContext.getBean("persona");
			System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getCiudad().getNombre() );
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		/*
		 * Ejemplo de scope 
		 * 					-singleton, usando <bean scope="singleton" en el xml>, por defecto en el xml
		 * 					-prototype, usando <bean scope="prototype" en el xml>
		 * 
		 * 		Si se usa
		 * 			<bean lazy-init="true">: indica que el appContext no se cargan los beans inmediatamente, sino hasta que se pidan con appContext.getBean
 		 * 
		 * */
		//Bean inicial
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");		
		System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getCiudad().getNombre() );
		//Se le modifica el nombre de la ciudad al bean inicial
		per.setNombre("NombreNuevo");
		per.getCiudad().setNombre("CiudadNueva");
		System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getCiudad().getNombre() );
		//Bean 2, usando <bean scope="singleton" en el xml>, que tiene la misma informacion del bean inicial pues es singleton
		//Bean 2, usando <bean scope="prototype" en el xml>, que tiene informacion distinta del bean inicial pues es una instancia distinta
		Persona per2 = (Persona) appContext.getBean("persona");		
		System.out.println("Id: " + per2.getId() + "\nNombre: " + per2.getNombre() + "\nApodo: " + per2.getApodo() + "\nPais: " + per2.getPais().getNombre() + "\nCiudad: " + per2.getCiudad().getNombre() );
		
		
		
		
		((ConfigurableApplicationContext)appContext).close();
	}

}







