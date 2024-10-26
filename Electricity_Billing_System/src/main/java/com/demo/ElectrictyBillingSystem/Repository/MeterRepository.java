package com.demo.ElectrictyBillingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ElectrictyBillingSystem.Entities.Meter;

public interface MeterRepository extends JpaRepository<Meter, Long> {

}
