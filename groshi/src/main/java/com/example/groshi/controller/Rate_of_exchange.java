package com.example.groshi.controller;

import java.util.Map;

public class Rate_of_exchange {

    private Integer timestamp;
    private String base;
    private Map<String, Double> rates;

    public Rate_of_exchange() {
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }
}
