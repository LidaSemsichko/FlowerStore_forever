package ua.edu.ucu.apps.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {
    @GetMapping("/payment")
    public List<Payment> getPayments() {
        return List.of(new CreditCardPaymentStrategy());
    }
}
