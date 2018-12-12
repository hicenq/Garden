package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.model.Species;
import pw.db.garden.repository.SpeciesRepository;
import pw.db.garden.repository.StockRepository;

import java.util.List;

@RestController
public class SpeciesController {

    @Autowired
    private SpeciesRepository speciesRepository;

    @GetMapping("/species/{name}")
    public List<Species> getSpeciesByName(@PathVariable String name) {
        return speciesRepository.findByName(name);
    }

}
