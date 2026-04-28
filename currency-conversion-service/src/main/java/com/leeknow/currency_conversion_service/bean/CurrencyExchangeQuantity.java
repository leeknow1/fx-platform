package com.leeknow.currency_conversion_service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyExchangeQuantity {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private String environment;
    private Integer quantity;
    private BigDecimal total;
}
