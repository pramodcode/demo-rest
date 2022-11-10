# Base Image
FROM openjdk:8-jdk-alpine
# Jar file folder
ARG JAR_FILE=target/*.jar
# copy jar file to container folder
COPY ${JAR_FILE} app.jar
# command to execute in container
ENTRYPOINT ["java","-jar","/app.jar"]