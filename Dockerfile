FROM openjdk:17-alpine
EXPOSE 8024
COPY target/JarDemo-0.0.1-SNAPSHOT.jar spring-basic.jar
ENTRYPOINT [ "java","-jar","spring-basic.jar" ]