package com.loanaccount.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.loanaccount.Repository.LoanEmiRepository;
import com.loanaccount.dto.EmiDetailsDTO;
import com.loanaccount.dto.LoanAccountDTO;
import com.loanaccount.entity.EmiDetails;
import com.loanaccount.entity.LoanAccounts;

@Service
public class LoanEmiService {

	private static final Logger logger = LoggerFactory.getLogger(LoanEmiService.class);

	
	@Autowired
	private LoanEmiRepository loanRepository;

	private final String externalApiUrl = "http://demo0951179.mockable.io/loanaccount/1";
	
    public LoanAccountDTO getLoanAccount(String loanAccountNumber) {
    	logger.info("Fetching loan account details for account number: {}", loanAccountNumber);
        RestTemplate restTemplate = new RestTemplate();
        LoanAccounts loanAccount = restTemplate.getForObject(externalApiUrl, LoanAccounts.class);
        if (loanAccount != null) {
        	loanRepository.save(loanAccount);
        	logger.info("Saved loan account details for account number: {}", loanAccountNumber);
            return mapToDTO(loanAccount);
        }
        return null;
    }

    private LoanAccountDTO mapToDTO(LoanAccounts loanAccount) {
        LoanAccountDTO dto = new LoanAccountDTO();
        dto.setLoanAccountNumber(loanAccount.getLoanAccountNumber());

        List<EmiDetailsDTO> dueEmis = loanAccount.getEmiDetails().stream()
                .filter(emi -> "Due".equals(emi.getStatus()))
                .map(this::mapToEmiDetailsDTO)
                .collect(Collectors.toList());

        dto.setDueDate(dueEmis.get(0).getDueDate());
        dto.setEmiAmount(dueEmis.get(0).getEmiAmount());
        return dto;
    }

    private EmiDetailsDTO mapToEmiDetailsDTO(EmiDetails emi) {
        EmiDetailsDTO dto = new EmiDetailsDTO();
        dto.setEmiNumber(emi.getEmiNumber());
        dto.setDueDate(emi.getDueDate());
        dto.setEmiAmount(emi.getEmiAmount());
        return dto;
    }


}
