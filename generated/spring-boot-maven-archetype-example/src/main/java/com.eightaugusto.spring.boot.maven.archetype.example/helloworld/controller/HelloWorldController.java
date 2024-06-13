package com.eightaugusto.spring.boot.maven.archetype.example.helloworld.controller;

import  com.eightaugusto.spring.boot.maven.archetype.example.helloworld.dto.HelloWorldDto;
import  com.eightaugusto.spring.boot.maven.archetype.example.helloworld.service.HelloWorldService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** HelloWorldController. */
@Log4j2
@RestController
@AllArgsConstructor
@RequestMapping("/v1/example")
public class HelloWorldController {

  private final HelloWorldService service;

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public HelloWorldDto getHelloWorld() {
    log.traceEntry("()");
    return log.traceExit(service.getHelloWorld());
  }
}
