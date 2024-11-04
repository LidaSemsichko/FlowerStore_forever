package ua.edu.ucu.apps.flowerstore.order;

import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.flower.Item;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

import java.util.List;

public class Order {
    private List<Item> products;
    private Payment paymentMethod;
    private Delivery deliveryMethod;

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDeliveryMethod(Delivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public double getTotalCost() {
        return products.stream().mapToDouble(Item::getPrice).sum();
    }

    public void executeOrder() {
        paymentMethod.pay(getTotalCost());
        deliveryMethod.deliver(products);
    }

    public void addProduct(Item product) {
        products.add(product);
    }

    public void removeProduct(Item product) {
        products.remove(product);
    }
}
