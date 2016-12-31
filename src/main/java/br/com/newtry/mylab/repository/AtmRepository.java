package br.com.newtry.mylab.repository;

import java.util.List;

import br.com.newtry.mylab.model.Atm;

public interface AtmRepository {
	
	public List<Atm> listarTodos();
	public Atm loadById(Integer id);
	// ESSE MÉTODO DEVE RETORNAR UMA COLEÇÃO
	public Atm loadByName(String name);
	
}
