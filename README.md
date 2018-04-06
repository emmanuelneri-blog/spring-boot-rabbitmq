# spring-boot-rabbitmq

Código fonte do Post: [RabbitMQ no Spring Boot](https://wp.me/p5RSbg-jZ).

## Pré requisito

- Maven 3
- Java 8
- RabbitMQ 3.7.2

## Configurando RabbitMQ

- Acessar ```http://localhost:15672/#/queue```
- Criar Queue com o nome ```OrderQueue``` com o atribributo Durability ```Durable```

## Preparando ambiente

- ```cd spring-boot-rabbitmq```
- ```mvn clean package```

## Executando 

#### Enviando pedidos para fila do RabbitMQ

- ```cd spring-boot-rabbitmq/sender```
- ```mvn spring-boot:run```


#### Consumindo fila do RabbitMQ

- ```cd spring-boot-rabbitmq/consumer```
- ```mvn spring-boot:run```
