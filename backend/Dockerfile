FROM openjdk:21-slim

WORKDIR /app
COPY target/simple-web-server-*.jar /app/backend/simple-web-server.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/backend/simple-web-server.jar"]
