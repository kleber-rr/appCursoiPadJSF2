package br.gov.rr.smsa.rodio.controllers;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;

import br.gov.rr.smsa.rodio.dao.DaoPessoasImpl;
import br.gov.rr.smsa.rodio.entidades.Pessoa;

@ManagedBean(name = "pessoasBean")
@SessionScoped
public class PessoaController implements Serializable {

	private static final long serialVersionUID = 1L;

	private Pessoa pessoa;
	private Integer idPessoa;
	private List<Pessoa> lista;
	@SuppressWarnings("rawtypes")
	private DataModel listaPessoas;
	private Pessoa pessoaSelecionado;

	public PessoaController() {
		pessoa = new Pessoa();
		DaoPessoasImpl dao = new DaoPessoasImpl();
		setLista(dao.listaSimples());
	}

	public void chamaPessoa(ActionEvent event) {
		UIComponent link = event.getComponent();
		UIParameter param = (UIParameter) link.findComponent("idPessoa");
		Integer id = (Integer) param.getValue();
		this.idPessoa = id;
	}


	public void chegarPessoa() {
		Integer id = (Integer) this.idPessoa;
		DaoPessoasImpl dao = new DaoPessoasImpl();
		this.pessoaSelecionado = dao.buscaPorId(id);
		Date gc = new Date();
		Timestamp tms = new Timestamp(gc.getTime());
		System.out.println("pessoa: " + id + " hora: " + tms);
		pessoaSelecionado.setHoraChegada(tms);
		dao.merge(pessoaSelecionado);
		FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Successo! ", "Horario de chegada gravado: " + tms.toString()));
	}


	public void sairPessoa() {
		Integer id = (Integer) this.idPessoa;
		DaoPessoasImpl dao = new DaoPessoasImpl();
		this.pessoaSelecionado = dao.buscaPorId(id);
		Date gc = new Date();
		Timestamp tms = new Timestamp(gc.getTime());
		System.out.println("pessoa: " + id + " hora: " + tms);
		pessoaSelecionado.setHoraSaida(tms);
		dao.merge(pessoaSelecionado);
		FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Successo! ", "Horario de saida gravado: " + tms.toString()));
	}

	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@SuppressWarnings("rawtypes")
	public DataModel getListaPessoas() {
		return listaPessoas;
	}

	@SuppressWarnings("rawtypes")
	public void setListaPessoas(DataModel listaPessoas) {
		this.listaPessoas = listaPessoas;
	}

	public Pessoa getPessoaSelecionado() {
		return pessoaSelecionado;
	}

	public void setPessoaSelecionado(Pessoa pessoaSelecionado) {
		this.pessoaSelecionado = pessoaSelecionado;
	}

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

}
