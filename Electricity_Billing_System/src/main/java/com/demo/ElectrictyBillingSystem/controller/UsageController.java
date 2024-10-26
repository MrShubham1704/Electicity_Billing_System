package com.demo.ElectrictyBillingSystem.controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.ElectrictyBillingSystem.Entities.Usage;
import com.demo.ElectrictyBillingSystem.Service.UsageService;

@RestController
@RequestMapping("/api/usages")
public class UsageController {
    @Autowired
    private UsageService usageService;

    // Create a new usage
    @PostMapping
    public ResponseEntity<Usage> createUsage(@RequestBody Usage usage) {
        Usage savedUsage = usageService.addUsage(usage);
        return ResponseEntity.ok(savedUsage);
    }

    // Get all usages
    @GetMapping
    public ResponseEntity<List<Usage>> getAllUsages() {
        List<Usage> usages = usageService.getUsages();
        return ResponseEntity.ok(usages);
    }

    // Get a usage by ID
    @GetMapping("/{id}")
    public ResponseEntity<Usage> getUsageById(@PathVariable Long id) {
        Usage usage = usageService.getUsage(id);
        return ResponseEntity.ok(usage);
    }

    // Update a usage
    @PutMapping("/{id}")
    public ResponseEntity<Usage> updateUsage(@PathVariable Long id, @RequestBody Usage usageDetails) {
        usageDetails.setUsageId(id); // Set the ID to ensure the correct entity is updated
        Usage updatedUsage = usageService.updateUsage(usageDetails);
        return ResponseEntity.ok(updatedUsage);
    }

    // Delete a usage
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsage(@PathVariable Long id) {
        usageService.deleteUsage(id);
        return ResponseEntity.noContent().build();
    }
}
