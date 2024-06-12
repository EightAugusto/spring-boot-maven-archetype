${hash} ${artifactName}

This project was generated using a [Maven archetype](https://github.com/EightAugusto/spring-boot-maven-archetype).
Maven archetypes are project templates that help you kickstart a new project with a pre-defined structure and set of
files.

---
${hash}${hash} Requirements

* Docker 26.1.4
* Make 3.81
* Java 21
* Maven 3.9.7

---
${hash}${hash} Run

```bash
source .env; \
mvn clean install; \
java -Dserver.port=${APPLICATION_PORT} -jar target/${APPLICATION}.jar;
```

or

```bash
mvn clean install; \
make docker.start;
```

Once the application is running, you can view the
swagger [here](http://localhost:8080/swagger-ui/index.html#).

---
${hash}${hash} Stop

```bash
make docker.stop
```