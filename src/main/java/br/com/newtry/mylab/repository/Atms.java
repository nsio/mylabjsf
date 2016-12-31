package br.com.newtry.mylab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;

import br.com.newtry.mylab.model.Atm;

@Model
public class Atms implements AtmRepository {
	
	private Connection connection;
	
	public Atms(){}
	
	private Connection getConexao(){
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver"); 
			return DriverManager.getConnection("jdbc:jtds:sqlserver://localhost;instance=SQLEXPRESS;Databasename=mylab", "nysio", "nysio");
		} catch (SQLException | ClassNotFoundException e) {
			return  null;
		}
	}
	
	@Override
	public List<Atm> listarTodos() {
		List<Atm> retorno = new ArrayList<Atm>();
		try{
			this.connection = getConexao();
			String query = "exec spAtms";
			PreparedStatement ps = this.connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Atm atm = new Atm();
				atm.setId(rs.getInt(1));
				atm.setCompName(rs.getString(2));
				retorno.add(atm);
			}
			this.connection.close();
		}catch (SQLException e) {
			
		}
		return retorno;
	}

	@Override
	public Atm loadById(Integer id) {
		Atm retorno = new Atm();
		try{
			this.connection = getConexao();
			String query = "exec spAtmsById ?";
			PreparedStatement ps = this.connection.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				retorno.setId(rs.getInt(1));
				retorno.setCompName(rs.getString(2));
			}
			this.connection.close();
		}catch (SQLException e) {
			
		}
		return retorno;
	}
	
	@Override
	public Atm loadByName(String name) {
		Atm retorno = new Atm();
		try{		
			this.connection = getConexao();
			String query = "exec spAtmsByName ?";
			PreparedStatement ps = this.connection.prepareStatement(query);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				retorno.setId(rs.getInt(1));
				retorno.setCompName(rs.getString(2));
			}
			this.connection.close();
		}catch (SQLException e) {
			
		}
		return retorno;
	}
	
}
