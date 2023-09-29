package com.reservation.paymentservice.dto;

import com.reservation.paymentservice.constants.PaymentMethod;
import lombok.Data;

@Data
public class PaymentRequest {
    private Integer bookingId;
    private Integer busId;
    private Float paymentAmount;
    private PaymentMethod paymentMethod;
}
