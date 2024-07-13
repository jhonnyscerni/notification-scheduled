package br.com.app.notificationscheduled.controller.dto;


import br.com.app.notificationscheduled.model.Channel;
import br.com.app.notificationscheduled.model.Notification;
import br.com.app.notificationscheduled.model.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}