package br.com.cielo.api.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalControleLancamento {

	@SerializedName("quantidadeLancamentos")
	@Expose
	private Long quantidadeLancamentos;
	
	@SerializedName("quantidadeRemessas")
	@Expose
	private Long quantidadeRemessas;
	
	@SerializedName("valorLancamentos")
	@Expose
	private Double valorLancamentos;

	public Long getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	public void setQuantidadeLancamentos(Long quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	public Long getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	public void setQuantidadeRemessas(Long quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	public Double getValorLancamentos() {
		return valorLancamentos;
	}

	public void setValorLancamentos(Double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

}
