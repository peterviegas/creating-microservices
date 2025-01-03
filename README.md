## Microservice for Order Creation with RabbitMQ

### Introduction
This project demonstrates the creation of a microservice using Spring Boot and RabbitMQ for asynchronous message processing. The microservice handles order creation (Pedido) and sends messages to a RabbitMQ queue for further processing.

### Features
- RESTful API for order creation.
- RabbitMQ integration for message queue management.
- Simple and extensible architecture for microservices.

### Requirements
Before starting, ensure you have the following tools installed:
- Java 17 or higher.
- Spring Boot 3.x.
- RabbitMQ server (tested with RabbitMQ version 3.9.x or higher).
- Maven for dependency management.

### Installation and Setup
1 - Clone the Repository:
```
git clone https://github.com/peterviegas/creating-microservices.git
cd creating-microservices
```

2 - Set up RabbitMQ:
```
docker run -d --hostname rabbitmq --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:management
```

3- Configure Application:
```
 spring:
  rabbitmq:
    host: localhost
    port: 5672
    username: guest
    password: guest 
```
## SpringDocOpenApiConfig
How the OpenAPI documentation was configured for the Order Service (Pedidos) using SpringDoc OpenAPI 3.

### Configuration Overview
To generate and serve the OpenAPI documentation, the class SpringDocOpenApiConfig was created. This configuration defines metadata for the API, including title, license, and contact information.
```
package com.peter.pedidos.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringDocOpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                            .title("Rest API - Orders")
                            .license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/LICENSE-2.0"))
                            .contact(new Contact().name("Peter Viegas").email("peterviegas@outlook.com"))
                );
    }
}
```
### Key Annotations and Methods
- @Configuration: Indicates that this class contains Spring configuration.
- @Bean: Registers the OpenAPI bean to customize the API documentation.
- OpenAPI: The main class for creating OpenAPI specifications.
- Info: Defines metadata for the API, such as title, description, and version.
- License: Provides licensing details for the API.
- Contact: Adds contact information for the API maintainer.

### Viewing the Documentation
### Local Server
Once the application is running, the OpenAPI documentation will be available at:
- Swagger UI: http://localhost:8080/swagger-ui.html
- Raw JSON/YAML: http://localhost:8080/v3/api-docs

![image](https://github.com/user-attachments/assets/3f4366c3-2257-4a59-a17e-8219f7303c0e)

### Test
The generated Swagger UI provides an interactive interface to explore and test API endpoints.
![image](https://github.com/user-attachments/assets/58b3556a-769f-4d18-a0ab-c4d152e0a27f)



