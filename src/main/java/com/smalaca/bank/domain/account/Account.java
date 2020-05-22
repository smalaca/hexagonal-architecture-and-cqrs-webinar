package com.smalaca.bank.domain.account;

import com.smalaca.bank.domain.money.Money;

public class Account {
    private final AccountId id;
    private final AccountNumber number;
    private Money balance;

    Account(AccountId id, AccountNumber number, Money balance) {
        this.id = id;
        this.number = number;
        this.balance = balance;
    }

    void withdraw(Money money) {
        balance = balance.subtract(money);
    }

    void deposit(Money money) {
        balance = balance.add(money);
    }
}
