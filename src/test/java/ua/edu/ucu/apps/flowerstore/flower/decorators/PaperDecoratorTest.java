package ua.edu.ucu.apps.flowerstore.flower.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    Flower flower;
    PaperDecorator bask;
    double expected;
    String expectedDesc;
    double delta;
    @BeforeEach
    void setUp() {
        flower = new Flower("red", 10, 13, FlowerType.ROSE);
        bask = new PaperDecorator(flower);
        expected = 26;
        expectedDesc = "успішний успіх!, paper";
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