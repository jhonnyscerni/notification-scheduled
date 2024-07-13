package br.com.app.notificationscheduled.repository;

import br.com.app.notificationscheduled.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
