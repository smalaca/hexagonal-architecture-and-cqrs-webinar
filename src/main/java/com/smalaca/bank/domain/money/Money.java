package com.smalaca.bank.domain.money;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Embeddable
public class Money {
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    private Money() {}

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
