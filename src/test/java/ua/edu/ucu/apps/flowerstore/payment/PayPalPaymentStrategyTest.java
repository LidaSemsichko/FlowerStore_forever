package ua.edu.ucu.apps.flowerstore.payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    CreditCardPaymentStrategy paymentStrategy;
    double price;

    @BeforeEach
    void setUp() {
        paymentStrategy = new CreditCardPaymentStrategy();
        price = 6.9;
    }

    @Test
    void pay() {
        assertDoesNotThrow(() -> paymentStrategy.pay(price));
    }
}