package payment.service;

import payment.entity.Payment;
import payment.payload.PaymentCreateRequest;

public interface PaymentService {

    Payment createPayment(PaymentCreateRequest paymentCreateRequest);
}
