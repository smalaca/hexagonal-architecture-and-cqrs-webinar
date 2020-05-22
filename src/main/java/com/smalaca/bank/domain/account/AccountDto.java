package com.smalaca.bank.domain.account;

import java.math.BigDecimal;

public class AccountDto {
    private final Long id;
    private final String number;
    private final BigDecimal amount;
    private final String currency;

    AccountDto(Long id, String number, BigDecimal amount, String currency) {
        this.id = id;
        this.number = number;
        this.amount = amount;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
