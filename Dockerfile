FROM openjdk:17-alpine
COPY target/blogPlatform-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
