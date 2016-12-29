package br.com.newtry.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import br.com.newtry.mylab.repository.Atms;

@ManagedBean
@RequestScoped
public class IndexBean {

	
	@Inject
	private Atms atms;
	
	public String executeSomething(){
		System.out.println(this.atms.listarTodos());
		return "atm";
	}
	
}
