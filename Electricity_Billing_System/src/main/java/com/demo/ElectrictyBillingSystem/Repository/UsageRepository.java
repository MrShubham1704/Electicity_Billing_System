package com.demo.ElectrictyBillingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ElectrictyBillingSystem.Entities.Usage;

public interface UsageRepository extends JpaRepository<Usage, Long>{

}
