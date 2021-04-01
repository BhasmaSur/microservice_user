From openjdk:8
copy ./target/user-0.0.1-SNAPSHOT.jar user-0.0.1-SNAPSHOT.jar
copy ./target/application.properties application.properties
CMD ["java","-jar","user-0.0.1-SNAPSHOT.jar"]
