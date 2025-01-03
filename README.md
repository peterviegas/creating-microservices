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
git clone https://github.com/your-username/microservice-orders-rabbitmq.git
cd microservice-orders-rabbitmq
```

2 - Set up RabbitMQ:
3- Configure Application:
```
 spring:
  rabbitmq:
    host: localhost
    port: 5672
    username: guest
    password: guest 
    ```

