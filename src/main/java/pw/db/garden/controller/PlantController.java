package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.model.Plant;
import pw.db.garden.repository.ClientRepository;
import pw.db.garden.repository.PlantRepository;

import java.util.List;

@RestController
public class PlantController {

    @Autowired
    private PlantRepository plantRepository;

    @GetMapping("/plants/name/{name}")
    public List<Plant> getPlantsByName(@PathVariable String name) {
        return plantRepository.findByName(name);
    }

}
