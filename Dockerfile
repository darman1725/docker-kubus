FROM openjdk:8-jdk-alpine
MAINTAINER Mutiara_Rahmanda <1941720189@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY Kubus.java /java

#compile file java
RUN javac Kubus.java

#running java
ENTRYPOINT java Kubus