package ${package}.helloworld.mapper;

import ${package}.helloworld.dto.HelloWorldDto;
import ${package}.helloworld.entity.HelloWorld;
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
