package payment.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Payment entity representing the payment details.
 */
@Entity
@Data
public class Payment {

 /**
  * @property id
  * Unique identifier of the payment entity.
  */
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;

 /**
  * @property name
  * Name of the payer (e.g., John Doe).
  */
 private String name;

 /**
  * @property number
  * Contact number of the payer (e.g., 9876543210).
  */
 private String number;

 /**
  * @property email
  * Email address of the payer (e.g., john.doe@example.com).
  */
 private String email;

 /**
  * @property address
  * Postal address of the payer (e.g., 123 Main Street).
  */
 private String address;

 /**
  * @property billValue
  * Total value of the bill (e.g., 5000).
  */
 private int billValue;

 /**
  * @property cardNumber
  * Credit card number of the payer (e.g., 4111111111111111).
  */
 private String cardNumber;

 /**
  * @property cardHolder
  * Name of the cardholder (e.g., John Doe).
  */
 private String cardHolder;

 /**
  * @property dateValue
  * Expiration date of the credit card (e.g., 12/24).
  */
 private String dateValue;

 /**
  * @property cvc
  * CVC code of the credit card (e.g., 123).
  */
 private String cvc;

 // Getters and setters (optional for the documentation)
}
