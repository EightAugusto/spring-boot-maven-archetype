FROM openjdk:21-slim

ENV APPLICATION="spring-boot-maven-archetype-example"

RUN mkdir -p /application/${APPLICATION}
COPY ./target/${APPLICATION}.jar /application/${APPLICATION}/${APPLICATION}.jar
ENTRYPOINT java -jar ${JAVA_OPTS} /application/${APPLICATION}/${APPLICATION}.jar