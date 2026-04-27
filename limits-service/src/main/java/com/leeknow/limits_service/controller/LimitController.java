package com.leeknow.limits_service.controller;

import com.leeknow.limits_service.bean.Limit;
import com.leeknow.limits_service.config.LimitConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitController {

    private final LimitConfiguration config;

    @GetMapping
    public Limit getLimit() {
        return new Limit(config.getMin(), config.getMax());
    }
}
