package com.campus.reto2.calculadora.domain.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.campus.reto2.calculadora.persistence.entity.OperationEntity;

public interface OperationService {

    List<OperationEntity> getAll();
    ResponseEntity<OperationEntity> getById(Long id);
    ResponseEntity<OperationEntity> saveOperation(OperationEntity operation);
    ResponseEntity<OperationEntity> updateOperation(Long id, OperationEntity operation);
    ResponseEntity<Void> deleteEntity(Long id);
}
