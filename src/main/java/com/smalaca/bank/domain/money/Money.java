package com.smalaca.bank.domain.money;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal amount;
    private final Currency currency;

    private Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money from(BigDecimal amount, Currency currency) {
        return new Money(amount, currency);
    }

    public Money subtract(Money money) {
        return new Money(amount.subtract(money.amount), currency);
    }

    public Money add(Money money) {
        return new Money(amount.add(money.amount), currency);
    }
}
