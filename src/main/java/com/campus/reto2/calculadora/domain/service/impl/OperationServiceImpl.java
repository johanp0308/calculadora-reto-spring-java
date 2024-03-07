package com.campus.reto2.calculadora.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.campus.reto2.calculadora.domain.repository.OperationRepository;
import com.campus.reto2.calculadora.domain.service.OperationService;
import com.campus.reto2.calculadora.persistence.entity.OperationEntity;
import com.campus.reto2.calculadora.web.excepciones.OperationNotFound;

@Service
public class OperationServiceImpl implements OperationService{

    private final OperationRepository operationRepository;

    @Autowired
    public OperationServiceImpl(OperationRepository operationRepository){
        this.operationRepository = operationRepository;
    }

    @Override
    public List<OperationEntity> getAll() {
        return operationRepository.findAll();
    }

    @Override
    public ResponseEntity<OperationEntity> getById(Long id) {
        Optional<OperationEntity> oOperation = operationRepository.findById(id);
        return oOperation.map(oper -> ResponseEntity.ok(oper))
            .orElseThrow(() -> new OperationNotFound("No se encontro"));
    }

    @Override
    public ResponseEntity<OperationEntity> saveOperation(OperationEntity operation) {
        Optional<OperationEntity> oOperation = Optional.of(operationRepository.save(operation));
        return oOperation.map(oper -> ResponseEntity.ok(oper)).orElse(null);
    }

    @Override
    public ResponseEntity<OperationEntity> updateOperation(Long id, OperationEntity operation) {
        Optional<OperationEntity> oOperation = operationRepository.findById(id);
        if(oOperation.isPresent()){
            OperationEntity oper1 = oOperation.get();
            oper1.setOperand1(operation.getOperand1());
            oper1.setOperand2(operation.getOperand2());
            oper1.setOperationType(operation.getOperationType());
            oper1.setResult(operation.getResult());
            oper1.setHora(operation.getHora());
            return ResponseEntity.ok(operationRepository.save(oper1));
        }else{
            throw new OperationNotFound("Operacion no encontrada");
        }
    }

    @Override
    public ResponseEntity<Void> deleteEntity(Long id) {
        if (operationRepository.existsById(id)) {
            operationRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
