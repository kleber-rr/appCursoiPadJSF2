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
@Table(name = "pessoas", catalog = "rodio", schema = "public")
public class RodPessoas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "id_pessoa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Basic(optional = false)
	@Column(name = "nome_pessoa")
	private String nomePessoa;

	@Basic(optional = false)
	@Column(name = "dt_nasc_pessoa")
	private Date dtNascPessoa;

	@Basic(optional = false)
	@Column(name = "sexo_pessoa")
	private String sexoPessoa;

	@Basic(optional = false)
	@Column(name = "municipio_nasc_pessoa")
	private Integer municipioNascPessoa;

	@Basic(optional = false)
	@Column(name = "nome_mae_pessoa")
	private String nomeMaePessoa;

	@Basic(optional = false)
	@Column(name = "cpf_pessoa")
	private String cpfPessoa;

	@Basic(optional = false)
	@Column(name = "endereco_pessoa")
	private String enderecoPessoa;

	@Basic(optional = false)
	@Column(name = "bairro_pessoa")
	private String bairroPessoa;

	@Basic(optional = false)
	@Column(name = "fk_usb")
	private RodUbs fkUsb;

	@Basic(optional = false)
	@Column(name = "est_civil")
	private Integer estCivil;

	@Basic(optional = false)
	@Column(name = "natural_pessoa")
	private String natural_pessoa;

	@Basic(optional = false)
	@Column(name = "cartao_sus")
	private BigInteger cartao_sus;

	@Basic(optional = false)
	@Column(name = "profissao_pessoa")
	private String profissaoPessoa;

	@Basic(optional = false)
	@Column(name = "telefone_pessoa")
	private String telefonePessoa;

	@Basic(optional = false)
	@Column(name = "cor_pessoa")
	private Integer corPessoa;

	@Basic(optional = false)
	@Column(name = "uf_pessoa")
	private String ufPessoa;

	@Basic(optional = false)
	@Column(name = "credencial")
	private Integer credencial;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public Date getDtNascPessoa() {
		return dtNascPessoa;
	}

	public void setDtNascPessoa(Date dtNascPessoa) {
		this.dtNascPessoa = dtNascPessoa;
	}

	public String getSexoPessoa() {
		return sexoPessoa;
	}

	public void setSexoPessoa(String sexoPessoa) {
		this.sexoPessoa = sexoPessoa;
	}

	public Integer getMunicipioNascPessoa() {
		return municipioNascPessoa;
	}

	public void setMunicipioNascPessoa(Integer municipioNascPessoa) {
		this.municipioNascPessoa = municipioNascPessoa;
	}

	public String getNomeMaePessoa() {
		return nomeMaePessoa;
	}

	public void setNomeMaePessoa(String nomeMaePessoa) {
		this.nomeMaePessoa = nomeMaePessoa;
	}

	public String getCpfPessoa() {
		return cpfPessoa;
	}

	public void setCpfPessoa(String cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}

	public String getEnderecoPessoa() {
		return enderecoPessoa;
	}

	public void setEnderecoPessoa(String enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
	}

	public String getBairroPessoa() {
		return bairroPessoa;
	}

	public void setBairroPessoa(String bairroPessoa) {
		this.bairroPessoa = bairroPessoa;
	}

	public RodUbs getFkUsb() {
		return fkUsb;
	}

	public void setFkUsb(RodUbs fkUsb) {
		this.fkUsb = fkUsb;
	}

	public Integer getEstCivil() {
		return estCivil;
	}

	public void setEstCivil(Integer estCivil) {
		this.estCivil = estCivil;
	}

	public String getNatural_pessoa() {
		return natural_pessoa;
	}

	public void setNatural_pessoa(String natural_pessoa) {
		this.natural_pessoa = natural_pessoa;
	}

	public BigInteger getCartao_sus() {
		return cartao_sus;
	}

	public void setCartao_sus(BigInteger cartao_sus) {
		this.cartao_sus = cartao_sus;
	}

	public String getProfissaoPessoa() {
		return profissaoPessoa;
	}

	public void setProfissaoPessoa(String profissaoPessoa) {
		this.profissaoPessoa = profissaoPessoa;
	}

	public String getTelefonePessoa() {
		return telefonePessoa;
	}

	public void setTelefonePessoa(String telefonePessoa) {
		this.telefonePessoa = telefonePessoa;
	}

	public Integer getCorPessoa() {
		return corPessoa;
	}

	public void setCorPessoa(Integer corPessoa) {
		this.corPessoa = corPessoa;
	}

	public String getUfPessoa() {
		return ufPessoa;
	}

	public void setUfPessoa(String ufPessoa) {
		this.ufPessoa = ufPessoa;
	}

	public Integer getCredencial() {
		return credencial;
	}

	public void setCredencial(Integer credencial) {
		this.credencial = credencial;
	}

	public RodPessoas(){
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bairroPessoa == null) ? 0 : bairroPessoa.hashCode());
		result = prime * result
				+ ((cartao_sus == null) ? 0 : cartao_sus.hashCode());
		result = prime * result
				+ ((corPessoa == null) ? 0 : corPessoa.hashCode());
		result = prime * result
				+ ((cpfPessoa == null) ? 0 : cpfPessoa.hashCode());
		result = prime * result
				+ ((credencial == null) ? 0 : credencial.hashCode());
		result = prime * result
				+ ((dtNascPessoa == null) ? 0 : dtNascPessoa.hashCode());
		result = prime * result
				+ ((enderecoPessoa == null) ? 0 : enderecoPessoa.hashCode());
		result = prime * result
				+ ((estCivil == null) ? 0 : estCivil.hashCode());
		result = prime * result + ((fkUsb == null) ? 0 : fkUsb.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime
				* result
				+ ((municipioNascPessoa == null) ? 0 : municipioNascPessoa
						.hashCode());
		result = prime * result
				+ ((natural_pessoa == null) ? 0 : natural_pessoa.hashCode());
		result = prime * result
				+ ((nomeMaePessoa == null) ? 0 : nomeMaePessoa.hashCode());
		result = prime * result
				+ ((nomePessoa == null) ? 0 : nomePessoa.hashCode());
		result = prime * result
				+ ((profissaoPessoa == null) ? 0 : profissaoPessoa.hashCode());
		result = prime * result
				+ ((sexoPessoa == null) ? 0 : sexoPessoa.hashCode());
		result = prime * result
				+ ((telefonePessoa == null) ? 0 : telefonePessoa.hashCode());
		result = prime * result
				+ ((ufPessoa == null) ? 0 : ufPessoa.hashCode());
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
		RodPessoas other = (RodPessoas) obj;
		if (bairroPessoa == null) {
			if (other.bairroPessoa != null)
				return false;
		} else if (!bairroPessoa.equals(other.bairroPessoa))
			return false;
		if (cartao_sus == null) {
			if (other.cartao_sus != null)
				return false;
		} else if (!cartao_sus.equals(other.cartao_sus))
			return false;
		if (corPessoa == null) {
			if (other.corPessoa != null)
				return false;
		} else if (!corPessoa.equals(other.corPessoa))
			return false;
		if (cpfPessoa == null) {
			if (other.cpfPessoa != null)
				return false;
		} else if (!cpfPessoa.equals(other.cpfPessoa))
			return false;
		if (credencial == null) {
			if (other.credencial != null)
				return false;
		} else if (!credencial.equals(other.credencial))
			return false;
		if (dtNascPessoa == null) {
			if (other.dtNascPessoa != null)
				return false;
		} else if (!dtNascPessoa.equals(other.dtNascPessoa))
			return false;
		if (enderecoPessoa == null) {
			if (other.enderecoPessoa != null)
				return false;
		} else if (!enderecoPessoa.equals(other.enderecoPessoa))
			return false;
		if (estCivil == null) {
			if (other.estCivil != null)
				return false;
		} else if (!estCivil.equals(other.estCivil))
			return false;
		if (fkUsb == null) {
			if (other.fkUsb != null)
				return false;
		} else if (!fkUsb.equals(other.fkUsb))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (municipioNascPessoa == null) {
			if (other.municipioNascPessoa != null)
				return false;
		} else if (!municipioNascPessoa.equals(other.municipioNascPessoa))
			return false;
		if (natural_pessoa == null) {
			if (other.natural_pessoa != null)
				return false;
		} else if (!natural_pessoa.equals(other.natural_pessoa))
			return false;
		if (nomeMaePessoa == null) {
			if (other.nomeMaePessoa != null)
				return false;
		} else if (!nomeMaePessoa.equals(other.nomeMaePessoa))
			return false;
		if (nomePessoa == null) {
			if (other.nomePessoa != null)
				return false;
		} else if (!nomePessoa.equals(other.nomePessoa))
			return false;
		if (profissaoPessoa == null) {
			if (other.profissaoPessoa != null)
				return false;
		} else if (!profissaoPessoa.equals(other.profissaoPessoa))
			return false;
		if (sexoPessoa == null) {
			if (other.sexoPessoa != null)
				return false;
		} else if (!sexoPessoa.equals(other.sexoPessoa))
			return false;
		if (telefonePessoa == null) {
			if (other.telefonePessoa != null)
				return false;
		} else if (!telefonePessoa.equals(other.telefonePessoa))
			return false;
		if (ufPessoa == null) {
			if (other.ufPessoa != null)
				return false;
		} else if (!ufPessoa.equals(other.ufPessoa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RodPessoas [id=" + id + ", nomePessoa=" + nomePessoa
				+ ", dtNascPessoa=" + dtNascPessoa + ", sexoPessoa="
				+ sexoPessoa + ", municipioNascPessoa=" + municipioNascPessoa
				+ ", nomeMaePessoa=" + nomeMaePessoa + ", cpfPessoa="
				+ cpfPessoa + ", enderecoPessoa=" + enderecoPessoa
				+ ", bairroPessoa=" + bairroPessoa + ", fkUsb=" + fkUsb
				+ ", estCivil=" + estCivil + ", natural_pessoa="
				+ natural_pessoa + ", cartao_sus=" + cartao_sus
				+ ", profissaoPessoa=" + profissaoPessoa + ", telefonePessoa="
				+ telefonePessoa + ", corPessoa=" + corPessoa + ", ufPessoa="
				+ ufPessoa + ", credencial=" + credencial + "]";
	}

	
	
}
