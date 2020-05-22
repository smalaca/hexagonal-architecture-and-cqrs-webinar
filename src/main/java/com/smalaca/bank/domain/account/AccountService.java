package com.smalaca.bank.domain.account;

import com.smalaca.bank.domain.eventsregistry.EventsRegistry;
import com.smalaca.bank.domain.money.Money;

public class AccountService {
    private final EventsRegistry eventsRegistry;

    public AccountService(EventsRegistry eventsRegistry) {
        this.eventsRegistry = eventsRegistry;
    }

    public void transfer(Account accountFrom, Account accountTo, Money money) {
        accountFrom.withdraw(money);
        accountTo.deposit(money);

        eventsRegistry.publish(MoneyTransferred.create(accountFrom, accountTo, money));
    }
}
