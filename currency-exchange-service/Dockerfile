FROM eclipse-temurin:21-jre

WORKDIR /app

COPY currency-exchange-service/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]