FROM openjdk:18

WORKDIR /app

COPY ./target/Gateway-1.0-SNAPSHOT.jar /app

ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","Gateway-1.0-SNAPSHOT.jar"]

EXPOSE 9090