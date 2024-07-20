package com.loanaccount.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loanaccount.entity.LoanAccounts;

public interface LoanEmiRepository extends JpaRepository<LoanAccounts, String> {
}