package com.loanaccount.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmiDetails {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	public int emiNumber;
	public String dueDate;
	public double emiAmount;
	public String status;
	public String paymentDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getEmiNumber() {
		return emiNumber;
	}
	public void setEmiNumber(int emiNumber) {
		this.emiNumber = emiNumber;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
}
