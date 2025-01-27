FROM openjdk:17
EXPOSE 9292
ADD target/WithoutDb.jar WithoutDb.jar
ENTRYPOINT ["java","-jar","/WithoutDb.jar"]