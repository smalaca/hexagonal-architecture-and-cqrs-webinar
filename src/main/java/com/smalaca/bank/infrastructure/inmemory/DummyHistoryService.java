package com.smalaca.bank.infrastructure.inmemory;

import com.smalaca.bank.infrastructure.history.HistoryService;
import com.smalaca.bank.infrastructure.history.HistoryTransfer;
import org.springframework.stereotype.Service;

@Service
public class DummyHistoryService implements HistoryService {
    @Override
    public void store(HistoryTransfer historyTransfer) {

    }
}
