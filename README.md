# Spring boot with AWS Lambda example

This is a simple REST application compatible with AWS Lambda, written in Java 11 + Spring Boot 2. 

The embedded tomcat has been removed.

# Build

```
mvn clean package
```

The jar file will be packaged to `target` folder.

# API

### /buildings
Show all buildings.

### /building/{id}
Show building by id. The `id` can be 1-5 in this example.