package com.exercisespringmysql.springmysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exercisespringmysql.beans.Equipo;
import com.exercisespringmysql.beans.Jugador;
import com.exercisespringmysql.beans.Marca;
import com.exercisespringmysql.service.ServiceJugador;
import com.exercisespringmysql.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App {
   
	public static void main( String[] args ){
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/exercisespringmysql/xml/beans.xml");
        
        ServiceJugador sj = (ServiceJugador)appContext.getBean("serviceJugadorImpl");
        
        Jugador jug = (Jugador)appContext.getBean("jugador4");

        try {
        	sj.registrar(jug);
        }
        catch(Exception e){
        	System.out.println("Exception App: " + e.getMessage());
        }
        
        
    }
	
}
