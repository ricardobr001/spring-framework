# Spring web app
This is a spring application that i've done to study spring-boot

# Dependencies
You'll need to have the [lombok](https://projectlombok.org/) to test this application

# Acessing the database
You'll need to access the database in the `http://localhost:8080/h2-console`

Be sure that the JDBC URL is `jdbc:h2:mem:testdb`

# Executing
- clean: `mvn spring-boot:clean`
- install: `mvn spring-boot:install`
- run: `mvn spring-boot:run`