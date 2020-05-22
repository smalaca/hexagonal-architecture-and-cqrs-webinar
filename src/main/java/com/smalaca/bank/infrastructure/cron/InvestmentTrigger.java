package com.smalaca.bank.infrastructure.cron;

import com.smalaca.bank.application.AccountApplicationService;
import com.smalaca.bank.application.TransferInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentTrigger {
    private final AccountApplicationService accountApplicationService;

    public InvestmentTrigger(AccountApplicationService accountApplicationService) {
        this.accountApplicationService = accountApplicationService;
    }

    public void invest() {
        List<TransferInput> investments = readFromFile();

        investments.forEach(this::invest);
    }

    private void invest(TransferInput transferInput) {
        accountApplicationService.transfer(transferInput);
    }

    private List<TransferInput> readFromFile() {
        return null;
    }
}
