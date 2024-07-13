package br.com.app.notificationscheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NotificationScheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationScheduledApplication.class, args);
    }

}
