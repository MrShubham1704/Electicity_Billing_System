package com.demo.ElectrictyBillingSystem.Service;

import java.util.List;

import com.demo.ElectrictyBillingSystem.Entities.Payment;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment getPaymentById(Long paymentId);
    Payment addPayment(Payment payment);
    Payment updatePayment(Payment payment);
    void deletePayment(Long paymentId);
}
