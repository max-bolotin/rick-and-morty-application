# 👴👦 Rick and Morty app
___
This is the application that can extract all the characters from the "Rick and Morty" TV series with the help of a public [API](https://rickandmortyapi.com/api/character), and add the characters to the database. After this the user can get a random character from the database or find all the characters with the specified name or a part of name.
___
## Technologies stack:
- Java 11
- PostgreSQL
- Liquibase
- Swagger
- Docker
- Spring Boot
- Maven
- Git
- Cron
___
## Instructions
- Download the Docker image from the [repository](https://hub.docker.com/r/maksymbolotin/rick-and-morty-app)
- Run it with the command "docker-compose up"
- The app reads the data from the external API and saves the characters into the DB at the first run
- Use [Swagger](http://localhost:6868/swagger-ui/#) or any suitable software like _Postman_ to retrieve a random character from the DB, or to fetch all the characters with a specified name (or a part of name)
- If the app is running, it will renew the data from the external API every day at 8 AM