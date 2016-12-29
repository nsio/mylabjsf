package br.com.newtry.mylab.repository;

public class DataBase {
	
	private static DataBase instance = null;
	
	private DataBase(){}
	
	public static DataBase getInstance(){
		if(instance == null){
			instance = new DataBase();
		}
		return instance;
	}
	
}
