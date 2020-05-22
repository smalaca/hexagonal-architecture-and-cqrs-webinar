package com.smalaca.bank.infrastructure.cron;

import com.smalaca.bank.application.AccountApplicationService;
import com.smalaca.bank.application.TransferInput;
import com.smalaca.bank.infrastructure.notification.Notification;
import com.smalaca.bank.infrastructure.notification.NotificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentTrigger {
    private final AccountApplicationService accountApplicationService;
    private final NotificationService notificationService;

    public InvestmentTrigger(AccountApplicationService accountApplicationService, NotificationService notificationService) {
        this.accountApplicationService = accountApplicationService;
        this.notificationService = notificationService;
    }

    public void invest() {
        List<TransferInput> investments = readFromFile();

        investments.forEach(this::invest);
    }

    private void invest(TransferInput transferInput) {
        accountApplicationService.transfer(transferInput);

        Notification notification = asNotification(transferInput);
        notificationService.send(notification);
    }

    private Notification asNotification(TransferInput transferInput) {
        return null;
    }

    private List<TransferInput> readFromFile() {
        return null;
    }
}
