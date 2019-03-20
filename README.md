# spring-demo
Example of spring usage

## To run/compile

**On Eclipse :** Right click project > RUn As > Spring Boot App

**Gradle:** ./gradlew bootRun

**Maven:** ./mvnw spring-boot:run

**Maven:** ./mvnw clean package

## To test the CRUD methdos:

curl -v -X POST localhost:8080/user -H 'Content-Type:application/json' -d '{"id":123,"name":"bob","birthday":"24/03"}'

curl -X get localhost:8080/user/123

curl -X PUT -H "Content-Type: application/json" -d '{"id":123,"name":"bob","birthday":"24/03"}' "localhost:8080/user/123"

curl -X DELETE localhost:8080/user/456
