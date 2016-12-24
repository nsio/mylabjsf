package br.com.newtry.mylab.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="tb_unidade_medida")
public class UnidadeMedida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "O Símbolo não pode ser nulo.")
	@Size(max = 200, message="A Grandeza não pode conter mais do que duzentos caracteres.")
	private String grandeza;
	
	@NotEmpty(message = "O Nome da Unidade não pode ser nulo.")
	@Size(max = 200, message="O Nome da Unidade não pode conter mais do que duzentos caracteres.")
	@Column(name="nm_unidade")
	private String nmUnidade;
	
	@NotEmpty(message = "O Símbolo não pode ser nulo.")
	@Size(max = 10, message="O símbolo não pode conter mais do que dez caracteres.")
	private String simbolo;
	
	@NotEmpty(message = "A Regra não pode ser nulo.")
	@Size(max = 200, message="A Regra não pode conter mais do que duzentos caracteres.")
	private String regra;
	
    @Column(name="dt_insert")
    @Temporal(TemporalType.DATE)
    private Date dtInsert = new Date();
	
	// RELAÇÕES COM A PLANETA
	//################################################################################
	@OneToMany(mappedBy="umDiametroEquatorial")
	private List<CorpoSelestial> csUmDiamentoEquatorials;
	public List<CorpoSelestial> getCsUmDiamentoEquatorials() {
		return csUmDiamentoEquatorials;
	}
	public void setCsUmDiamentoEquatorials(List<CorpoSelestial> csUmDiamentoEquatorials) {
		this.csUmDiamentoEquatorials = csUmDiamentoEquatorials;
	}

	@OneToMany(mappedBy="umInclinacaoAxial")
	private List<CorpoSelestial> csUmInclinacaoAxials;
	public List<CorpoSelestial> getCsUmInclinacaoAxials() {
		return csUmInclinacaoAxials;
	}
	public void setCsUmInclinacaoAxials(List<CorpoSelestial> csUmInclinacaoAxials) {
		this.csUmInclinacaoAxials = csUmInclinacaoAxials;
	}
	
	@OneToMany(mappedBy="umAreaTotal")
	private List<CorpoSelestial> csUmAreaTotals;
	public List<CorpoSelestial> getCsUmAreaTotals() {
		return csUmAreaTotals;
	}
	public void setCsUmAreaTotals(List<CorpoSelestial> csUmAreaTotals) {
		this.csUmAreaTotals = csUmAreaTotals;
	}

	@OneToMany(mappedBy="umTemperaturaInterior")
	private List<CorpoSelestial> csUmTemperaturaMedidas;
	public List<CorpoSelestial> getCsUmTemperaturaMedidas() {
		return csUmTemperaturaMedidas;
	}
	public void setCsUmTemperaturaMedidas(List<CorpoSelestial> csUmTemperaturaMedidas) {
		this.csUmTemperaturaMedidas = csUmTemperaturaMedidas;
	}

	@OneToMany(mappedBy="umVelocidadeEscape")
	private List<CorpoSelestial> csUmVelocidadeEscapes;
	public List<CorpoSelestial> getCsUmVelocidadeEscapes() {
		return csUmVelocidadeEscapes;
	}
	public void setCsUmVelocidadeEscapes(List<CorpoSelestial> csUmVelocidadeEscapes) {
		this.csUmVelocidadeEscapes = csUmVelocidadeEscapes;
	}

	@OneToMany(mappedBy="umDensidadeMedia")
	private List<CorpoSelestial> csUmDensidadeMedias;
	public List<CorpoSelestial> getCsUmDensidadeMedias() {
		return csUmDensidadeMedias;
	}
	public void setCsUmDensidadeMedias(List<CorpoSelestial> csUmDensidadeMedias) {
		this.csUmDensidadeMedias = csUmDensidadeMedias;
	}
	//################################################################################
	


	//################################################################################
	@OneToMany(mappedBy="unidadeMedida")
	private List<ComposicaoMassa> composicoesMassa;
	public List<ComposicaoMassa> getComposicoesMassa() {
		return composicoesMassa;
	}
	public void setComposicoesMassa(java.util.List<ComposicaoMassa> composicoesMassa) {
		this.composicoesMassa = composicoesMassa;
	}
	
	@OneToMany(mappedBy="umAreaCorpoSelestial")
	private List<AreaCorpoSelestial> areasCorpoSelestial;
	public List<AreaCorpoSelestial> getAreasCorpoSelestial() {
		return areasCorpoSelestial;
	}
	public void setAreasCorpoSelestial(List<AreaCorpoSelestial> areasCorpoSelestial) {
		this.areasCorpoSelestial = areasCorpoSelestial;
	}
	//################################################################################
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getGrandeza() {
		return grandeza;
	}

	public void setGrandeza(String grandeza) {
		this.grandeza = grandeza;
	}

	public String getNmUnidade() {
		return nmUnidade;
	}

	public void setNmUnidade(String nmUnidade) {
		this.nmUnidade = nmUnidade;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getRegra() {
		return regra;
	}

	public void setRegra(String regra) {
		this.regra = regra;
	}
	
	public Date getDtInsert() {
		return dtInsert;
	}

	public void setDtInsert(Date dtInsert) {
		this.dtInsert = dtInsert;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		UnidadeMedida other = (UnidadeMedida) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
