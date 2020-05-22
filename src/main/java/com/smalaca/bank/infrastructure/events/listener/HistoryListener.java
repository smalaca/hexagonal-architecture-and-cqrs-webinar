package com.smalaca.bank.infrastructure.events.listener;

import com.smalaca.bank.domain.account.MoneyTransferred;
import com.smalaca.bank.infrastructure.history.HistoryService;
import com.smalaca.bank.infrastructure.history.HistoryTransfer;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class HistoryListener {
    private final HistoryService historyService;

    public HistoryListener(HistoryService historyService) {
        this.historyService = historyService;
    }

    @EventListener
    public void process(MoneyTransferred moneyTransferred) {
        HistoryTransfer historyTransfer = asHistoryTransfer(moneyTransferred);
        historyService.store(historyTransfer);
    }

    private HistoryTransfer asHistoryTransfer(MoneyTransferred moneyTransferred) {
        return null;
    }
}
