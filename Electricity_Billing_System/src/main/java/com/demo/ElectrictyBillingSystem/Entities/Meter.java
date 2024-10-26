package com.demo.ElectrictyBillingSystem.Entities;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Meter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long meterId;

	private LocalDate installationDate;
	private String type;
	public long getMeterId() {
		return meterId;
	}
	public void setMeterId(long meterId) {
		this.meterId = meterId;
	}
	public LocalDate getInstallationDate() {
		return installationDate;
	}
	public void setInstallationDate(LocalDate installationDate) {
		this.installationDate = installationDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Meater [meterId=" + meterId + ", installationDate=" + installationDate + ", type=" + type + "]";
	}
	public Meter(long meterId, LocalDate installationDate, String type) {
		super();
		this.meterId = meterId;
		this.installationDate = installationDate;
		this.type = type;
	}
	public Meter() {
		super();
		// TODO Auto-generated constructor stub
	}


}
