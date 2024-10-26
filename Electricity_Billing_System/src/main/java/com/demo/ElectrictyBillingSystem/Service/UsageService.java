package com.demo.ElectrictyBillingSystem.Service;

import java.util.List;

import com.demo.ElectrictyBillingSystem.Entities.Usage;

public interface UsageService {

	List<Usage> getUsages(); // Retrieve all usages
	Usage getUsage(long usageId); // Retrieve a single usage
	Usage addUsage(Usage usage); // Add a new usage
	Usage updateUsage(Usage usage); // Update an existing usage
	void deleteUsage(long usageId); // Delete a usage
}
