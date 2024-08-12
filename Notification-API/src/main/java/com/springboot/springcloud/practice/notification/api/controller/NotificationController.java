package com.springboot.springcloud.practice.notification.api.controller;

import com.springboot.springcloud.practice.dto.notification.NotificationRequest;
import com.springboot.springcloud.practice.dto.notification.NotificationResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "Notification controller", path = "/notification")
public class NotificationController {

    private final Logger logger = LoggerFactory.getLogger(NotificationController.class);

    @GetMapping(path = "/ping")
    public String ping(){
        return "pong";
    }

    @PostMapping(path = "/notificate")
    public NotificationResponse notificate(@RequestBody(required = true) NotificationRequest notificationRequest){
        doSleep(5000);
        logger.info("notification request: " + notificationRequest);
        return NotificationResponse.builder()
                .notificationId(notificationRequest.getNotificationId())
                .notificationStatus("PENDING")
                .build();
    }

    private void doSleep(int milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
