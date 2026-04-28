package com.leeknow.currency_exchange_service.controller;

import com.leeknow.currency_exchange_service.bean.CurrencyExchange;
import com.leeknow.currency_exchange_service.service.CurrencyExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final Environment environment;
    private final CurrencyExchangeService service;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveCurrency(@PathVariable String from,
                                             @PathVariable String to) {
        CurrencyExchange currencyExchange = service.findByFromAndTo(from, to);
        if (currencyExchange != null) currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
        return currencyExchange;
    }
}
