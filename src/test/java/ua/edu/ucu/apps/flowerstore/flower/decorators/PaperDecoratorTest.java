package ua.edu.ucu.apps.flowerstore.flower.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    private Flower sampleFlower;
    private PaperDecorator paperWrappedFlower;
    private double expectedPrice;
    private String expectedDescription;
    private double priceTolerance;

    @BeforeEach
    void initialize() {
        sampleFlower = new Flower("blue", 10, 13, FlowerType.ROSE);
        paperWrappedFlower = new PaperDecorator(sampleFlower);
        expectedPrice = 26;
        expectedDescription = "успішний успіх!, paper";
        priceTolerance = 1e-6;
    }

    @Test
    void testPriceCalculation() {
        assertEquals(expectedPrice, paperWrappedFlower.getPrice(), priceTolerance);
    }

    @Test
    void testDescriptionContent() {
        assertEquals(expectedDescription, paperWrappedFlower.getDescription());
    }
}
