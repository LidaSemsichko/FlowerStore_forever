package ua.edu.ucu.apps.flowerstore.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "flowers")
public class Flower {
    @Id
    private Long id;
    private String color;
    private int sepalLength;
    private double price;
    private FlowerType type;

    public Flower(String color, int sepalLength, double price, FlowerType type) {
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
        this.type = type;
    }
}
