package com.smalaca.bank.query.account;

import com.smalaca.bank.domain.account.Account;
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
                .map(this::asAccountSummary)
                .collect(toList());
    }

    public AccountSummary summaryOf(Long id) {
        return asAccountSummary(springDataAccountRepository.findById(id).get());
    }

    private AccountSummary asAccountSummary(Account account) {
        return null;
    }

    public AccountDetails detailsOf(Long id) {
        return asAccountDetails(springDataAccountRepository.findById(id).get());
    }

    private AccountDetails asAccountDetails(Account account) {
        return null;
    }
}
