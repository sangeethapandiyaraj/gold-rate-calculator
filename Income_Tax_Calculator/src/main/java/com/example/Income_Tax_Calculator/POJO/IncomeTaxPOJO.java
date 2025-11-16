package com.example.Income_Tax_Calculator.POJO;

public class IncomeTaxPOJO {
 private String firstName;
 private String lastName;
 private String email;
 private String phone;
 private String address;
 private double salary;
//public IncomeTaxPOJO() {
    ////
    ////}
    public IncomeTaxPOJO(String firstName, String lastName, String email, String phone, String address, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.salary = salary;
}
 public String getFirstName() {
     return firstName;
 }
 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }
 public String getLastName() {
     return lastName;
 }
 public void setLastName(String lastName) {
     this.lastName = lastName;
 }
 public String getEmail() {
     return email;
 }
 public void setEmail(String email) {
     this.email = email;
 }
 public String getPhone() {
     return phone;
 }
 public void setPhone(String phone) {
     this.phone = phone;
 }
 public String getAddress() {
     return address;
 }
 public void setAddress(String address) {
     this.address = address;
 }
 public double getSalary() {
     return salary;
 }
 public void setSalary(double salary) {
     this.salary = salary;
 }
}
