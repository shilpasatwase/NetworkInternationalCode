FROM java:8-jdk-alpine

COPY ./target/spring-eureka-server-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch spring-eureka-server-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","spring-eureka-server-0.0.1-SNAPSHOT.jar"]