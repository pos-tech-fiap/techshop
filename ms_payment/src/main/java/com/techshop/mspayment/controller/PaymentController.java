package com.techshop.mspayment.controller;

import com.techshop.mspayment.DTO.PaymentDTO;
import com.techshop.mspayment.entity.Payment;
import com.techshop.mspayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PaymentDTO> findById(@PathVariable Long id) {
        Payment payment = paymentService.findById(id);
        return ResponseEntity.ok().body(new PaymentDTO(payment));
    }

    @PostMapping
    public ResponseEntity<PaymentDTO> save(@RequestBody PaymentDTO paymentDTO) {
        Payment payment = paymentService.save(paymentDTO);
        return ResponseEntity.ok().body(new PaymentDTO(payment));
    }
}
