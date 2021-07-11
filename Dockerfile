FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ranjan-user-services.jar
ENTRYPOINT ["java","-jar","/ranjan-user-services.jar"]