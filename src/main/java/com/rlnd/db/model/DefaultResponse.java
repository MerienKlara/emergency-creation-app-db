package com.rlnd.db.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class DefaultResponse {
    
    private int code = HttpStatus.INTERNAL_SERVER_ERROR.value();

}
