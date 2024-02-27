FROM openjdk:8-jdk-alpine

WORKDIR /


COPY target/demo-1.0-SNAPSHOT.jar .
# 指定启动命令
ENTRYPOINT ["java","-jar","demo-1.0-SNAPSHOT.jar"]