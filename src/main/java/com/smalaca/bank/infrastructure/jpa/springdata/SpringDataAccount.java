package com.smalaca.bank.infrastructure.jpa.springdata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class SpringDataAccount {
    @Id
    @GeneratedValue
    private Long id;
    private String accountNumber;
    private BigDecimal balance;
    private String currency;

    private SpringDataAccount() {}

    public SpringDataAccount(String accountNumber, BigDecimal balance, String currency) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }
}
