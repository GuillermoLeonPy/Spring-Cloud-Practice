package com.springboot.springcloud.practice.payment.api.controller;
import com.springboot.springcloud.practice.dto.notification.NotificationResponse;
import com.springboot.springcloud.practice.dto.payment.DoPaymentRequest;
import com.springboot.springcloud.practice.dto.payment.DoPaymentResponse;
import com.springboot.springcloud.practice.payment.api.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "Payment controller", path = "/payment")
public class PaymentController {

    private final Logger logger = LoggerFactory.getLogger(PaymentController.class);

    private final NotificationService notificationService;

    @Value("${insurnace.provider.url}")
    private String insuranceProviderUrl;

    public PaymentController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping(path = "/ping")
    public String pìng(){
        return "Pong";
    }

    @PostMapping(path = "/doPayment")
    public DoPaymentResponse doPayment(DoPaymentRequest doPaymentRequest){
        doSleep(1000);
        NotificationResponse notificationResponse  = notificationService.notificate();

        logger.info("notification response: " + notificationResponse);
        return DoPaymentResponse.builder()
                .transactionId(doPaymentRequest.getTransactionId())
                .paymentStatus("PENDING")
                .build();
    }

    @GetMapping(path = "/insuranceProviderUrl")
    public String getInsuranceProviderUrl(){
        return insuranceProviderUrl;
    }

    private void doSleep(int milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
