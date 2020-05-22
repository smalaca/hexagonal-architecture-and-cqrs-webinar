package com.smalaca.bank.domain.account;

public interface AccountRepository {
    Account find(AccountId accountId);

    void save(Account account);
}
