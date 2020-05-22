package com.smalaca.bank.infrastructure.api.rest;

import com.smalaca.bank.application.AccountApplicationService;
import com.smalaca.bank.application.TransferInput;
import com.smalaca.bank.query.account.AccountDetails;
import com.smalaca.bank.query.account.AccountQueryService;
import com.smalaca.bank.query.account.AccountSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    private final AccountApplicationService accountApplicationService;
    private final AccountQueryService accountQueryService;

    public AccountController(AccountApplicationService accountApplicationService, AccountQueryService accountQueryService) {
        this.accountApplicationService = accountApplicationService;
        this.accountQueryService = accountQueryService;
    }

    @PostMapping("/transfer")
    public void transfer(@RequestBody TransferInput transferInput) {
        LOGGER.trace("Starts transfer: {}", transferInput);

        accountApplicationService.transfer(transferInput);

        LOGGER.trace("Ends transfer: {}", transferInput);
    }

    @GetMapping
    public List<AccountSummary> findAll() {
        return accountQueryService.all();
    }

    @GetMapping("/{id}/summary")
    public AccountSummary summary(@PathVariable Long id) {
        return accountQueryService.summaryOf(id);
    }

    @GetMapping("/{id}")
    public AccountDetails details(@PathVariable Long id) {
        return accountQueryService.detailsOf(id);
    }
}
