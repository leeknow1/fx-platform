package com.leeknow.limits_service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Limit {

    private int min;
    private int max;
}
