package br.com.cielo.api.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaControleLancamento {

	@SerializedName("lancamentoContaCorrenteCliente")	
	@Expose
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;

	@SerializedName("dataEfetivaLancamento")
	@Expose
	private String dataEfetivaLancamento;

	@SerializedName("dataLancamentoContaCorrenteCliente")
	@Expose
	private String dataLancamentoContaCorrenteCliente;

	@SerializedName("numeroEvento")
	@Expose
	private Long numeroEvento;

	@SerializedName("descricaoGrupoPagamento")
	@Expose
	private String descricaoGrupoPagamento;

	@SerializedName("codigoIdentificadorUnico")
	@Expose
	private String codigoIdentificadorUnico;

	@SerializedName("nomeBanco")
	@Expose
	private String nomeBanco;

	@SerializedName("quantidadeLancamentoRemessa")
	@Expose
	private Long quantidadeLancamentoRemessa;

	@SerializedName("numeroRaizCNPJ")
	@Expose
	private String numeroRaizCNPJ;

	@SerializedName("numeroSufixoCNPJ")
	@Expose
	private String numeroSufixoCNPJ;

	@SerializedName("valorLancamentoRemessa")
	@Expose
	private Double valorLancamentoRemessa;

	@SerializedName("dateLancamentoContaCorrenteCliente")
	@Expose
	private Long dateLancamentoContaCorrenteCliente;

	@SerializedName("dateEfetivaLancamento")
	@Expose
	private Long dateEfetivaLancamento;

	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	public Long getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(Long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public Long getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	public void setQuantidadeLancamentoRemessa(Long quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	public Double getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public void setValorLancamentoRemessa(Double valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	public Long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	public void setDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	public Long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}
}
