package com.leeknow.currency_exchange_service.repository;

import com.leeknow.currency_exchange_service.bean.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findCurrencyExchangeByFromAndTo(String from, String to);
}
