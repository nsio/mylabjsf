package br.com.newtry.mylab.model.enums;

public enum TipoArea {
	
	TERRA("Terra"),
	AGUA("Água");
	
	private String descricao;
	
	TipoArea(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
