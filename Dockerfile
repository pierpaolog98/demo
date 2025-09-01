FROM openjdk:21-jdk-slim
VOLUME /tmp
COPY target/demo-0.0.1.jar demo.jar
ENTRYPOINT ["java", "-jar", "/demo.jar"]