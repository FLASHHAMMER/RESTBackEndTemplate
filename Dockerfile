FROM openjdk:17-jdk-alpine
ARG JAR_FILE="build/libs/backend-0.0.1-SNAPSHOT.jar"
VOLUME /tmp
COPY ${JAR_FILE} /app.jar
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]