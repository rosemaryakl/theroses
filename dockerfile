FROM maven:alpine as maven
# Get code and pom
COPY ./pom.xml ./pom.xml
COPY ./src ./src
# Initialize maven project
RUN mvn package
FROM openjdk:8-jdk-alpine
# Set up JAR
WORKDIR /theroses
COPY --from=maven target/*-with-dependencies.jar ./Game.jar
CMD ["java", "-jar", "./Game.jar"]
