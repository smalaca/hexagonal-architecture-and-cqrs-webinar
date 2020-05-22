package com.smalaca.bank.domain.eventsregistry;

import com.smalaca.bank.domain.account.MoneyTransferred;

public interface EventsRegistry {
    void publish(MoneyTransferred moneyTransferred);
}
