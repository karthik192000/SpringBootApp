FROM openjdk:17
COPY target/SpringBootApp-1.0.0-SNAPSHOT.jar /SpringBootApp-1.0.0-SNAPSHOT.jar
CMD ["java", "-jar", "/SpringBootApp-1.0.0-SNAPSHOT.jar"]
EXPOSE 8080