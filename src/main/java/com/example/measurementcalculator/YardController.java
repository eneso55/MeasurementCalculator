package com.example.measurementcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YardController {

    @RequestMapping("/Yard")
    public double yard (@RequestParam double a){
        return a*0.9144;
    }
}
