package com.example.measurementcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InchControllerTest {


    InchController controller = new InchController();

    @Test
    public void inchToCentiTest() {
        double result = controller.inch(5);
        assertEquals(12.7,result);
    }
}
