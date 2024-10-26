package com.demo.ElectrictyBillingSystem.ServiceImpl;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.ElectrictyBillingSystem.Entities.Usage;
import com.demo.ElectrictyBillingSystem.Repository.UsageRepository;
import com.demo.ElectrictyBillingSystem.Service.UsageService;

@Service
public class UsageServiceImpl implements UsageService {
    @Autowired
    private UsageRepository usageRepository;

    @Override
    public List<Usage> getUsages() {
        return usageRepository.findAll();
    }

    @Override
    public Usage getUsage(long usageId) {
        Optional<Usage> usage = usageRepository.findById(usageId);
        return usage.orElse(null);
    }

    @Override
    public Usage addUsage(Usage usage) {
        return usageRepository.save(usage);
    }

    @Override
    public Usage updateUsage(Usage usage) {
        if (usageRepository.existsById(usage.getUsageId())) {
            return usageRepository.save(usage);
        }
        return null; // Return null if usage does not exist
    }

    @Override
    public void deleteUsage(long usageId) {
        if (usageRepository.existsById(usageId)) {
            usageRepository.deleteById(usageId);
        }
    }
}
