package com.leeknow.currency_exchange_service.service;

import com.leeknow.currency_exchange_service.bean.CurrencyExchange;
import com.leeknow.currency_exchange_service.repository.CurrencyExchangeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyExchangeService {

    private final CurrencyExchangeRepository repository;

    public CurrencyExchange findByFromAndTo(String from, String to) {
        return repository.findCurrencyExchangeByFromAndTo(from, to);
    }
}
