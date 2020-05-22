package com.smalaca.bank.application;

import com.smalaca.bank.domain.account.AccountRepository;
import com.smalaca.bank.domain.account.AccountService;
import com.smalaca.bank.domain.eventsregistry.EventsRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountApplicationServiceFactory {
    @Bean
    public AccountApplicationService accountApplicationService(AccountRepository accountRepository, EventsRegistry eventsRegistry) {
        return new AccountApplicationService(accountRepository, new AccountService(eventsRegistry));
    }
}
