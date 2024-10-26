package com.demo.ElectrictyBillingSystem.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.ElectrictyBillingSystem.Entities.Meter;
import com.demo.ElectrictyBillingSystem.Service.MeterService;

import java.util.List;

@RestController
@RequestMapping("/api/meters")
public class MeterController {

	@Autowired
	private MeterService meterService;

	// Create a new meter
	@PostMapping
	public ResponseEntity<Meter> createMeter(@RequestBody Meter meter) {
		Meter savedMeter = meterService.addMeter(meter);
		return ResponseEntity.ok(savedMeter);
	}

	// Get all meters
	@GetMapping
	public ResponseEntity<List<Meter>> getAllMeters() {
		List<Meter> meters = meterService.getMeters();
		return ResponseEntity.ok(meters);
	}

	// Get a meter by ID
	@GetMapping("/{id}")
	public ResponseEntity<Meter> getMeterById(@PathVariable Long id) {
		Meter meter = meterService.getMeter(id);
		return ResponseEntity.ok(meter);
	}

	// Update a meter
	@PutMapping("/{id}")
	public ResponseEntity<Meter> updateMeter(@PathVariable Long id, @RequestBody Meter meterDetails) {
		meterDetails.setMeterId(id);
		Meter updatedMeter = meterService.updateMeter(meterDetails);
		return ResponseEntity.ok(updatedMeter);
	}

	// Delete a meter
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteMeter(@PathVariable Long id) {
		meterService.deleteMeter(id);
		return ResponseEntity.noContent().build();
	}
}


