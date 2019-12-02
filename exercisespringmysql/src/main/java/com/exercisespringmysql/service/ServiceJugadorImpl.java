package com.exercisespringmysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercisespringmysql.beans.Jugador;
import com.exercisespringmysql.dao.DAOJugador;

@Service
public class ServiceJugadorImpl implements ServiceJugador {

	@Autowired
	private DAOJugador daoJugador;
	
	@Override
	public void registrar(Jugador jugador) throws Exception {
		try {
			daoJugador.registrar(jugador);
		}
		catch(Exception e){
			System.out.println("Exception ServiceJugadorImpl: " + e.getMessage());
			throw e;
		}
		
	}

}
