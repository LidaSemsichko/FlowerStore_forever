package ua.edu.ucu.apps.flowerstore.flower.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    private Flower testFlower;
    private BasketDecorator basketDecorator;
    private float priceExpected;
    private String descriptionExpected;
    private double tolerance;

    @BeforeEach
    void init() {
        testFlower = new Flower("red", 10, 13, FlowerType.ROSE);
        basketDecorator = new BasketDecorator(testFlower);
        priceExpected = 17;
        descriptionExpected = "успішний успіх!, basket";
        tolerance = 1e-6;
    }

    @Test
    void testGetPrice() {
        assertEquals(priceExpected, basketDecorator.getPrice(), tolerance);
    }

    @Test
    void testGetDescription() {
        assertEquals(descriptionExpected, basketDecorator.getDescription());
    }
}
