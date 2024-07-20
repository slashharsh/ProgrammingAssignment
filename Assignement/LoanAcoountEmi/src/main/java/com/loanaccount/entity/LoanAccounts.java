package com.loanaccount.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class LoanAccounts {
	@Id
	public String loanAccountNumber;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loan_details_id")
	private LoanDetails loanDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "loan_account_number")
	private List<EmiDetails> emiDetails;
	public Long totalDue;
	public String nextDue;

	public String getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(String loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public LoanDetails getLoanDetails() {
		return loanDetails;
	}

	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}

	public List<EmiDetails> getEmiDetails() {
		return emiDetails;
	}

	public void setEmiDetails(List<EmiDetails> emiDetails) {
		this.emiDetails = emiDetails;
	}

	public Long getTotalDue() {
		return totalDue;
	}

	public void setTotalDue(Long totalDue) {
		this.totalDue = totalDue;
	}

	public String getNextDue() {
		return nextDue;
	}

	public void setNextDue(String nextDue) {
		this.nextDue = nextDue;
	}

}
