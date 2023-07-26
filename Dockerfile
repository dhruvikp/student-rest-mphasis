# Use Java 11
FROM openjdk:11-jdk

#COPY JAR FILE
COPY target/student-rest-1.0.0.jar student-rest-1.0.0.jar

ENTRYPOINT ["java","-jar","/student-rest-1.0.0.jar"]