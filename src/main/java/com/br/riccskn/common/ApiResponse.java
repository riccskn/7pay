package com.br.riccskn.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.http.HttpStatus;


@Data
public class ApiResponse {

    private String message;

    @JsonIgnore
    private HttpStatus httpStatus;

    public ApiResponse(String message) {
        this.message = message;
    }


}
