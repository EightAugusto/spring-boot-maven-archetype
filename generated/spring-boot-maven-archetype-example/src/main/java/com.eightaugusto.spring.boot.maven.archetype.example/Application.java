package com.eightaugusto.spring.boot.maven.archetype.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Basic entry-point. */
@SpringBootApplication(scanBasePackages = {"com.eightaugusto.spring.boot.maven.archetype.example"})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
