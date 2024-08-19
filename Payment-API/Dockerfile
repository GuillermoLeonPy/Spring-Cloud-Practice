FROM openjdk:18

WORKDIR /app

COPY ./target/Payment-API-1.1-SNAPSHOT.jar /app

ENTRYPOINT ["java","-Dspring.profiles.active=kubernetes","-jar","Payment-API-1.1-SNAPSHOT.jar"]
EXPOSE 8082