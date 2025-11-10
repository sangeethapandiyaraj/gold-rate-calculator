package com.example.goldratecalculator.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goldrate")
public class GoldRateCalculatorController {
    @GetMapping("/calculate")
    public double calculate(@RequestParam int amount, @RequestParam int rate) {
        double grams = (double) amount / rate;
        return grams;
    }
}



