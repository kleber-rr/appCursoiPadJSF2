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
@Table(name = "rod_uf", schema = "public")
public class RodUf implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "id_uf")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Basic(optional = false)
	@Column(name = "sigla_uf")
	private String siglaUf;

	@Basic(optional = false)
	@Column(name = "descricao_uf")
	private String descricaoUf;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public String getDescricaoUf() {
		return descricaoUf;
	}

	public void setDescricaoUf(String descricaoUf) {
		this.descricaoUf = descricaoUf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricaoUf == null) ? 0 : descricaoUf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((siglaUf == null) ? 0 : siglaUf.hashCode());
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
		RodUf other = (RodUf) obj;
		if (descricaoUf == null) {
			if (other.descricaoUf != null)
				return false;
		} else if (!descricaoUf.equals(other.descricaoUf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (siglaUf == null) {
			if (other.siglaUf != null)
				return false;
		} else if (!siglaUf.equals(other.siglaUf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RodUf [id=" + id + ", siglaUf=" + siglaUf + ", descricaoUf="
				+ descricaoUf + "]";
	}

	
	
}
