package br.com.newtry.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import br.com.newtry.mylab.model.Atm;
import br.com.newtry.mylab.repository.Atms;

@ManagedBean
@ViewScoped
public class AtmBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Atms atms;
	
	private List<Atm> listAtm = new ArrayList<Atm>();
	private List<Atm> listAtmPesq = new ArrayList<Atm>();
	private Atm atm = new Atm();
	private Integer idAtm;
	private String compName;
	
	public void init(){
		this.listAtm = this.atms.listarTodos();
	}
	
	public String loadById(){
		this.atm = this.atms.loadById(this.idAtm);
		return "";
	}

	public String loadByName(){
		this.atm = this.atms.loadByName(this.compName);
		return "";
	}
	
	public Integer getIdAtm() {
		return idAtm;
	}
	public void setIdAtm(Integer idAtm) {
		this.idAtm = idAtm;
	}
	public List<Atm> getListAtm() {
		return listAtm;
	}
	public void setListAtm(List<Atm> listAtm) {
		this.listAtm = listAtm;
	}
	public List<Atm> getListAtmPesq() {
		return listAtmPesq;
	}
	public void setListAtmPesq(List<Atm> listAtmPesq) {
		this.listAtmPesq = listAtmPesq;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public Atm getAtm() {
		return atm;
	}
	public void setAtm(Atm atm) {
		this.atm = atm;
	}
}
