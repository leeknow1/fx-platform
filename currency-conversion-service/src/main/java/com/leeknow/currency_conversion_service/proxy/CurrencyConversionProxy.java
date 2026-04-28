package com.leeknow.currency_conversion_service.proxy;

import com.leeknow.currency_conversion_service.bean.CurrencyExchange;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
public interface CurrencyConversionProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyExchange retrieveCurrency(@PathVariable String from, @PathVariable String to);
}
