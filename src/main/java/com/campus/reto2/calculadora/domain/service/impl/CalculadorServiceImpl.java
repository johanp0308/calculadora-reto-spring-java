package com.campus.reto2.calculadora.domain.service.impl;

import java.time.Instant;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.campus.reto2.calculadora.domain.repository.OperationRepository;
import com.campus.reto2.calculadora.domain.service.CalculadoraService;
import com.campus.reto2.calculadora.domain.service.OperationService;
import com.campus.reto2.calculadora.persistence.entity.OperationEntity;
import com.campus.reto2.calculadora.web.excepciones.OperationPathError;

@Service
public class CalculadorServiceImpl implements CalculadoraService{
    
    private final OperationRepository operationRepository;

    @Autowired
    public CalculadorServiceImpl(OperationRepository operationRepository){
        this.operationRepository = operationRepository;
    }

    @Override
    public ResponseEntity<OperationEntity> suma(String operand1, String operand2) {
        try {
            double oper1 = Double.valueOf(operand1);  
            double oper2 = Double.valueOf(operand2);  
            OperationEntity oper = new OperationEntity();
            oper.setOperand1(oper1);
            oper.setOperand2(oper1);
            oper.setOperationType("+");
            oper.setResult(oper1+oper2);
            oper.setHora(Date.from(Instant.now()));
            Optional<OperationEntity> oOperation = Optional.of(operationRepository.save(oper));
            return oOperation.map(opera -> ResponseEntity.ok(oper)).orElse(null);
        } catch (Exception e){
            throw new OperationPathError("Los datos: "+operand1+", "+operand2+" son incorrectos");
        }
    }

    @Override
    public ResponseEntity<OperationEntity> restar(String operand1, String operand2) {
        try {
            double oper1 = Double.valueOf(operand1);  
            double oper2 = Double.valueOf(operand2);  
            OperationEntity oper = new OperationEntity();
            oper.setOperand1(oper1);
            oper.setOperand2(oper1);
            oper.setOperationType("-");
            oper.setResult(oper1-oper2);
            oper.setHora(Date.from(Instant.now()));
            Optional<OperationEntity> oOperation = Optional.of(operationRepository.save(oper));
            return oOperation.map(opera -> ResponseEntity.ok(oper)).orElse(null);
        } catch (Exception e) {
            throw new OperationPathError("Los datos: "+operand1+", "+operand2+" son incorrectos");
        }
    }

    @Override
    public ResponseEntity<OperationEntity> division(String operand1, String operand2) {
        try {
            double oper1 = Double.valueOf(operand1);  
            double oper2 = Double.valueOf(operand2);  
            OperationEntity oper = new OperationEntity();
            oper.setOperand1(oper1);
            oper.setOperand2(oper1);
            oper.setOperationType("/");
            oper.setResult(oper1/oper2);
            oper.setHora(Date.from(Instant.now()));
            Optional<OperationEntity> oOperation = Optional.of(operationRepository.save(oper));
            return oOperation.map(opera -> ResponseEntity.ok(oper)).orElse(null);
        } catch (Exception e) {
            throw new OperationPathError("Los datos: "+operand1+", "+operand2+" son incorrectos");
        }
    }

    @Override
    public ResponseEntity<OperationEntity> multiplica(String operand1, String operand2) {
        try {
            double oper1 = Double.valueOf(operand1);  
            double oper2 = Double.valueOf(operand2);  
            OperationEntity oper = new OperationEntity();
            oper.setOperand1(oper1);
            oper.setOperand2(oper1);
            oper.setOperationType("*");
            oper.setResult(oper1*oper2);
            oper.setHora(Date.from(Instant.now()));
            Optional<OperationEntity> oOperation = Optional.of(operationRepository.save(oper));
            return oOperation.map(opera -> ResponseEntity.ok(oper)).orElse(null);
        } catch (Exception e) {
            throw new OperationPathError("Los datos: "+operand1+", "+operand2+" son incorrectos");
        }
    }


}
