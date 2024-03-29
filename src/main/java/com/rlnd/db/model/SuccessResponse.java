package com.rlnd.db.model;

import java.util.List;

import com.rlnd.db.dao.ECAEntries;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SuccessResponse extends DefaultResponse {

    private int code = HttpStatus.OK.value();
    private String message;
    private List<ECAEntries> entries;

    public SuccessResponse(String message) {
        this.message = message;
    }

    public SuccessResponse(List<ECAEntries> entries) {
        this.entries = entries;
    }


}
