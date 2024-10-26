package com.demo.ElectrictyBillingSystem.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    private LocalDate paymentDate;
    private Double amountPaid;
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", amountPaid=" + amountPaid + "]";
	}
	public Payment(Long paymentId, LocalDate paymentDate, Double amountPaid) {
		super();
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
		this.amountPaid = amountPaid;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
