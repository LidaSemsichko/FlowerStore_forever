package ua.edu.ucu.apps.flowerstore.flower.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    Flower flower;
    BasketDecorator bask;
    float expected;
    String expectedDesc;
    double delta;
    @BeforeEach
    void setUp() {
        flower = new Flower("red", 10, 13, FlowerType.ROSE);
        bask = new BasketDecorator(flower);
        expected = 17;
        expectedDesc = "успішний успіх!, basket";
        delta = 0.000001;
    }

    @Test
    void getPrice() {
        assertEquals(expected, bask.getPrice(), delta);
    }

    @Test
    void getDescription() {
        assertEquals(expectedDesc, bask.getDescription());
    }
}