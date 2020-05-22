package com.smalaca.bank.domain.account;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AccountId implements Serializable {
    private Long id;

    private AccountId() {}

    private AccountId(Long id) {
        this.id = id;
    }

    public static AccountId from(Long id) {
        return new AccountId(id);
    }

}
