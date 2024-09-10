package payment.service.Impl;

import org.springframework.stereotype.Service;
import payment.entity.Payment;
import payment.payload.PaymentCreateRequest;
import payment.repository.PaymentRepo;

@Service
public class PaymentService implements payment.service.PaymentService {
    private final PaymentRepo paymentRepo;


    public PaymentService(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    @Override
    public Payment createPayment(PaymentCreateRequest paymentCreateRequest) {
        Payment payment=new Payment();;
        Payment savedpayment=paymentRepo.save(payment);
        return savedpayment;
    }

}

