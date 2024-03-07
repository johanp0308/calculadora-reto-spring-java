package com.campus.reto2.calculadora.web.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandle {
    
    @ExceptionHandler(OperationNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handlOperationNotFound(OperationNotFound ex){
        ErrorResponses errorResponses = new ErrorResponses("No se encontro",ex.getMessage());
        return new ResponseEntity<>(errorResponses,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(OperationPathError.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object> handlOperationPathError(OperationPathError ex){
        ErrorResponses errorResponses = new ErrorResponses("Ruta mal escrita", ex.getMessage());
        return new ResponseEntity<>(errorResponses,HttpStatus.BAD_REQUEST);
    }


}
