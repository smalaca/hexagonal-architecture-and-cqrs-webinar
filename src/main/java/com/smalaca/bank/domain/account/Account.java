package com.smalaca.bank.domain.account;

import com.smalaca.bank.domain.money.Money;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private AccountNumber number;
    @Embedded
    private Money balance;

    private Account() {}

    Account(AccountNumber number, Money balance) {
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
