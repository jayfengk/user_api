package com.example.user_api.exception;

import com.example.user_api.pojo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // 統一處理
public class GlobalExceptionHandlerAdvice {

    Logger log = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);

    @ExceptionHandler({Exception.class}) // 異常統一處理
    public ResponseMessage handleException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        // log
        log.error("異常: ", e);
        return new ResponseMessage(500, "error", null);
    }
}
