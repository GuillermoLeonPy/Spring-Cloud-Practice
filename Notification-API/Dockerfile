FROM openjdk:18

WORKDIR /app

COPY ./target/Notification-API-1.1-SNAPSHOT.jar /app

ENTRYPOINT ["java","-Dspring.profiles.active=kubernetes","-jar","Notification-API-1.1-SNAPSHOT.jar"]
EXPOSE 8081
