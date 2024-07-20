package com.loanaccount.dto;

public class EmiDetailsDTO {
    private int emiNumber;
    private String dueDate;
    private double emiAmount;
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

    
}
