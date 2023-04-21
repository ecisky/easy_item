package com.easy.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResultData exceptionHandler(Exception e) {
        ResultData ret = ResultData.init();
        ret.setResult_code(9);
        ret.setMsg(e.getMessage());
        return ret;
    }

    @ExceptionHandler(GlobalException.class)
    public ResultData exceptionHandler(GlobalException e) {
        ResultData ret = ResultData.init();
        ret.setResult_code(e.getErrorCode());
        ret.setMsg(e.getMessage());
        return ret;
    }
}
