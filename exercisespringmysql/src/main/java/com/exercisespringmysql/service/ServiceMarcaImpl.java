package com.exercisespringmysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercisespringmysql.beans.Marca;
import com.exercisespringmysql.dao.DAOMarca;

@Service
public class ServiceMarcaImpl implements ServiceMarca{
	
	@Autowired
	private DAOMarca daoMarca;

	@Override
	public void registrar(Marca marca) throws Exception {
		try {
			daoMarca.registrar(marca);
		}
		catch(Exception e){
			System.out.println("Exception ServiceMarcaImpl: " + e.getMessage());
			throw e;
		}
		
	}
	
}
