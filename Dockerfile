FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY StudentResult.java .
RUN javac StudentResult.java
CMD ["java", "StudentResult"]
