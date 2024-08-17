FROM openjdk:18

WORKDIR /app

COPY ./target/Config-Server-1.0-SNAPSHOT.jar /app

ENTRYPOINT ["java","-jar","Config-Server-1.0-SNAPSHOT.jar"]

EXPOSE 8888