package payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import payment.entity.Payment;
import payment.payload.PaymentCreateRequest;
import payment.service.PaymentService;

@RestController
@RequestMapping("api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Payment>createPayment(@RequestBody PaymentCreateRequest paymentCreateRequest){
        Payment createdPayment=paymentService.createPayment(paymentCreateRequest);
        return new ResponseEntity<>(createdPayment, HttpStatus.CREATED);
    }
    @GetMapping("/search")
    public ResponseEntity<Payment> searchPayment(@RequestBody PaymentCreateRequest paymentCreateRequest){
        return null;
    }



}
