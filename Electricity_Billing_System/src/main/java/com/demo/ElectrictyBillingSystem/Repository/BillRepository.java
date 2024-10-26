package com.demo.ElectrictyBillingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ElectrictyBillingSystem.Entities.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
