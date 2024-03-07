package com.campus.reto2.calculadora.web.excepciones;

public class OperationMathInvalid extends RuntimeException{
    public OperationMathInvalid(String message){
        super(message);
    }
}
