package br.com.newtry.mylab.repository;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private Connection connection;
	// ESSE CAMPO DEVE SER USADO COMO PARAMENTO DE ALGUMA THREAD QUE VAI VERIFICAR O TEMPO DA CONEXAO ESTA INVATIVA, RETIRANDO A CONEXAO DO POOL E FECHANDO A CONEXAO
	private long lastUse;
	
	public Conexao() throws SQLException{
		
		this.connection = DriverManager.getConnection("");
		this.lastUse = System.currentTimeMillis();
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Connection getConnection() {
		this.lastUse = System.currentTimeMillis();
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public long getLastUse() {
		return lastUse;
	}
	public void setLastUse(long lastUse) {
		this.lastUse = lastUse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conexao other = (Conexao) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
