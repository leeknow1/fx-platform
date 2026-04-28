package com.leeknow.currency_conversion_service.controller;

import com.leeknow.currency_conversion_service.bean.CurrencyExchange;
import com.leeknow.currency_conversion_service.bean.CurrencyExchangeQuantity;
import com.leeknow.currency_conversion_service.proxy.CurrencyConversionProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final CurrencyConversionProxy proxy;

    @GetMapping("/currency-exchange/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyExchangeQuantity retrieveCurrency(@PathVariable String from,
                                                     @PathVariable String to,
                                                     @PathVariable Integer quantity) {
        CurrencyExchange currencyExchange = proxy.retrieveCurrency(from, to);
        if (currencyExchange == null) return null;
        return new CurrencyExchangeQuantity(
                currencyExchange.getId(),
                from,
                to,
                currencyExchange.getConversionMultiple(),
                currencyExchange.getEnvironment(),
                quantity,
                currencyExchange.getConversionMultiple().multiply(BigDecimal.valueOf(quantity))
        );
    }
}
