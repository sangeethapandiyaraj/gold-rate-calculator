package com.example.GoldRateUsingBean.Configuration;

import com.example.GoldRateUsingBean.Service.GoldRateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoldRateConfiguration {
    @Bean
    public GoldRateService goldRateService() {
        return new GoldRateService();
    }
}
