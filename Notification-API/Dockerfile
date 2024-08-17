FROM openjdk:18

WORKDIR /app

COPY ./target/Notification-API-1.0-SNAPSHOT.jar /app

ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","Notification-API-1.0-SNAPSHOT.jar"]
EXPOSE 8081
