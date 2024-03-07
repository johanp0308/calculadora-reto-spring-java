package com.campus.reto2.calculadora.web.excepciones;

public class OperationPathError extends RuntimeException {
    public OperationPathError(String message){
        super(message);
    }
}
