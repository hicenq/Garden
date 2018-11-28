package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.repository.ClientRepository;
import pw.db.garden.repository.PlantRepository;

@RestController
public class PlantController {

    @Autowired
    private PlantRepository plantRepository;



}
