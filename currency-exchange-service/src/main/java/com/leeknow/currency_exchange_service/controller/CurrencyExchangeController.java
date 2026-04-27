package com.leeknow.currency_exchange_service.controller;

import com.leeknow.currency_exchange_service.bean.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {


    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveCurrency(@PathVariable String from,
                                             @PathVariable String to) {
        return new CurrencyExchange(1000L, "USD", "KZT", BigDecimal.valueOf(10));
    }
}
