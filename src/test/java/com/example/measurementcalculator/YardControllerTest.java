package com.example.measurementcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class YardControllerTest {

    YardController controller = new YardController();

    @Test
    public void yardToMeter(){
        double result = controller.yard(5);
        assertEquals(4.572,result);
    }
}
