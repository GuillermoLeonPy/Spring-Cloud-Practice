package com.springboot.springcloud.practice.dto.notification;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@Builder
public class NotificationResponse {
    private String notificationId;
    private String notificationStatus;
}
