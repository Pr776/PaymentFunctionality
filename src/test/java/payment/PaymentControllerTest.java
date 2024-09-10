package payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import payment.controller.PaymentController;
import payment.entity.Payment;
import payment.payload.PaymentCreateRequest;
import payment.service.PaymentService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PaymentControllerTest {
    @Mock
    private PaymentService paymentService;

    @InjectMocks
    private PaymentController paymentController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreatePayment() {
        // Given
        PaymentCreateRequest paymentCreateRequest = new PaymentCreateRequest();
        paymentCreateRequest.setName("Priyanka Samal");
        paymentCreateRequest.setBillValue(1000);
        paymentCreateRequest.setCardNumber("4111111111111111");

        Payment createdPayment = new Payment();
        createdPayment.setId(1L);
        createdPayment.setName("annapurna");
        createdPayment.setBillValue(1000);
        createdPayment.setCardNumber("4111111111111111");

        // Mock the service
        when(paymentService.createPayment(any(PaymentCreateRequest.class)))
                .thenReturn(createdPayment);

        // When
        ResponseEntity<Payment> response = paymentController.createPayment(paymentCreateRequest);

        // Then
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(createdPayment, response.getBody());
    }
}
