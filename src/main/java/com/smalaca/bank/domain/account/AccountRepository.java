package com.smalaca.bank.domain.account;

public interface AccountRepository {
    Account find(Long accountId);

    void save(Account account);
}
