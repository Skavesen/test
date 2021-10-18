package com.example.groshi.controller;

import com.example.groshi.service.Service_Exchange;
import com.example.groshi.service.Service_Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/groshi")
public class MainController {

    private Service_Exchange service_Exchange;
    private Service_Gif service_Gif;
    private String rich_Tag = "rich";
    private String broke_Tag = "broke";
    private String error_Tag = "404";

    @Autowired
    public MainController(
            Service_Exchange service_Exchange,
            Service_Gif service_Gif
    ) {
        this.service_Exchange = service_Exchange;
        this.service_Gif = service_Gif;
    }

    @GetMapping("/getcodes")
    public List<String> getCharCodes() {
        return service_Exchange.getCharCodes();
    }

    @GetMapping("/getgif/{code}")
    public ResponseEntity<Map> getGif(@PathVariable String code) {
        ResponseEntity<Map> result = null;
        int gifKey = -999999;
        String gifTag = this.error_Tag;
        if (code != null) {
            gifKey = service_Exchange.getKeyForTag(code);
        }
        switch (gifKey) {
            case 1:
                gifTag = this.rich_Tag;
                break;
            case -1:
                gifTag = this.broke_Tag;
                break;
            case 0:
                gifTag = this.error_Tag;
                break;
        }
        result = service_Gif.getGif(gifTag);
        return result;
    }
}