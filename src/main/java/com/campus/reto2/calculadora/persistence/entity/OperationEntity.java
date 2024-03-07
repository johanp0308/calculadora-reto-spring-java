package com.campus.reto2.calculadora.persistence.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table()
public class OperationEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String operationType;

    private double operand1;
    
    private double operand2;
    
    private double result;

    private Date hora;
    

    public OperationEntity() {
    }

    public OperationEntity(Long id, String operationType, double operand1, double operand2, double result, Date hora) {
        this.id = id;
        this.operationType = operationType;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
        this.hora = hora;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationType() {
        return this.operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public double getOperand1() {
        return this.operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return this.operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Date getHora() {
        return this.hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public OperationEntity id(Long id) {
        setId(id);
        return this;
    }

    public OperationEntity operationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    public OperationEntity operand1(double operand1) {
        setOperand1(operand1);
        return this;
    }

    public OperationEntity operand2(double operand2) {
        setOperand2(operand2);
        return this;
    }

    public OperationEntity result(double result) {
        setResult(result);
        return this;
    }

    public OperationEntity hora(Date hora) {
        setHora(hora);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OperationEntity)) {
            return false;
        }
        OperationEntity operationEntity = (OperationEntity) o;
        return Objects.equals(id, operationEntity.id) && Objects.equals(operationType, operationEntity.operationType) && operand1 == operationEntity.operand1 && operand2 == operationEntity.operand2 && result == operationEntity.result && Objects.equals(hora, operationEntity.hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, operationType, operand1, operand2, result, hora);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", operationType='" + getOperationType() + "'" +
            ", operand1='" + getOperand1() + "'" +
            ", operand2='" + getOperand2() + "'" +
            ", result='" + getResult() + "'" +
            ", hora='" + getHora() + "'" +
            "}";
    }
    
}
