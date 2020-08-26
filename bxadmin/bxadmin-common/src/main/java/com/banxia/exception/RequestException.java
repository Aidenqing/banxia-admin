package com.banxia.exception;

import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 12:37 2020/8/25
 */
public class RequestException extends RuntimeException {
    private Integer status = BAD_REQUEST.value();

    public RequestException(HttpStatus status, String msg) {

        this.status = status.value();
    }

    public RequestException(String msg) {
        super(msg);
    }

    public Integer getStatus() {
        return status;
    }
}
