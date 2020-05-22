package com.smalaca.bank.domain.money;

public enum Currency {
    USD, PLN, EUR, RUB;

    public static Currency from(String currency) {
        return Currency.valueOf(currency);
    }
}
