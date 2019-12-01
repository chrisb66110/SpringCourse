package com.projectone.spring;

import java.util.Scanner;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.projectone.beans.Barcelona;
import com.projectone.beans.Ciudad;
import com.projectone.beans.Jugador;
import com.projectone.beans.Juventus;
import com.projectone.beans.Mundo;
import com.projectone.beans.Persona;
import com.projectone.interfaces.IEquipo;

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
			/*
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
			*/
		
		/*
		 * Ciclo de vida de los Beans(TODOS), mediante el xml
		 * 		En el XML se especifican los metodos init y destroy mediante
		 * 			Antes de inciar: <beans ....  default-init-method="init">
		 *			Antes de eliminar: <beans ....  default-destroy-method="destroy">
		 *			El nombre d elos metodos en la clase no importan porque solo se especifican en el xml
		 * */
		/*
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");		
		System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getCiudad().getNombre() );
		
		//OJO QUE SI NO CIERRA EL APPCONTEXT NO SE ELIMINAN LOS BEANS
		((ConfigurableApplicationContext)appContext).close();
		*/
		
		
		/*
		 * Ciclo de vida de los Beans(TODOS), mediante anotaciones
		 * 		Se hace mediante las anotaciones en las clases:
		 *			Antes de inciar: @PostConstruct
		 *			Antes de eliminar: @PreDestroy
		 *		Y el bean para que la anotaciones sean reconocidas en el xml de:
		 *			<bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"></bean>
		 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Persona per = (Persona) appContext.getBean("persona");		
			System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getCiudad().getNombre() );
			
			//OJO QUE SI NO CIERRA EL APPCONTEXT NO SE ELIMINAN LOS BEANS
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		/*
		 * Ciclo de vida de los Beans(Interfaces)
		 * 		Implementado la interfaces en cada bean
		 * 			-InitializingBean: metodo afterPropertiesSet
		 *			-DisposableBean: destroy
		 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Persona per = (Persona) appContext.getBean("persona");		
			System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getCiudad().getNombre() );
			
			//OJO QUE SI NO CIERRA EL APPCONTEXT NO SE ELIMINAN LOS BEANS
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		
		/*
		 * BeanPostProcessor
		 * 		Creando la clae ExampleBeanPostProcessor
		 * */
			/*
				ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
				Persona per = (Persona) appContext.getBean("persona");		
				System.out.println("Id: " + per.getId() + "\nNombre: " + per.getNombre() + "\nApodo: " + per.getApodo() + "\nPais: " + per.getPais().getNombre() + "\nCiudad: " + per.getCiudad().getNombre() );
				
				//OJO QUE SI NO CIERRA EL APPCONTEXT NO SE ELIMINAN LOS BEANS
				((ConfigurableApplicationContext)appContext).close();
			*/
		
		/*
		 * Interfaces
		 * 		Mediante java normal
		 * */
			/*
				ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
				Jugador jug = (Jugador) appContext.getBean("messi");
				
				System.out.println("Nombre: "+jug.getNombre() + "\nEquipo: " + jug.getEquipo().mostrar());
			
				((ConfigurableApplicationContext)appContext).close();
			*/
		
		
		/*
		 * Interfaces
		 * 		Mediante spring
		 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			
			// A para cada tipo de equipo
			Barcelona bar = (Barcelona) appContext.getBean("barcelona");
			System.out.println("Clase Barcelona - Nombre: "+bar.mostrar());
			Juventus juv = (Juventus) appContext.getBean("juventus");
			System.out.println("Clase Juventus - Nombre: "+juv.mostrar());
			//Mediante interfaces en la misma variable
			IEquipo equipo = (IEquipo) appContext.getBean("barcelona");
			System.out.println("Interfaz IEquipo - Nombre: "+equipo.mostrar());
			equipo = (IEquipo) appContext.getBean("juventus");
			System.out.println("Interfaz IEquipo - Nombre: "+equipo.mostrar());
		
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		
		/*
		 * Required annotation
		 * 		@Required es de spring, esta anotacion es en el metodo set del atributo en la clase
					Usa un beanpostproccessor, para reconocer la anotacion de @Required
						Bean usado: org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor
					Si no se especifica cual es el equipo en el xml y NO se usa el atributo, no da error
					Si no se especifica cual es el equipo en el xml y SI se usa el atributo, SI da error
		 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Jugador jug = (Jugador) appContext.getBean("messi");
			
			System.out.println("Nombre: "+jug.getNombre() + "\nEquipo: " + jug.getEquipo().mostrar());
		
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		
		/*
		 * 	Autowire annotation
 		 *		@Autowired es de spring, esta anotacion es en el atributo en la clase
 		 *			Puede ser establecida en el atributo o en el metodo set
 		 *			Usa un beanpostproccessor, para reconocer la anotacion de @Autowired
 		 *				Bean usado: org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor
 		 *			Por defecto la anotacion utiliza byType para asignar la propiedad automaticamente
		 *				Es decir, no pueden haber 2 beans del mismo tipo, porque no sabe cual asignar
		 *				Si solo tenemos 1, el automaticamente lo asigna
		 *			Por nombre, Podemos espeficar que el autowire lo haga por nombre automaticamente
		 *				El bean en el xml debe llamarse como se llama el atributo en la clase
		 *					En este ejemplo, en la clase se llama equipo, entonces cambiamos el nombre a equipo
		 *			Por un bean sin depender del nombre, mediante una propiedad
		 *				Al bean que se va a referenciar, se le pone
		 *					<qualifier value="barcelonaQualifier"></qualifier>
		 *				En la clase que hace referencia usar la anotacion @Qualifier("nombre del qualifier del bean")
		 *					@Qualifier para hacer que el busque mediante esto
		 *					Esto debajo del @Autowired en la clase
		 *				Se debe agregar Context en el NameSpace(pestaña que esta por donde esta la consola en el ide)
		 *					Esto agrega la siguiente linea al inicio del xml
		 *						xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		 *						xmlns:context="http://www.springframework.org/schema/context"
		 *						xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		 *							http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.3.xsd"
		 * 	Para reconocer cualquier anotacion que sea bajo spring se debe poner el siguiente tag en el xml
		 *	<context:annotation-config/>
		 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Jugador jug = (Jugador) appContext.getBean("messi");
			
			System.out.println("Nombre: "+jug.getNombre() + "\nEquipo: " + jug.getEquipo().mostrar());
		
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		
		
		
		
		/*
		 * 	Stereotypes
 		 *		@Component:
 		 *			Se especifica en la clase
 		 *			Indica que es un bean generico
 		 *			Hace lo mismo que hacer en el xml lo siguiente
 		 *				<bean id="messi" class="com.projectone.beans.Jugador"></bean>
 		 *			Necesita el tag en el xml
 		 *				<context:component-scan base-package="paquete donde estan los componentes"></context:component-scan>
 		 *					Esto detecta los beans en el paquete
 		 *			Para llamar este bean hay que llamarlo mediante
 		 *				appContext.getBean("nombreclaseminuscula");
 		 *			Si tenemos un autowired en la clase y la clase que se referencia es un @Component
 		 *				Se añade la referencia al atributo automaticamente
 		 *			Cada @Component es como definir un bean en el xml
 		 *			Si le quiero poner un nombre al componente uso:
 		 *				@Component("nombre")
 		 *		
 		 *		@Value
 		 *			Se especifica en un atributo en la clase
 		 *			Le da valor a un atributo de la clase
 		 *		
 		 *		@Repository
 		 *			Se especifica en la clase
 		 *			Indica que es un bean generico, y que es un repostorio
 		 *
 		 *		@Controller
 		 *			Se especifica en la clase
 		 *			Indica que es un bean generico y que es un controlador
 		 *
 		 *		@Service
 		 *			Se especifica en la clase
 		 *			Indica que es un bean generico y que es un servicio
 		 *		
		 * */
			/*
			ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
			Jugador jug = (Jugador) appContext.getBean("messi");
			
			System.out.println("Nombre: "+jug.getNombre() + "\nEquipo: " + jug.getEquipo().mostrar());
		
			((ConfigurableApplicationContext)appContext).close();
			*/
		
		/*
		 * Ejercicio XML puro
		 * */
		
		System.out.println("Equipos: \n1 -> Barcelona \n2 -> Juventus\n\nElija un equipo:");
		
		Scanner sc = new Scanner(System.in);
		int respuesta = sc.nextInt();
		
		String equipo = "";
		switch(respuesta) {
			case 1:
				equipo = "barcelona";
				break;
			case 2:
				equipo = "juventus";
				break;
			default:
				break;
		}
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/projectone/xml/beans.xml");
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		jug.setEquipo( (IEquipo) appContext.getBean(equipo) );
		
		System.out.println( "Nombre: "+jug.getNombre() + 
							"\nEquipo: " + jug.getEquipo().mostrar() +
							"\nCamiseta: " + jug.getCamiseta().getNumero() +
							"\nMarca: " + jug.getCamiseta().getMarca().getNombre());
	
		((ConfigurableApplicationContext)appContext).close();
	}

}







