# syntax=docker/dockerfile:1

FROM openjdk:17-alpine
EXPOSE 8761
MAINTAINER online-shop
COPY target/server-0.0.1-SNAPSHOT.jar server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/server-0.0.1-SNAPSHOT.jar"]
