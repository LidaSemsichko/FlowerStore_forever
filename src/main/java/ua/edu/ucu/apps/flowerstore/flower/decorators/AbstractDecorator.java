package ua.edu.ucu.apps.flowerstore.flower.decorators;

import ua.edu.ucu.apps.flowerstore.flower.Item;

public abstract class AbstractDecorator {
    public Item item;
    public String description;
    public String getDescription(){
        return description;
    };
}