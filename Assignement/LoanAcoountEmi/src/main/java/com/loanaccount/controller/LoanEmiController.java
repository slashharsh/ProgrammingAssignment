package com.loanaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.loanaccount.dto.LoanAccountDTO;
import com.loanaccount.entity.LoanAccounts;
import com.loanaccount.service.LoanEmiService;

@RestController
public class LoanEmiController {
    @Autowired
    private LoanEmiService loanService;
    
    @GetMapping("/loanaccount/{loanAccountNumber}")
    public LoanAccountDTO getLoanAccount(@PathVariable String loanAccountNumber) {
        return loanService.getLoanAccount(loanAccountNumber);
    }


}
