package com.demo.ElectrictyBillingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ElectrictyBillingSystem.Entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>  {

}
