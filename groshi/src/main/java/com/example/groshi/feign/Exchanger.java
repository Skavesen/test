package com.example.groshi.feign;

import com.example.groshi.controller.Rate_of_exchange;

public interface Exchanger {
    Rate_of_exchange get_Latest_Rates(String appId);
    Rate_of_exchange get_Historical_Rates(String date, String appId);
}

