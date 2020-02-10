package br.com.cielo.api.entity;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LancamentoContaCorrenteCliente {

	@SerializedName("numeroRemessaBanco")
	@Expose
	private Long numeroRemessaBanco;

	@SerializedName("nomeSituacaoRemessa")
	@Expose
	private String nomeSituacaoRemessa;

	@SerializedName("dadosDomicilioBancario")
	@Expose
	private DadosDomicilioBancario dadosDomicilioBancario;

	@SerializedName("nomeTipoOperacao")
	@Expose
	private String nomeTipoOperacao;

	@SerializedName("dadosAnaliticoLancamentoFinanceiroCliente")
	@Expose
	private List<Object> dadosAnaliticoLancamentoFinanceiroCliente = null;

	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public List<Object> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	public void setDadosAnaliticoLancamentoFinanceiroCliente(List<Object> dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}
}
