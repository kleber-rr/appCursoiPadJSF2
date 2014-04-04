package br.gov.rr.smsa.rodio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the pessoas database table.
 * 
 */
@Entity
@Table(name = "pessoas")
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_pessoa")
	private Integer idPessoa;

	private String cargo;

	@Column(name = "hora_chegada")
	private Timestamp horaChegada;

	@Column(name = "hora_saida")
	private Timestamp horaSaida;

	private String nome;

	@Column(name = "nome_cracha")
	private String nomeCracha;

	private String setor;

	private String superintendencia;

	public Pessoa() {
	}

	public Integer getIdPessoa() {
		return this.idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Timestamp getHoraChegada() {
		return this.horaChegada;
	}

	public void setHoraChegada(Timestamp horaChegada) {
		this.horaChegada = horaChegada;
	}

	public Timestamp getHoraSaida() {
		return this.horaSaida;
	}

	public void setHoraSaida(Timestamp horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCracha() {
		return this.nomeCracha;
	}

	public void setNomeCracha(String nomeCracha) {
		this.nomeCracha = nomeCracha;
	}

	public String getSetor() {
		return this.setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getSuperintendencia() {
		return this.superintendencia;
	}

	public void setSuperintendencia(String superintendencia) {
		this.superintendencia = superintendencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result
				+ ((horaChegada == null) ? 0 : horaChegada.hashCode());
		result = prime * result
				+ ((horaSaida == null) ? 0 : horaSaida.hashCode());
		result = prime * result
				+ ((idPessoa == null) ? 0 : idPessoa.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((nomeCracha == null) ? 0 : nomeCracha.hashCode());
		result = prime * result + ((setor == null) ? 0 : setor.hashCode());
		result = prime
				* result
				+ ((superintendencia == null) ? 0 : superintendencia.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (horaChegada == null) {
			if (other.horaChegada != null)
				return false;
		} else if (!horaChegada.equals(other.horaChegada))
			return false;
		if (horaSaida == null) {
			if (other.horaSaida != null)
				return false;
		} else if (!horaSaida.equals(other.horaSaida))
			return false;
		if (idPessoa == null) {
			if (other.idPessoa != null)
				return false;
		} else if (!idPessoa.equals(other.idPessoa))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeCracha == null) {
			if (other.nomeCracha != null)
				return false;
		} else if (!nomeCracha.equals(other.nomeCracha))
			return false;
		if (setor == null) {
			if (other.setor != null)
				return false;
		} else if (!setor.equals(other.setor))
			return false;
		if (superintendencia == null) {
			if (other.superintendencia != null)
				return false;
		} else if (!superintendencia.equals(other.superintendencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", cargo=" + cargo
				+ ", horaChegada=" + horaChegada + ", horaSaida=" + horaSaida
				+ ", nome=" + nome + ", nomeCracha=" + nomeCracha + ", setor="
				+ setor + ", superintendencia=" + superintendencia + "]";
	}

}