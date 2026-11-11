FROM eclipse-temurin:25-jre
WORKDIR /app
COPY target/java-homeworks-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
