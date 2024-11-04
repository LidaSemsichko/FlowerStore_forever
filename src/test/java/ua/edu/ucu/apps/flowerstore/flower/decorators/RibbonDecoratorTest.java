package ua.edu.ucu.apps.flowerstore.flower.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    private Flower testFlower;
    private RibbonDecorator ribbonedFlower;
    private double expectedPrice;
    private String expectedDescription;
    private double priceTolerance;

    @BeforeEach
    void setUp() {
        testFlower = new Flower("red", 10, 13, FlowerType.ROSE);
        ribbonedFlower = new RibbonDecorator(testFlower);
        expectedPrice = 53;
        expectedDescription = "успішний успіх!, ribbon";
        priceTolerance = 1e-6;
    }

    @Test
    void testGetPrice() {
        assertEquals(expectedPrice, ribbonedFlower.getPrice(), priceTolerance);
    }

    @Test
    void testGetDescription() {
        assertEquals(expectedDescription, ribbonedFlower.getDescription());
    }
}
