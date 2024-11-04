package ua.edu.ucu.apps.flowerstore.flower.decorators;

import ua.edu.ucu.apps.flowerstore.flower.Item;

public class BasketDecorator extends AbstractDecorator {
    public BasketDecorator(Item item) {
        this.item = item;
    }
    public double getPrice() {
        return this.item.getPrice() + 4;
    }
    public String getDescription() {
        return item.getDescription() + ", basket";
    }
}