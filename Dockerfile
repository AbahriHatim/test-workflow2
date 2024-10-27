# In your repository root
FROM openjdk:21-jdk

WORKDIR /app

COPY target/testOmar-0.0.1-SNAPSHOT.jar /app/test

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "test"]