package com.springboot.springcloud.practice.dto.payment;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Builder
public class DoPaymentRequest {
    private String userId;
    private String transactionId;
    private String bussinesId;
    private String serviceId;
    private String paymentMethod;
    private String cardId;
    private String AccountId;
}
