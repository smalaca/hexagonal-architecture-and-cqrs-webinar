package com.smalaca.bank.infrastructure.inmemory;

import com.smalaca.bank.infrastructure.notification.Notification;
import com.smalaca.bank.infrastructure.notification.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class DummyNotificationService implements NotificationService {
    @Override
    public void send(Notification notification) {

    }
}
