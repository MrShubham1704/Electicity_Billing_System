package com.demo.ElectrictyBillingSystem.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long billId;
    private LocalDate billDate;
    private double totalAmount;
	public long getBillId() {
		return billId;
	}
	public void setBillId(long billId) {
		this.billId = billId;
	}
	public LocalDate getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billDate=" + billDate + ", totalAmount=" + totalAmount + "]";
	}
	public Bill(long billId, LocalDate billDate, double totalAmount) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.totalAmount = totalAmount;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
