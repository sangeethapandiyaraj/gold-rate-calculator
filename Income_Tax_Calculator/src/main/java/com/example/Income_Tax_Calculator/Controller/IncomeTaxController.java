package com.example.Income_Tax_Calculator.Controller;

import com.example.Income_Tax_Calculator.POJO.IncomeTaxPOJO;
import com.example.Income_Tax_Calculator.Service.IncomeTaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tax")
public class IncomeTaxController {
    @RequestMapping("/calculate")
    public double calculate(@RequestParam String taxRegime, @RequestParam double salary) {
         return incomeTaxService.getIncomeTax(taxRegime,salary);
    }
    @Autowired private IncomeTaxService incomeTaxService;
    @PostMapping("/employeeDetails")
    public String employeeDetails(@RequestBody IncomeTaxPOJO incomeTaxPOJO) {
        return "Employee Details:\n"
                + "First Name: " + incomeTaxPOJO.getFirstName() + "\n"
                + "Last Name: " + incomeTaxPOJO.getLastName()  + "\n"
                + "Email Id: " + incomeTaxPOJO.getEmail()  + "\n"
                + "Phone: " + incomeTaxPOJO.getPhone()  + "\n"
                + "Address: " + incomeTaxPOJO.getAddress()  + "\n"
                + "Salary: " + incomeTaxPOJO.getSalary();
    }
}
