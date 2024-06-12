# Spring Boot Maven Archetype

Creating a new Spring Boot service can be efficiently accomplished using this maven archetypes. Maven archetypes provide
a template-based generation of new projects, ensuring consistency and speeding up the setup process. Here’s a
step-by-step guide on how to spin off a new Spring Boot service using this maven archetypes.

---
# Requirements:

- Java 21
- Maven 3.9.7

---
# Build

```bash
mvn clean install
```

---
# Create a Spring Boot Example Application using spring-boot-maven-archetype

```bash
rm -rf ./generated; \
mkdir -p ./generated; \
cd ./generated; \
mvn archetype:generate \
  --batch-mode --quiet \
  -DarchetypeGroupId=com.eightaugusto \
  -DarchetypeArtifactId=spring-boot-maven-archetype \
  -DarchetypeVersion=1.0.0 \
  -DgroupId=com.eightaugusto \
  -DartifactId=spring-boot-maven-archetype-example \
  -Dversion=1.0.0;
cd - > /dev/null;
```