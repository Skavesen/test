package com.example.groshi.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface Service_Gif {
    ResponseEntity<Map> getGif(String tag);
}