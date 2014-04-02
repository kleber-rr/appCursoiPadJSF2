package br.gov.rr.smsa.rodio.entidades;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rod_municipio", schema = "public")
public class RodMunicipio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "mun_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Basic(optional = false)
	@Column(name = "mun_descricao")
	private String descricao;
	
	@Basic(optional = false)
	@Column(name = "fk_uf")
	private RodUf fkUf;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public RodUf getFkUf() {
		return fkUf;
	}

	public void setFkUf(RodUf fkUf) {
		this.fkUf = fkUf;
	}

	public RodMunicipio(){
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((fkUf == null) ? 0 : fkUf.hashCode());
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
		RodMunicipio other = (RodMunicipio) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (fkUf == null) {
			if (other.fkUf != null)
				return false;
		} else if (!fkUf.equals(other.fkUf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RodMunicipio [id=" + id + ", descricao=" + descricao
				+ ", fkUf=" + fkUf + "]";
	}

	
	
}
