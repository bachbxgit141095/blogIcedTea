package com.iced.tea.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST,reason = "Exception When Request")
public class HttpResponseException extends Exception {
    public HttpResponseException(String msg){
        super(msg);
    }
}
