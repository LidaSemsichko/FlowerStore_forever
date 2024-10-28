package ua.edu.ucu.apps.flowerstore.flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    private String description;
    private double price;
    public abstract double getPrice();
}
