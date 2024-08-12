package com.springboot.springcloud.practice.dto.notification;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@Builder
public class NotificationRequest {
    private String notificationId;
    private String transactionId;
    private String notificationType;
    private String notificationSubject;
    private String notificationBody;

}
