FROM openjdk:12-jdk-alpine
ADD "./target/spring-boot-webflux-0.0.1-SNAPSHOT.jar" "app.jar"
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080