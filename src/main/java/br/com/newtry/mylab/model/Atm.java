package br.com.newtry.mylab.model;

public class Atm {
	
	private long id;
	private String compName;
	
	public long getId(){
		return id;
	}
	public void setId(long id){
		this.id = id;
	}
	public String getCompName(){
		return compName;
	}
	public void setCompName(String compName){
		this.compName = compName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Atm other = (Atm) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
