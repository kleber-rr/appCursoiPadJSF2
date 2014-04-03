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
@Table(name = "rod_servicos", schema = "public")
public class RodServicos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "srv_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Basic(optional = false)
	@Column(name = "srv_descricao")
	private String descricao;

	@Basic(optional = false)
	@Column(name = "srv_livre")
	private boolean livre;

	@Basic(optional = false)
	@Column(name = "srv_qtd_enviado")
	private Integer qtdEnviado;

	@Basic(optional = false)
	@Column(name = "srv_qtd_recebido")
	private Integer qtdRecebido;

	@Basic(optional = false)
	@Column(name = "srv_qtd_atendido")
	private Integer qtdAtendido;

	@Basic(optional = false)
	@Column(name = "srv_qtd_cancelado")
	private Integer qtdCancelado;

	@Basic(optional = false)
	@Column(name = "srv_st_exibir")
	private boolean stExibir;
	
//	@SuppressWarnings("unused")
//	private String livreOcupado;

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

	public boolean isLivre() {
		return livre;
	}

	public void setLivre(boolean livre) {
		this.livre = livre;
	}

	public Integer getQtdEnviado() {
		return qtdEnviado;
	}

	public void setQtdEnviado(Integer qtdEnviado) {
		this.qtdEnviado = qtdEnviado;
	}

	public Integer getQtdRecebido() {
		return qtdRecebido;
	}

	public void setQtdRecebido(Integer qtdRecebido) {
		this.qtdRecebido = qtdRecebido;
	}

	public Integer getQtdAtendido() {
		return qtdAtendido;
	}

	public void setQtdAtendido(Integer qtdAtendido) {
		this.qtdAtendido = qtdAtendido;
	}

	public Integer getQtdCancelado() {
		return qtdCancelado;
	}

	public void setQtdCancelado(Integer qtdCancelado) {
		this.qtdCancelado = qtdCancelado;
	}

	public boolean isStExibir() {
		return stExibir;
	}

	public void setStExibir(boolean stExibir) {
		this.stExibir = stExibir;
	}

	public RodServicos(){
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (livre ? 1231 : 1237);
		result = prime * result
				+ ((qtdAtendido == null) ? 0 : qtdAtendido.hashCode());
		result = prime * result
				+ ((qtdCancelado == null) ? 0 : qtdCancelado.hashCode());
		result = prime * result
				+ ((qtdEnviado == null) ? 0 : qtdEnviado.hashCode());
		result = prime * result
				+ ((qtdRecebido == null) ? 0 : qtdRecebido.hashCode());
		result = prime * result + (stExibir ? 1231 : 1237);
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
		RodServicos other = (RodServicos) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (livre != other.livre)
			return false;
		if (qtdAtendido == null) {
			if (other.qtdAtendido != null)
				return false;
		} else if (!qtdAtendido.equals(other.qtdAtendido))
			return false;
		if (qtdCancelado == null) {
			if (other.qtdCancelado != null)
				return false;
		} else if (!qtdCancelado.equals(other.qtdCancelado))
			return false;
		if (qtdEnviado == null) {
			if (other.qtdEnviado != null)
				return false;
		} else if (!qtdEnviado.equals(other.qtdEnviado))
			return false;
		if (qtdRecebido == null) {
			if (other.qtdRecebido != null)
				return false;
		} else if (!qtdRecebido.equals(other.qtdRecebido))
			return false;
		if (stExibir != other.stExibir)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RodServicos [id=" + id + ", descricao=" + descricao
				+ ", livre=" + livre + ", qtdEnviado=" + qtdEnviado
				+ ", qtdRecebido=" + qtdRecebido + ", qtdAtendido="
				+ qtdAtendido + ", qtdCancelado=" + qtdCancelado
				+ ", stExibir=" + stExibir + "]";
	}


//	public String getLivreOcupado() {
//		if(livre == true){
//			return "Livre";
//		} else {
//			return "Lotado";
//		}
//
//	}
//
//	public void setLivreOcupado(String livreOcupado) {
//		this.livreOcupado = livreOcupado;
//	}
//	
}
