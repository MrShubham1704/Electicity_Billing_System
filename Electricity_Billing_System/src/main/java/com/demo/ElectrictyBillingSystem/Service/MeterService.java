package com.demo.ElectrictyBillingSystem.Service;

import java.util.List;

import com.demo.ElectrictyBillingSystem.Entities.Meter;

public interface MeterService {
	    List<Meter> getMeters();
	    Meter getMeter(long meterId);
	    Meter addMeter(Meter meter);
	    Meter updateMeter(Meter meter);
	    void deleteMeter(long meterId);
}
