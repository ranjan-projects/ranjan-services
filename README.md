# ranjan-user-services
## Description

### ranjan-user-services

## Dependencies
All dependecies have been added in gradle.properties


## Swagger documentation can be accessed via
### Local
http://localhost:8080/v2/api-docs
### Server
https://ranjan-user-services.herokuapp.com/v2/api-docs

## Swagger API UI can be accessed via
### Local
http://localhost:8080/swagger-ui.html
### Server
https://ranjan-user-services.herokuapp.com/swagger-ui.html

## Dockerisation
docker build --build-arg JAR_FILE=build/libs/\*.jar -t springio/ranjan-user-services .
docker run -p 8080:8080 springio/ranjan-user-services