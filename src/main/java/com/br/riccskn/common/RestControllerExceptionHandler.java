package com.br.riccskn.common;

import com.br.riccskn.exception.BaseException;
import com.br.riccskn.exception.DespesaNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class RestControllerExceptionHandler {

    public ResponseEntity<ApiResponse> resolveException(BaseException exception) {

        ApiResponse response = new ApiResponse(exception.getMessage());

        return new ResponseEntity<>(response,exception.getStatus());
    }

    @ExceptionHandler
    @ResponseBody
    public ResponseEntity<ApiResponse> resolveException(DespesaNotFoundException exception) {

        ApiResponse response = new ApiResponse(exception.getMessage());

        return new ResponseEntity<>(response,exception.getStatus());
    }


}
