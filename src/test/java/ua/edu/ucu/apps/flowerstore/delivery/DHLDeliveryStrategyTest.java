package ua.edu.ucu.apps.flowerstore.delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.Item;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy dhlDeliveryStrategy;
    private List<Item> items;

    @BeforeEach
    void setUp() {
        dhlDeliveryStrategy = new DHLDeliveryStrategy();
        items = new ArrayList<>();
        items.add(new Flower());
        items.add(new Flower());
    }

    @Test
    void testDeliver() {
        assertDoesNotThrow(() -> dhlDeliveryStrategy.deliver(items));
    }
    @Test
    void testDescription() {
        assertEquals("DHLDelivery", dhlDeliveryStrategy.getDescription());
    }
}