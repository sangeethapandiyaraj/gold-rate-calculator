package com.example.GoldRateUsingBean.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class GoldRateService {
    private int rate;
    private int amount;

    @PostConstruct
    public void init(){
        this.amount = 100000;
        this.rate = 10500;
        System.out.println("GoldRateService Initialized " + "the amount is "+ amount + " and rate is " +  rate);

    }
    public double calculate(int amount, int rate) {
       return (double) amount/rate;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("GoldRateService Destroyed");
    }
}
