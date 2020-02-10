package br.com.cielo.api.exception;

import java.io.FileNotFoundException;


public class ArquivoException extends RuntimeException {
	public ArquivoException(String message) {
        super(message);
    }
}
