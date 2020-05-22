package com.smalaca.bank.query.account;

import com.smalaca.bank.domain.account.Account;
import com.smalaca.bank.domain.account.AccountDto;
import com.smalaca.bank.infrastructure.jpa.springdata.SpringDataAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.toList;

@Service
public class AccountQueryService {
    private final SpringDataAccountRepository springDataAccountRepository;

    public AccountQueryService(SpringDataAccountRepository springDataAccountRepository) {
        this.springDataAccountRepository = springDataAccountRepository;
    }

    public List<AccountSummary> all() {
        Iterable<Account> accounts = springDataAccountRepository.findAll();

        return StreamSupport.stream(accounts.spliterator(), false)
                .map(Account::asDto)
                .map(this::asAccountSummary)
                .collect(toList());
    }

    public AccountSummary summaryOf(Long id) {
        Account account = springDataAccountRepository.findById(id).get();

        return asAccountSummary(account.asDto());
    }

    private AccountSummary asAccountSummary(AccountDto accountDto) {
        return null;
    }

    public AccountDetails detailsOf(Long id) {
        Account account = springDataAccountRepository.findById(id).get();

        return asAccountDetails(account.asDto());
    }

    private AccountDetails asAccountDetails(AccountDto accountDto) {
        return null;
    }
}
