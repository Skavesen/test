package com.example.groshi.service;

import java.util.List;

public interface Service_Exchange {
    List<String> getCharCodes();
    int getKeyForTag(String charCode);
    void refreshRates();

}