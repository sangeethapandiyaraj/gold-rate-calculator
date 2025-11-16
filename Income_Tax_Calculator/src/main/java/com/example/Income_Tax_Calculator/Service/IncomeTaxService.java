package com.example.Income_Tax_Calculator.Service;

import org.springframework.stereotype.Component;
@Component
public class IncomeTaxService {
    public double getIncomeTax(String taxRegime, double salary) {
        double incomeTax = 0;
       if(taxRegime.equals("newTaxRegime")) {
           if (salary <= 300000) {
               incomeTax = 0;

           } else if (salary <= 600000) {
               incomeTax = (salary - 300000) * 0.05;

           } else if (salary <= 900000) {
               incomeTax = (300000 * 0.05) + (salary - 600000) * 0.10;

           } else if (salary <= 1200000) {
               incomeTax = (300000 * 0.05)
                       + (300000 * 0.10)
                       + (salary - 900000) * 0.15;

           } else if (salary <= 1500000) {
               incomeTax = (300000 * 0.05)
                       + (300000 * 0.10)
                       + (300000 * 0.15)
                       + (salary - 1200000) * 0.20;

           } else {
               incomeTax = (300000 * 0.05)
                       + (300000 * 0.10)
                       + (300000 * 0.15)
                       + (300000 * 0.20)
                       + (salary - 1500000) * 0.30;
           }
       }
       else if(taxRegime.equals("oldTaxRegime")) {
           if (salary <= 250000) {
               incomeTax = 0;

           } else if (salary <= 500000) {
               incomeTax = (salary - 250000) * 0.05;

           } else if (salary <= 1000000) {
               incomeTax = (250000 * 0.05) + (salary - 500000) * 0.20;

           } else {
               incomeTax = (250000 * 0.05)
                       + (500000 * 0.20)
                       + (salary - 1000000) * 0.30;
           }
       }
       else {
           throw new RuntimeException("Invalid tax regime");
       }
        return (int) incomeTax;
    }
}
