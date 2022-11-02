FROM maven:alpine as maven
COPY ./pom.xml ./pom.xml
COPY ./src ./src
RUN mvn dependency:go-offline -B
RUN mvn package
#FROM openjdk:8u171-jre-alpine
FROM openjdk:8-jdk-alpine
WORKDIR /theroses
COPY --from=maven target/*-with-dependencies.jar ./Game.jar
CMD ["java", "-jar", "./Game.jar"]
