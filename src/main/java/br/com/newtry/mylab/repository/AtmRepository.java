package br.com.newtry.mylab.repository;

import java.sql.Connection;
import java.util.List;

import br.com.newtry.mylab.model.Atm;

public interface AtmRepository {
	
	public Connection getConnection();
	public List<Atm> listarTodos();
	
}
