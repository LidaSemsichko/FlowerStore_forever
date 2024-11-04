package ua.edu.ucu.apps.flowerstore.delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.Item;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    private List<Item> items;
    private PostDeliveryStrategy post;
    @BeforeEach
    void setUp() {
        post = new PostDeliveryStrategy();
        items = new ArrayList<>();
        items.add(new Flower());
        items.add(new Flower());
    }

    @Test
    void deliver() {
        assertDoesNotThrow(() -> post.deliver(items));
    }

    @Test
    void getDescription() {
        assertEquals("Post Delivery", post.getDescription());
    }
}