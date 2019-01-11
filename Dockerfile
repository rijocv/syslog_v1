FROM alpine/git as clone 
WORKDIR /opt/MySysLog
RUN \
    git clone https://github.com/rijocv/syslog_v1


FROM maven:3.5-jdk-8-alpine as build
WORKDIR /opt/MySysLog
COPY --from=clone /opt/MySysLog/syslog_v1  /opt/MySysLog
RUN mvn compile && \
    mvn test && \
    mvn install 


FROM openjdk:8-jre-alpine
WORKDIR /opt/MySysLog
COPY --from=build /opt/MySysLog /opt/MySysLog 
EXPOSE 16001

CMD ["java -jar ./target/syslog.jar"]

