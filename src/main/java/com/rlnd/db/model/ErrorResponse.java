package com.rlnd.db.model;

import lombok.Getter;

@Getter
public class ErrorResponse extends DefaultResponse {

    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }
    
}
