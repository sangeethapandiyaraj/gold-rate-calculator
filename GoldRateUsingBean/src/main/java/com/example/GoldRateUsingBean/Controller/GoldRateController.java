package com.example.GoldRateUsingBean.Controller;

import com.example.GoldRateUsingBean.Service.GoldRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goldrate")
public class GoldRateController {
    @Autowired
    private GoldRateService service;
    @GetMapping("calculate")
    public double calculate(@RequestParam int amount, @RequestParam int rate) {
        return service.calculate(amount,rate);
    }
}
