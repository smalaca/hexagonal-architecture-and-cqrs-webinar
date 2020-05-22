package com.smalaca.bank.infrastructure.jpa.adapter;

import com.smalaca.bank.domain.account.Account;
import com.smalaca.bank.domain.account.AccountId;
import com.smalaca.bank.domain.account.AccountRepository;
import com.smalaca.bank.infrastructure.jpa.springdata.SpringDataAccount;
import com.smalaca.bank.infrastructure.jpa.springdata.SpringDataAccountRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaAccountRepository implements AccountRepository {
    private final SpringDataAccountRepository springDataAccountRepository;

    JpaAccountRepository(SpringDataAccountRepository springDataAccountRepository) {
        this.springDataAccountRepository = springDataAccountRepository;
    }

    @Override
    public Account find(AccountId accountId) {
        Long id = asLong(accountId);
        Optional<SpringDataAccount> found = springDataAccountRepository.findById(id);

        return asAccount(found);
    }

    private Account asAccount(Optional<SpringDataAccount> found) {
        return null;
    }

    private Long asLong(AccountId accountId) {
        return null;
    }

    @Override
    public void save(Account account) {
        SpringDataAccount springDataAccount = asSpringDataAccount(account);
        springDataAccountRepository.save(springDataAccount);
    }

    private SpringDataAccount asSpringDataAccount(Account account) {
        return null;
    }
}
