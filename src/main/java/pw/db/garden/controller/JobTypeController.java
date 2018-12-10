package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.repository.JobTypeRepository;

@RestController
public class JobTypeController {

    @Autowired
    private JobTypeRepository jobTypeRepository;

}
