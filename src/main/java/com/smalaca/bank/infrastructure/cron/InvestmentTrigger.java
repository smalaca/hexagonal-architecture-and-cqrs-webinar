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
        List<Investment> investments = readFromFile();

        investments.forEach(this::invest);
    }

    private void invest(Investment investment) {
        TransferInput transferInput = asTransferInput(investment);
        accountApplicationService.transfer(transferInput);

        Notification notification = asNotification(investment);
        notificationService.send(notification);
    }

    private Notification asNotification(Investment investment) {
        return null;
    }

    private TransferInput asTransferInput(Investment investment) {
        return null;
    }

    private List<Investment> readFromFile() {
        return null;
    }
}
