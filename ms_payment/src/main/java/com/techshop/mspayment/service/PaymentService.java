package com.techshop.mspayment.service;

import com.techshop.mspayment.DTO.PaymentDTO;
import com.techshop.mspayment.entity.Payment;
import com.techshop.mspayment.entity.PaymentStatus;
import com.techshop.mspayment.repository.PaymentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment findById(Long id) {
        return paymentRepository.findById(id).orElseThrow(() -> new RuntimeException("Payment not found"));
    }

    public Payment save(PaymentDTO paymentDTO) {
        Payment payment = new Payment();
        mapperDtoToEntity(payment, paymentDTO);
        payment.setStatus(PaymentStatus.PENDING);
        return paymentRepository.save(payment);
    }

    private void mapperDtoToEntity(Payment payment, PaymentDTO paymentDTO) {
        payment.setMethod(paymentDTO.getMethod());
        payment.setUserId(paymentDTO.getUserId());
        payment.setValue(paymentDTO.getValue());
    }

}
