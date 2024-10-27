# Use the official Maven image to build the application
FROM maven:3.8.4-openjdk-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Use the official OpenJDK image to run the application
FROM openjdk:21-jre-slim
COPY --from=build /app/target/myapp.jar /usr/local/lib/myapp.jar
ENTRYPOINT ["java", "-jar", "/usr/local/lib/myapp.jar"]
