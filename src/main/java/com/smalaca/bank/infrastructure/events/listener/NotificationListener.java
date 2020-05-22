package com.smalaca.bank.infrastructure.events.listener;

import com.smalaca.bank.domain.account.MoneyTransferred;
import com.smalaca.bank.infrastructure.notification.Notification;
import com.smalaca.bank.infrastructure.notification.NotificationService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener {
    private final NotificationService notificationService;

    public NotificationListener(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @EventListener
    public void process(MoneyTransferred moneyTransferred) {
        Notification notification = asNotification(moneyTransferred);
        notificationService.send(notification);
    }

    private Notification asNotification(MoneyTransferred moneyTransferred) {
        return null;
    }
}
