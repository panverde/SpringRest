FROM openjdk:8-jdk-alpine
LABEL maintainer="joaquin"
WORKDIR /workspace
ADD target/Spring*.war app.war
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /workspace/app.war
EXPOSE 8080