package com.leeknow.limits_service.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("limit.service")
@Getter
@Setter
public class LimitConfiguration {

    private int min;

    private int max;
}
