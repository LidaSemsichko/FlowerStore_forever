package ua.edu.ucu.apps.flowerstore.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flower")
public class FlowerController {
    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService service) {
        this.flowerService = service;
    }

    @GetMapping
    public List<Flower> fetchAllFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping
    public void saveFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }
}
