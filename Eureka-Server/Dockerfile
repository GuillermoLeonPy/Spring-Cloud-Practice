FROM openjdk:18

WORKDIR /app

COPY ./target/Eureka-Server-1.0-SNAPSHOT.jar /app

ENTRYPOINT ["java","-jar","Eureka-Server-1.0-SNAPSHOT.jar"]

EXPOSE 8761