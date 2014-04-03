package br.gov.rr.smsa.rodio.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;

import br.gov.rr.smsa.rodio.dao.DaoServicosImpl;
import br.gov.rr.smsa.rodio.entidades.RodServicos;

@ManagedBean(name = "rodServicosBean")
@SessionScoped
public class RodServicosController implements Serializable {

	private static final long serialVersionUID = 1L;

	private RodServicos servicos;
	private List<RodServicos> lista;
	private DataModel listaServicos;
	private RodServicos servicoSelecionado;

	public RodServicosController() {
		servicos = new RodServicos();
		DaoServicosImpl dao = new DaoServicosImpl();
		lista = dao.listaSimples();
	}

	public void abreSistema(ActionEvent event) {
		UIComponent link = event.getComponent();
		UIParameter param = (UIParameter) link.findComponent("idServico");
		Integer id = (Integer) param.getValue();
		nomeServico(id);

	}

	public String nomeServico(Integer id) {
		DaoServicosImpl dao = new DaoServicosImpl();
		String nome = null;
		servicoSelecionado = dao.buscaPorId(id);
		nome = servicoSelecionado.getDescricao();
		System.out.println(nome);
//		vaiParaSistema();
		return nome;
	}

	public String vaiParaSistema() {
		return "pm:viewB";
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

	public DataModel getListaServicos() {
		return listaServicos;
	}

	public void setListaServicos(DataModel listaServicos) {
		this.listaServicos = listaServicos;
	}

	public RodServicos getServicoSelecionado() {
		return servicoSelecionado;
	}

	public void setServicoSelecionado(RodServicos servicoSelecionado) {
		this.servicoSelecionado = servicoSelecionado;
	}

}
