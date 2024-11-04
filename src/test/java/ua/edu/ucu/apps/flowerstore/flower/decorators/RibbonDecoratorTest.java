package ua.edu.ucu.apps.flowerstore.flower.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    Flower flower;
    RibbonDecorator bask;
    double expected;
    String expectedDesc;
    double delta;
    @BeforeEach
    void setUp() {
        flower = new Flower("red", 10, 13, FlowerType.ROSE);
        bask = new RibbonDecorator(flower);
        expected = 53;
        expectedDesc = "успішний успіх!, ribbon";
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