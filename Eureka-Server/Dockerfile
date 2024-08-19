FROM openjdk:18

WORKDIR /app

COPY ./target/Eureka-Server-1.1-SNAPSHOT.jar /app

ENTRYPOINT ["java","-Dspring.profiles.active=kubernetes","-jar","Eureka-Server-1.1-SNAPSHOT.jar"]

EXPOSE 8761