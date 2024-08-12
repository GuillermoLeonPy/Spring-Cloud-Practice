package com.springboot.springcloud.practice.dto.payment;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@Builder
public class DoPaymentResponse {
    private String transactionId;
    private String paymentStatus;
}
