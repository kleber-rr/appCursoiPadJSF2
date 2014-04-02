package br.gov.rr.smsa.rodio.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.gov.rr.smsa.rodio.dao.DaoServicosImpl;
import br.gov.rr.smsa.rodio.entidades.RodServicos;

@ManagedBean(name = "rodServicosBean")
@SessionScoped
public class RodServicosController implements Serializable {

	private static final long serialVersionUID = 1L;

	private RodServicos servicos;
	private List<RodServicos> lista;

	public RodServicosController(){
		servicos = new RodServicos();
		DaoServicosImpl dao = new DaoServicosImpl();
		lista = dao.listaSimples();
	}

	
	public void listaTodos() {
		DaoServicosImpl dao = new DaoServicosImpl();
		lista = dao.lista();
	}
	
	public RodServicos getServicos() {
		return servicos;
	}

	public void setServicos(RodServicos servicos) {
		this.servicos = servicos;
	}


	public List<RodServicos> getLista() {
		return lista;
	}

	public void setLista(List<RodServicos> lista) {
		this.lista = lista;
	}

}
