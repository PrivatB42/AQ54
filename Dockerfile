#Generate build
FROM maven:3.9.2-eclipse-temurin-20-alpine as build
WORKDIR /app
COPY pom.xml .
COPY ./src ./src
RUN mvn clean package -Dmaven.test.skip=true

#Dockerize
FROM eclipse-temurin:20.0.1_9-jdk
WORKDIR /app
COPY --from=build /app/target/AQ54-0.0.1-SNAPSHOT.jar ./AQ54.jar
EXPOSE 8081
ENTRYPOINT ["java" , "-jar", "AQ54.jar"]