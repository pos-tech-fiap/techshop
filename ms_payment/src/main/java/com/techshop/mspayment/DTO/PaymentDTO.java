package com.techshop.mspayment.DTO;

import com.techshop.mspayment.entity.Payment;
import com.techshop.mspayment.entity.PaymentMethod;
import com.techshop.mspayment.entity.PaymentStatus;

import jakarta.validation.constraints.NotNull;

public class PaymentDTO {

    private Long id;

    private PaymentStatus status;

    @NotNull
    private PaymentMethod method;

    @NotNull
    private Long userId;

    @NotNull
    private Double value;

    public PaymentDTO(PaymentStatus status, PaymentMethod method, Long userId, Double value) {
        this.status = status;
        this.method = method;
        this.userId = userId;
        this.value = value;
    }

    public PaymentDTO(Payment payment) {
        this.id = payment.getId();
        this.status = payment.getStatus();
        this.method = payment.getMethod();
        this.userId = payment.getUserId();
        this.value = payment.getValue();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
