package com.smalaca.bank.infrastructure.events.eventsregistry;

import com.smalaca.bank.domain.account.MoneyTransferred;
import com.smalaca.bank.domain.eventsregistry.EventsRegistry;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SpringEventsRegistry implements EventsRegistry {
    private final ApplicationEventPublisher applicationEventPublisher;

    public SpringEventsRegistry(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void publish(MoneyTransferred moneyTransferred) {
        applicationEventPublisher.publishEvent(moneyTransferred);
    }
}
