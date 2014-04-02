package br.gov.rr.smsa.rodio.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rod_cadastro_sus", schema = "public")
public class RodCadastroSus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "cad_sus_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Basic(optional = false)
	@Column(name = "cad_sus_n_cartao")
	private BigInteger cadSusNCartao;
	
	@Basic(optional = false)
	@Column(name = "cad_sus_nome")
	private String cadSusNome;
	
	@Basic(optional = false)
	@Column(name = "cad_sus_dt_nascimento")
	private Date cadSusDtNascimento;
	
	@Basic(optional = false)
	@Column(name = "cad_sus_nome_mae")
	private String cadSusNomeMae;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigInteger getCadSusNCartao() {
		return cadSusNCartao;
	}

	public void setCadSusNCartao(BigInteger cadSusNCartao) {
		this.cadSusNCartao = cadSusNCartao;
	}

	public String getCadSusNome() {
		return cadSusNome;
	}

	public void setCadSusNome(String cadSusNome) {
		this.cadSusNome = cadSusNome;
	}

	public Date getCadSusDtNascimento() {
		return cadSusDtNascimento;
	}

	public void setCadSusDtNascimento(Date cadSusDtNascimento) {
		this.cadSusDtNascimento = cadSusDtNascimento;
	}

	public String getCadSusNomeMae() {
		return cadSusNomeMae;
	}

	public void setCadSusNomeMae(String cadSusNomeMae) {
		this.cadSusNomeMae = cadSusNomeMae;
	}

	public RodCadastroSus(){
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((cadSusDtNascimento == null) ? 0 : cadSusDtNascimento
						.hashCode());
		result = prime * result
				+ ((cadSusNCartao == null) ? 0 : cadSusNCartao.hashCode());
		result = prime * result
				+ ((cadSusNome == null) ? 0 : cadSusNome.hashCode());
		result = prime * result
				+ ((cadSusNomeMae == null) ? 0 : cadSusNomeMae.hashCode());
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
		RodCadastroSus other = (RodCadastroSus) obj;
		if (cadSusDtNascimento == null) {
			if (other.cadSusDtNascimento != null)
				return false;
		} else if (!cadSusDtNascimento.equals(other.cadSusDtNascimento))
			return false;
		if (cadSusNCartao == null) {
			if (other.cadSusNCartao != null)
				return false;
		} else if (!cadSusNCartao.equals(other.cadSusNCartao))
			return false;
		if (cadSusNome == null) {
			if (other.cadSusNome != null)
				return false;
		} else if (!cadSusNome.equals(other.cadSusNome))
			return false;
		if (cadSusNomeMae == null) {
			if (other.cadSusNomeMae != null)
				return false;
		} else if (!cadSusNomeMae.equals(other.cadSusNomeMae))
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
		return "RodCadastroSus [id=" + id + ", cadSusNCartao=" + cadSusNCartao
				+ ", cadSusNome=" + cadSusNome + ", cadSusDtNascimento="
				+ cadSusDtNascimento + ", cadSusNomeMae=" + cadSusNomeMae + "]";
	}


	
}
