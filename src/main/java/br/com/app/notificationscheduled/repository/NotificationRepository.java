package br.com.app.notificationscheduled.repository;

import br.com.app.notificationscheduled.model.Notification;
import br.com.app.notificationscheduled.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}