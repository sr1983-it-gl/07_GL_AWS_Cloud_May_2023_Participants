
FROM amazoncorretto:17.0.0-alpine
WORKDIR /java-calculator-app

ADD target/java-calculator-app-1.0.jar .

ENTRYPOINT ["java", "-jar", "/java-calculator-app/java-calculator-app-1.0.jar"]

CMD ["10","10", "+"]
