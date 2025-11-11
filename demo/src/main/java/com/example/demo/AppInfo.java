package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class AppInfo {
        @Value("${app.name}")
        private String appName;

        @Value("${app.version}")
        private String version;

        public void displayInfo() {
            System.out.println("Application Name: " + appName);
            System.out.println("Version: " + version);
        }
    }

