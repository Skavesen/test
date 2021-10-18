package com.example.groshi.feign;

import com.example.groshi.controller.Rate_of_exchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.openfeign.FeignClient(name = "exchangerClient", url = "https://openexchangerates.org/api")
public interface Exchanger_Feign extends Exchanger{

    @Override
    @GetMapping("/latest.json")
    Rate_of_exchange get_Latest_Rates(
            @RequestParam("app_id") String appId
    );

    @Override
    @GetMapping("/historical/{date}.json")
    Rate_of_exchange get_Historical_Rates(
            @PathVariable String date,
            @RequestParam("app_id") String appId
    );
}
