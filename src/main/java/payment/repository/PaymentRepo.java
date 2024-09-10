package payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import payment.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment,Long> {
}
