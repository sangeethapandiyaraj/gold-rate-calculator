package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
private AppInfo AI;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Application started");
        //AppInfo AI = new AppInfo();
    }

    @Override
    public void run(String... args) throws Exception {
        AI.displayInfo();
    }
}