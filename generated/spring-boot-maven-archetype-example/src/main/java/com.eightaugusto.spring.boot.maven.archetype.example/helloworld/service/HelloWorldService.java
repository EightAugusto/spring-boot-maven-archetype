package com.eightaugusto.spring.boot.maven.archetype.example.helloworld.service;

import com.eightaugusto.spring.boot.maven.archetype.example.helloworld.dto.HelloWorldDto;

/** HelloWorldService. */
public interface HelloWorldService {

  /**
   * Get <code>HelloWorldDto</code>.
   *
   * @return HelloWorldDto.
   */
  HelloWorldDto getHelloWorld();
}
