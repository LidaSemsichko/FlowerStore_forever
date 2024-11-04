package ua.edu.ucu.apps.flowerstore.order;

import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.flower.Item;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

import java.util.List;

public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment newPayment) {
        payment = newPayment;
    }
    public void setDeliveryStrategy(Delivery newDelivery) {
        delivery = newDelivery;
    }
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    public void processOrder() {
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }
}