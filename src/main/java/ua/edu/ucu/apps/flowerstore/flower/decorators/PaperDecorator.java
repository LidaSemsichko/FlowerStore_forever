package ua.edu.ucu.apps.flowerstore.flower.decorators;

import ua.edu.ucu.apps.flowerstore.flower.Item;

public class PaperDecorator extends AbstractDecorator{
    public PaperDecorator(Item item) {
        this.item = item;
    }
    public double getPrice() {
        return this.item.getPrice() + 13;
    }
    public String getDescription() {
        return item.getDescription() + ", paper";
    }
}