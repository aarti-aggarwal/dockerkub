FROM java:8-jdk
RUN mkdir /app
WORKDIR /app
COPY target/KDAssignment-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "KDAssignment-0.0.1-SNAPSHOT.jar"]