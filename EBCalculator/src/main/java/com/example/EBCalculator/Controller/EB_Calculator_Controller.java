package com.example.EBCalculator.Controller;

import com.example.EBCalculator.Service.EB_Calculator_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eb")

public class EB_Calculator_Controller {
    @Autowired private EB_Calculator_Service eb_cal_service;
    @GetMapping("/bill")
        public Integer bill(@RequestParam int units) {

        //EB_Calculator_Service eb =new EB_Calculator_Service();
        return eb_cal_service.ebcal(units);
    }
}
