package com.smalaca.bank.infrastructure.api.rest;

import com.smalaca.bank.application.AccountApplicationService;
import com.smalaca.bank.application.TransferInput;
import com.smalaca.bank.infrastructure.history.HistoryService;
import com.smalaca.bank.infrastructure.history.HistoryTransfer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    private final AccountApplicationService accountApplicationService;
    private final HistoryService historyService;

    public AccountController(AccountApplicationService accountApplicationService, HistoryService historyService) {
        this.accountApplicationService = accountApplicationService;
        this.historyService = historyService;
    }

    @PostMapping("/transfer")
    public void transfer(@RequestBody TransferDto transferDto) {
        LOGGER.trace("Starts transfer: {}", transferDto);

        TransferInput transferInput = asTransferInput(transferDto);
        accountApplicationService.transfer(transferInput);

        HistoryTransfer historyTransfer = asHistoryTransfer(transferDto);
        historyService.store(historyTransfer);

        LOGGER.trace("Ends transfer: {}", transferDto);
    }

    private HistoryTransfer asHistoryTransfer(TransferDto transferDto) {
        return null;
    }

    private TransferInput asTransferInput(TransferDto transferDto) {
        return null;
    }
}
