package com.springboot.springcloud.practice.payment.api.service;
import com.springboot.springcloud.practice.dto.notification.NotificationRequest;
import com.springboot.springcloud.practice.dto.notification.NotificationResponse;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {

    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    private final RestTemplate restTemplate;

    public NotificationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @CircuitBreaker(name = "notificate-circuit-breaker", fallbackMethod = "getFallBackNotificateResponse")
    public NotificationResponse notificate(){
        logger.info("Notification Service::notificate method");
        return restTemplate.postForObject("http://NOTIFICATION-SERVICE/notification-api/notification/notificate",
                NotificationRequest.builder()
                        .notificationId("112233")
                        .transactionId("123")
                        .notificationType("email")
                        .notificationSubject("XXX service payment")
                        .notificationBody("Dear customer...")
                        .build(),
                NotificationResponse.class);
    }

    /*if it is declared private, logger property will trigger null pointer exception*/
    public NotificationResponse getFallBackNotificateResponse(Throwable throwable){
        logger.info("notificate-circuit-breaker fallback method; return notification in processing status");
        return NotificationResponse.builder()
                .notificationStatus("PROCESSING")
                .build();
    }
}
