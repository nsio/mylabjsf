package br.com.newtry.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MenuBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public String atm(){
		return "atm";
	}
	
	public String astro(){
		return "astro";
	}
	
}
