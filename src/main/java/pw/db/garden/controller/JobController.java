package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.model.Job;
import pw.db.garden.repository.ClientRepository;
import pw.db.garden.repository.JobRepository;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    @GetMapping("/clients/{clientId}/jobs")
    public List<Job> getJobsByClientId(@PathVariable Long clientId) {
        return jobRepository.findByClientId(clientId);
    }

}
