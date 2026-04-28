package com.leeknow.currency_conversion_service.bean;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyExchange {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private String environment;
}
