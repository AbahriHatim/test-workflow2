
# Stage 1: Build
FROM maven:latest AS build

# Set the working directory
WORKDIR /app

# Copy the Maven build files
COPY pom.xml .

# Copy the source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot jar file from the build stage
COPY --from=build /app/target/testOmar-0.0.1-SNAPSHOT.jar /app/testDocker.jar

# Expose the application port (replace 8084 with your app's port if different)
EXPOSE 8082

# Run the Spring Boot application
CMD ["java", "-jar", "testDocker.jar"]
