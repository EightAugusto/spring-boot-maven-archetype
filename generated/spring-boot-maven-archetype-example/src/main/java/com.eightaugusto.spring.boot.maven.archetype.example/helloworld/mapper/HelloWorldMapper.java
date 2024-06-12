package com.eightaugusto.spring.boot.maven.archetype.example.helloworld.mapper;

import com.eightaugusto.spring.boot.maven.archetype.example.helloworld.dto.HelloWorldDto;
import com.eightaugusto.spring.boot.maven.archetype.example.helloworld.entity.HelloWorld;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/** HelloWorldMapper. */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface HelloWorldMapper {

  /**
   * Entity to Dto.
   *
   * @param entity Entity.
   * @return Dto.
   */
  HelloWorldDto convert(HelloWorld entity);
}
