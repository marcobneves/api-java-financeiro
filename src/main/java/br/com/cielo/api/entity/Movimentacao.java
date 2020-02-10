package br.com.cielo.api.entity;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Movimentacao {
	
	@SerializedName("totalControleLancamento")
	@Expose
	private TotalControleLancamento totalControleLancamento;
	
	@SerializedName("listaControleLancamento")
	@Expose
	private List<ListaControleLancamento> listaControleLancamento = null;
	
	@SerializedName("indice")
	@Expose
	private Long indice;
	
	@SerializedName("tamanhoPagina")
	@Expose
	private Long tamanhoPagina;
	
	@SerializedName("totalElements")
	@Expose
	private Long totalElements;

	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}

	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}

	public List<ListaControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	public Long getIndice() {
		return indice;
	}

	public void setIndice(Long indice) {
		this.indice = indice;
	}

	public Long getTamanhoPagina() {
		return tamanhoPagina;
	}

	public void setTamanhoPagina(Long tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	public Long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}
}
