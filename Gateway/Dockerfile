FROM openjdk:18

WORKDIR /app

COPY ./target/Gateway-1.1-SNAPSHOT.jar /app

ENTRYPOINT ["java","-Dspring.profiles.active=kubernetes","-jar","Gateway-1.1-SNAPSHOT.jar"]

EXPOSE 9090