package com.smalaca.bank.domain.account;

import com.smalaca.bank.domain.money.Money;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Account {
    @EmbeddedId
    private AccountId id;
    @Embedded
    private AccountNumber number;
    @Embedded
    private Money balance;

    private Account() {}

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
