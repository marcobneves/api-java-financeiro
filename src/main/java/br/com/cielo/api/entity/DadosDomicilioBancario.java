package br.com.cielo.api.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DadosDomicilioBancario {

	@SerializedName("codigoBanco")
	@Expose
	private Long codigoBanco;
	
	@SerializedName("numeroAgencia")
	@Expose
	private Long numeroAgencia;
	
	@SerializedName("numeroContaCorrente")
	@Expose
	private String numeroContaCorrente;

	public Long getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(Long codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public Long getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(Long numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

}
