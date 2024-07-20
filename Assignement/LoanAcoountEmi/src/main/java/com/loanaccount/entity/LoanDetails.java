package com.loanaccount.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoanDetails {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	public String borrowerName;
	public String loanType;
	public double loanAmount;
	public double interestRate;
	public String loanStartDate;
	public String loanEndDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public String getLoanStartDate() {
		return loanStartDate;
	}
	public void setLoanStartDate(String loanStartDate) {
		this.loanStartDate = loanStartDate;
	}
	public String getLoanEndDate() {
		return loanEndDate;
	}
	public void setLoanEndDate(String loanEndDate) {
		this.loanEndDate = loanEndDate;
	}

	
}
