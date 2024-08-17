FROM openjdk:18

WORKDIR /app

COPY ./target/Payment-API-1.0-SNAPSHOT.jar /app

ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","Payment-API-1.0-SNAPSHOT.jar"]
EXPOSE 8082