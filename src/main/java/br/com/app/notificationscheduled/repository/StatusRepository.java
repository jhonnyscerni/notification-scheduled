package br.com.app.notificationscheduled.repository;

import br.com.app.notificationscheduled.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}