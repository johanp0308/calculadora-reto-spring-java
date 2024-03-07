package com.campus.reto2.calculadora.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campus.reto2.calculadora.persistence.entity.OperationEntity;

public interface OperationRepository extends JpaRepository<OperationEntity,Long>{

}
