FROM openjdk:11-jre-slim
COPY target/mlicence-0.0.1-SNAPSHOT.jar /usr/src/mlicence/
WORKDIR /usr/src/mlicence
EXPOSE 9200
CMD ["java",  "-jar", "mlicence-0.0.1-SNAPSHOT.jar"]