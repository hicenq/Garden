package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.repository.GardenerRepository;

@RestController
public class GardenerController {

    @Autowired
    private GardenerRepository gardenerRepository;



}
