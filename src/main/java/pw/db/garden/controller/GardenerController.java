package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.model.Gardener;
import pw.db.garden.repository.GardenerRepository;

import java.util.List;

@RestController
public class GardenerController {

    @Autowired
    private GardenerRepository gardenerRepository;

    @GetMapping("/gardeners/firstName/{firstName}")
    public List<Gardener> getGardenersByFirstName(@PathVariable String firstName) {
        return gardenerRepository.findByFirstName(firstName);
    }

}
