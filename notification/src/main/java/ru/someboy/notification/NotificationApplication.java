package ru.someboy.notification;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.someboy.amqp.RabbitMQMessageProducer;

@SpringBootApplication(
        scanBasePackages = {
                "ru.someboy.notification",
                "ru.someboy.amqp"
        }
)
//@EnableEurekaClient

public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(
//            RabbitMQMessageProducer producer,
//            NotificationConfig notificationConfig) {
//        return args -> {
//            producer.publish(
//                    new Person("Артём", 35),
//                    notificationConfig.getInternalExchange(),
//                    notificationConfig.getInternalNotificationRoutingKey());
//        };
//    }
//
//    record Person(String name, int age) {}
}
