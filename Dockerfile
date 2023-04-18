FROM eclipse-temurin:17
RUN mkdir /opt/app
WORKDIR /opt/app
COPY ./demo-api/target/*.jar api.jar

EXPOSE 8080:8080
ENTRYPOINT ["java", "-jar", "api.jar"]

