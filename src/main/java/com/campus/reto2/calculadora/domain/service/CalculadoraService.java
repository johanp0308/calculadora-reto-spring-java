package com.campus.reto2.calculadora.domain.service;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;

import com.campus.reto2.calculadora.persistence.entity.OperationEntity;

public interface CalculadoraService {
    
    ResponseEntity<OperationEntity> suma(String operand1, String operand2);
    ResponseEntity<OperationEntity> restar(String operand1, String operand2);
    ResponseEntity<OperationEntity> division(String operand1, String operand2);
    ResponseEntity<OperationEntity> multiplica(String operand1, String operand2);
}
