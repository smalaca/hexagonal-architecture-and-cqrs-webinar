package com.smalaca.bank.infrastructure.history;

public interface HistoryService {
    void store(HistoryTransfer historyTransfer);
}
