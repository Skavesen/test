package com.example.groshi.service;

import com.example.groshi.feign.Giphy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Service_Gif_Execute implements Service_Gif {

    private Giphy giphy;
    private String apiKey = "6CCru0uKMFOTTsmoJt4wwcpy87jaCMwj";

    @Autowired
    public Service_Gif_Execute(Giphy giphy) {
        this.giphy = giphy;
    }

    @Override
    public ResponseEntity<Map> getGif(String tag) {
        ResponseEntity<Map> result = giphy.getRandomGif(this.apiKey, tag);
        result.getBody().put("compareResult", tag);
        return result;
    }
}
