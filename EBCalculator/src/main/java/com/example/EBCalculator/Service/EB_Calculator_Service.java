package com.example.EBCalculator.Service;

import org.springframework.stereotype.Service;

@Service
public class EB_Calculator_Service {
public Integer ebcal(int units) {
    double bill;
    if (units <= 100) {
        bill = 0;
    } else if (units <= 200) {
        bill = (units - 100) * 2.25;
    } else if (units <= 500) {
        bill = (100 * 2.25) + (units - 200) * 4.50;
    } else {
        bill = (100 * 2.25) + (300 * 4.50) + (units - 500) * 6.00;
    }

    return (int) bill;
}
}
