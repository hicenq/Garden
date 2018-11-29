package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.repository.SpeciesRepository;
import pw.db.garden.repository.StockRepository;

@RestController
public class SpeciesController {

    @Autowired
    private SpeciesRepository speciesRepository;



}
