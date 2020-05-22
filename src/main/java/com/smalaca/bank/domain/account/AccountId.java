package com.smalaca.bank.domain.account;

public class AccountId {
    private final Long id;

    private AccountId(Long id) {
        this.id = id;
    }

    public static AccountId from(Long id) {
        return new AccountId(id);
    }

}
