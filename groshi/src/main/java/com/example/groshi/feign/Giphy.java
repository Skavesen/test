package com.example.groshi.feign;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface Giphy {
    ResponseEntity<Map> getRandomGif(String apiKey, String tag);
}
