package ua.edu.ucu.apps.flowerstore.payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    CreditCardPaymentStrategy payment;
    double price;

    @BeforeEach
    void setUp() {
        payment = new CreditCardPaymentStrategy();
        price = 14.8;
    }

    @Test
    void pay() {
        assertDoesNotThrow(() -> payment.pay(price));
    }

    @Test
    void getDescription() {
        assertEquals("Creditka", payment.getDescription());
    }
}