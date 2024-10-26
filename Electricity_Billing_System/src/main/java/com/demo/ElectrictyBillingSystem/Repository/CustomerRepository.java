package com.demo.ElectrictyBillingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ElectrictyBillingSystem.Entities.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
