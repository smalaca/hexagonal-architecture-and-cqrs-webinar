package com.smalaca.bank.domain.account;

import com.smalaca.bank.domain.money.Money;

public class AccountService {
    public void transfer(Account accountFrom, Account accountTo, Money money) {
        accountFrom.withdraw(money);
        accountTo.deposit(money);
    }
}
