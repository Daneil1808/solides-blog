# solides-blog-api

# Solides Blog API

Bem-vindo ao projeto Solides Blog API! Este projeto é uma API RESTful construída usando Java 17 e Spring Boot 3.1.4. Ele fornece funcionalidades básicas para gerenciar posts, álbuns de fotos, comentários e usuários para um blog.

## Configuração do Ambiente

Certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

- [Java Development Kit (JDK) 17](https://adoptium.net/)
- [Spring Boot 3.1.4](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)

## Configuração do Banco de Dados

O projeto utiliza um banco de dados relacional postgreSQL. Certifique-se de configurar as propriedades do banco de dados no arquivo `application.properties` e de roda-lo localmente.

```properties
# Configurações do Banco de Dados PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/solides-blog-db
spring.datasource.username=postgres
spring.datasource.password=admin
spring.datasource.driver-class-name=org.postgresql.Driver

# Configurações do Hibernate
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update