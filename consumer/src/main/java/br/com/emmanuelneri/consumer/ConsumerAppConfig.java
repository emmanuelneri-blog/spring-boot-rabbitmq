package br.com.emmanuelneri.consumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class ConsumerAppConfig {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerAppConfig.class, args);
    }

}
