package com.example.demo.Controller;
import com.example.demo.PalindromeCheck;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home" )
@ResponseBody
public class Payilagam {
    @RequestMapping("/welcome")
    public String welcome(@RequestParam String name1){
        String upperCase = name1.toUpperCase();
        System.out.println("Hi! Welcome to Payilagam");
        return "Welcome "+ upperCase;
    }
    @RequestMapping("/SquareRoot")
    public String SquareRoot(@RequestParam Integer number1, @RequestParam Integer number2) {
        int number3 = (number1*number1) + (number2*number2);
        System.out.println("Find the sqrt of the numbers");
        return "Addition of Square root numbers: " + number3;
    }
   @GetMapping("/Page/{number1}/{number2}")
    public String getPage(@PathVariable Integer number1, @PathVariable Integer number2) {
        return "Page 1: " + number1 + "Page 2: " + number2;
   }
    @GetMapping("/check")
    public String Palindrome(@RequestParam String name) {
        System.out.println("Checking if Palindrome");
        return PalindromeCheck.Palindrome(name);
    }
}
