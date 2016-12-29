package br.com.newtry.mylab.repository;

import java.sql.Connection;
import java.util.List;
import javax.enterprise.inject.Model;
import br.com.newtry.mylab.model.Atm;

@Model
public class Atms implements AtmRepository {
	
	// PARA ESSA CLASSE ESTAR ELEGIVÉL AO CDI, PRECISA DE UM CONSTRUTOR, SEM PARAMS
	public Atms(){}
	
	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Atm> listarTodos() {
		// TODO Auto-generated method stub
		System.out.println("Listou todos.");
		return null;
	}

}
