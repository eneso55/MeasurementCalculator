package com.example.measurementcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InchController {

    @RequestMapping("/Inch")
    public double inch(@RequestParam double a){
        return a*2.54;
    }
}
