package com.demo.ElectrictyBillingSystem.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.demo.ElectrictyBillingSystem.Entities.Bill;
import com.demo.ElectrictyBillingSystem.Service.BillService;

@RestController
@RequestMapping("/api/bills")
public class BillController {

	@Autowired
	private BillService billService;

	// Create a new bill
	@PostMapping
	public ResponseEntity<Bill> createBill(@RequestBody Bill bill) {
		Bill savedBill = billService.addBill(bill);
		return ResponseEntity.ok(savedBill);
	}

	// Get all bills
	@GetMapping
	public ResponseEntity<List<Bill>> getAllBills() {
		List<Bill> bills = billService.getBills();
		return ResponseEntity.ok(bills);
	}

	// Get a bill by ID
	@GetMapping("/{id}")
	public ResponseEntity<Bill> getBillById(@PathVariable Long id) {
		Bill bill = billService.getBill(id);
		return ResponseEntity.ok(bill);
	}

	// Update a bill
	@PutMapping("/{id}")
	public ResponseEntity<Bill> updateBill(@PathVariable Long id, @RequestBody Bill billDetails) {
		billDetails.setBillId(id);
		Bill updatedBill = billService.updateBill(billDetails);
		return ResponseEntity.ok(updatedBill);
	}

	// Delete a bill
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteBill(@PathVariable Long id) {
		billService.deleteBill(id);
		return ResponseEntity.noContent().build();
	}
}


