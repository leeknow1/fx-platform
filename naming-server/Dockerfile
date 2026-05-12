FROM eclipse-temurin:21-jre

WORKDIR /app

COPY naming-server/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]