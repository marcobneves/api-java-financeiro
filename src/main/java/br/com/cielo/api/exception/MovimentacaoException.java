package br.com.cielo.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class MovimentacaoException extends RuntimeException {
	
	public MovimentacaoException(String message) {
        super(message);
    }
}
