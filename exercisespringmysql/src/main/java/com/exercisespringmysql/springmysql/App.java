package com.exercisespringmysql.springmysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exercisespringmysql.beans.Marca;
import com.exercisespringmysql.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App {
   
	public static void main( String[] args ){
        Marca mar = new Marca();
        mar.setId(4);
        mar.setNombre("MARCA 4");
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/exercisespringmysql/xml/beans.xml");
        
        ServiceMarca sm = (ServiceMarca)appContext.getBean("serviceMarcaImpl");
        if(sm == null) {
        	System.out.println("sm NULL ");
        }
        
        try {
        	sm.registrar(mar);
        }
        catch(Exception e){
        	System.out.println("Exception App: " + e.getMessage());
        }
        
        
    }
	
}
