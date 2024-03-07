package com.campus.reto2.calculadora.web.excepciones;

public class OperationNotFound extends RuntimeException{
    
    public OperationNotFound(String message){
        super(message);
    }
}
