package com.smalaca.bank.domain.account;

import com.smalaca.bank.domain.money.Money;

public class MoneyTransferred {
    private final Account accountFrom;
    private final Account accountTo;
    private final Money money;

    private MoneyTransferred(Account accountFrom, Account accountTo, Money money) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.money = money;
    }

    static MoneyTransferred create(Account accountFrom, Account accountTo, Money money) {
        return new MoneyTransferred(accountFrom, accountTo, money);
    }
}
