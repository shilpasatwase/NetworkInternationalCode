FROM java:8-jdk-alpine

COPY ./target/Spring-Eureka-Client-Student-Service-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch Spring-Eureka-Client-Student-Service-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","Spring-Eureka-Client-Student-Service-0.0.1-SNAPSHOT.jar"]