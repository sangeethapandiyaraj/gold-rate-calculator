package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PalindromeCheck {
   public static String Palindrome(String name) {
       String reversed = "";
       for (int i = name.length() - 1; i >= 0; i--) {
           reversed += name.charAt(i);
       }
       if (name.equalsIgnoreCase(reversed)) {
           return name + " is a palindrome";
       } else {
           return name + " is not a palindrome";
       }
   }
}
