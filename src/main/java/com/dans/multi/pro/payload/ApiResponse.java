package com.dans.multi.pro.payload;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiResponse {
    private HttpStatus status;
    private String message;

    public ApiResponse(String message) {
        this.message = message;
        this.status = HttpStatus.OK;
    }

}
