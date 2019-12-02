package com.exercisespringmysql.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exercisespringmysql.beans.Marca;

@Repository
public class DAOMarcaImpl implements DAOMarca {
	
	//spring inyecta automaticamente este datasource mediante la anotacion
	@Autowired
	private DataSource dataSource;

	@Override
	public void registrar(Marca marca) throws Exception {
		String sql = "INSERT INTO marca(id,nombre) values(?,?)";
		Connection con = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,  marca.getId());
			ps.setString(2,  marca.getNombre());
			ps.executeUpdate();
			ps.close();
		}
		catch(Exception e){
			System.out.println("Exception DAOMarca: " + e.getMessage());
			throw e;
		}
		finally {
			if(con != null) {
				con.close();
			}
		}
		
	}

}
