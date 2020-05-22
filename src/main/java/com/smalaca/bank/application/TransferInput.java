package com.smalaca.bank.application;

import java.math.BigDecimal;

public class TransferInput {
    private Long from;
    private Long to;
    private BigDecimal moneyAmount;
    private String moneyCurrency;

    public TransferInput(Long from, Long to, BigDecimal moneyAmount, String moneyCurrency) {
        this.from = from;
        this.to = to;
        this.moneyAmount = moneyAmount;
        this.moneyCurrency = moneyCurrency;
    }

    public Long getFrom() {
        return from;
    }

    public Long getTo() {
        return to;
    }

    public BigDecimal getMoneyAmount() {
        return moneyAmount;
    }

    public String getMoneyCurrency() {
        return moneyCurrency;
    }
}
