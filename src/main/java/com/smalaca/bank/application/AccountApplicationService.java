package com.smalaca.bank.application;

import com.smalaca.bank.domain.account.Account;
import com.smalaca.bank.domain.account.AccountId;
import com.smalaca.bank.domain.account.AccountRepository;
import com.smalaca.bank.domain.account.AccountService;
import com.smalaca.bank.domain.money.Currency;
import com.smalaca.bank.domain.money.Money;
import org.springframework.transaction.annotation.Transactional;

public class AccountApplicationService {
    private final AccountRepository accountRepository;
    private final AccountService accountService;

    public AccountApplicationService(AccountRepository accountRepository, AccountService accountService) {
        this.accountRepository = accountRepository;
        this.accountService = accountService;
    }

    @Transactional
    public void transfer(TransferInput transferInput) {
        AccountId from = AccountId.from(transferInput.getFrom());
        Account accountFrom = accountRepository.find(from);

        AccountId to = AccountId.from(transferInput.getTo());
        Account accountTo = accountRepository.find(to);

        Currency currency = Currency.from(transferInput.getMoneyCurrency());
        Money money = Money.from(transferInput.getMoneyAmount(), currency);

        accountService.transfer(accountFrom, accountTo, money);

        accountRepository.save(accountFrom);
        accountRepository.save(accountTo);
    }
}
