package ua.edu.ucu.apps.flowerstore.payment;

import lombok.Getter;

@Getter
public class CreditCardPaymentStrategy implements Payment {
    private String description;

    public CreditCardPaymentStrategy() {
        description = "CreditCard";
    }

    public void pay(double price) {
        System.out.println("Paid: " + price);
    }
}
