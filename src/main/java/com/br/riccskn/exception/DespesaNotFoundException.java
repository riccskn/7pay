package com.br.riccskn.exception;

import org.springframework.http.HttpStatus;

public class DespesaNotFoundException extends BaseException{
    public DespesaNotFoundException(HttpStatus status, String message) {
        super(status, message);
    }
}
