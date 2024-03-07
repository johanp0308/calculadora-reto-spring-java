package com.campus.reto2.calculadora.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.reto2.calculadora.domain.service.CalculadoraService;
import com.campus.reto2.calculadora.domain.service.OperationService;
import com.campus.reto2.calculadora.persistence.entity.OperationEntity;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/calcular")
public class CalculadorController {
    
    private final CalculadoraService calculadoraService;
    private final OperationService operationService;

    @Autowired
    public CalculadorController(CalculadoraService calculadoraService, OperationService operationService){
        this.calculadoraService = calculadoraService;
        this.operationService = operationService;
    }


    @PostMapping("/sumar")
    public ResponseEntity<OperationEntity> sumar(@RequestBody OperationEntity oper) {
        return calculadoraService.suma(String.valueOf(oper.getOperand1()), String.valueOf(oper.getOperand2()));
    }
    @PostMapping("/restar")
    public ResponseEntity<OperationEntity> restar(@RequestBody OperationEntity oper) {
        return calculadoraService.restar(String.valueOf(oper.getOperand1()), String.valueOf(oper.getOperand2()));
    }
    @PostMapping("/dividir")
    public ResponseEntity<OperationEntity> dividir(@RequestBody OperationEntity oper) {
        return calculadoraService.division(String.valueOf(oper.getOperand1()), String.valueOf(oper.getOperand2()));
    }
    @PostMapping("/multiplicar")
    public ResponseEntity<OperationEntity> multiplicar(@RequestBody OperationEntity oper) {
        return calculadoraService.multiplica(String.valueOf(oper.getOperand1()), String.valueOf(oper.getOperand2()));
    }
    
    @GetMapping("/")
    public List<OperationEntity> getAll() {
        return operationService.getAll();
    }
    
}
