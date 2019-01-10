FROM java:oracle-java8

WORKDIR /opt/MySysLog

RUN \
    git clone https://github.com/rijocv/syslog_v1


COPY . /opt/MySysLog

RUN mvn compile && \
    mvn test && \
    mvn package

EXPOSE 16001

CMD ["java -jar ./target/syslog.jar"]

