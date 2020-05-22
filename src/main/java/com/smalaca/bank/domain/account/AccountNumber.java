package com.smalaca.bank.domain.account;

import javax.persistence.Embeddable;

@Embeddable
class AccountNumber {
    private String number;

    private AccountNumber() {}

    AccountNumber(String number) {
        this.number = number;
    }

    String getNumber() {
        return number;
    }
}
