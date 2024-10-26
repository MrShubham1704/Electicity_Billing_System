package com.demo.ElectrictyBillingSystem.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`usage`")
public class Usage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usageId;
    private int unitsConsumed;
    private LocalDate startDate;
    private LocalDate endDate;
	public long getUsageId() {
		return usageId;
	}
	public void setUsageId(long usageId) {
		this.usageId = usageId;
	}
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Usage [usageId=" + usageId + ", unitsConsumed=" + unitsConsumed + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	public Usage(long usageId, int unitsConsumed, LocalDate startDate, LocalDate endDate) {
		super();
		this.usageId = usageId;
		this.unitsConsumed = unitsConsumed;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Usage() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}   