package com.eightaugusto.spring.boot.maven.archetype.example.helloworld.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/** HelloWorldDto. */
@Data
public class HelloWorldDto {

  @Schema(description = "Hello World Message", example = "Hello World")
  private String message;
}
