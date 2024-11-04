package ua.edu.ucu.apps.flowerstore.flower.decorators;

import ua.edu.ucu.apps.flowerstore.flower.Item;
public class RibbonDecorator extends AbstractDecorator{
    public RibbonDecorator(Item item) {
        this.item = item;
    }
    public double getPrice() {
        return this.item.getPrice() + 40;
    }
    public String getDescription() {
        return item.getDescription() + ", ribbon";
    }
}