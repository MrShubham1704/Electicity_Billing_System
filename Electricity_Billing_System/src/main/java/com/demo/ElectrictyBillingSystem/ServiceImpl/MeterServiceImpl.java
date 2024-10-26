package com.demo.ElectrictyBillingSystem.ServiceImpl;


import com.demo.ElectrictyBillingSystem.Entities.Meter;
import com.demo.ElectrictyBillingSystem.Repository.MeterRepository;
import com.demo.ElectrictyBillingSystem.Service.MeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeterServiceImpl implements MeterService {

    @Autowired
    private MeterRepository meterRepository;

    @Override
    public List<Meter> getMeters() {
        return meterRepository.findAll();
    }

    @Override
    public Meter getMeter(long meterId) {
        Optional<Meter> meter = meterRepository.findById(meterId);
        return meter.orElse(null);
    }

    @Override
    public Meter addMeter(Meter meter) {
        return meterRepository.save(meter);
    }

    @Override
    public Meter updateMeter(Meter meter) {
        if (meterRepository.existsById(meter.getMeterId())) {
            return meterRepository.save(meter);
        }
        return null;
    }

    @Override
    public void deleteMeter(long meterId) {
        if (meterRepository.existsById(meterId)) {
            meterRepository.deleteById(meterId);
        }
    }
}
