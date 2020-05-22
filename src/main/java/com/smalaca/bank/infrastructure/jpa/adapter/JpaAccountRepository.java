package com.smalaca.bank.infrastructure.jpa.adapter;

import com.smalaca.bank.domain.account.Account;
import com.smalaca.bank.domain.account.AccountId;
import com.smalaca.bank.domain.account.AccountRepository;
import com.smalaca.bank.infrastructure.jpa.springdata.SpringDataAccountRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JpaAccountRepository implements AccountRepository {
    private final SpringDataAccountRepository springDataAccountRepository;

    JpaAccountRepository(SpringDataAccountRepository springDataAccountRepository) {
        this.springDataAccountRepository = springDataAccountRepository;
    }

    @Override
    public Account find(AccountId accountId) {
        return springDataAccountRepository.findById(accountId).get();
    }

    @Override
    public void save(Account account) {
        springDataAccountRepository.save(account);
    }
}
