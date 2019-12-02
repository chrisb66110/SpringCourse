package com.exercisespringmysql.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exercisespringmysql.beans.Jugador;

@Repository
public class DAOJugadorImpl implements DAOJugador {
	
	//spring inyecta automaticamente este datasource mediante la anotacion
	@Autowired
	private DataSource dataSource;

	@Override
	public void registrar(Jugador jugador) throws Exception {
		String sql = "INSERT INTO jugador(id,nombre,equipo_id,camiseta_id) values(?,?,?,?)";
		Connection con = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,  jugador.getId());
			ps.setString(2,  jugador.getNombre());
			ps.setInt(3,  jugador.getEquipo().getId());
			ps.setInt(4,  jugador.getCamiseta().getId());
			ps.executeUpdate();
			ps.close();
		}
		catch(Exception e){
			System.out.println("Exception DAOJugadorImpl: " + e.getMessage());
			throw e;
		}
		finally {
			if(con != null) {
				con.close();
			}
		}
	}

}
