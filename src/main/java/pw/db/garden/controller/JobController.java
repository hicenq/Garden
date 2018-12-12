package pw.db.garden.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.model.Job;
import pw.db.garden.repository.JobRepository;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    private static final Logger logger = LoggerFactory.getLogger(JobController.class);

    @GetMapping("/clients/{clientId}/jobs")
    public List<Job> getJobsByClientId(@PathVariable Long clientId) {
        logger.info("Receive get at {}",
                DateFormat.getInstance().format(new Date()));
        return jobRepository.findByClientId(clientId);
    }

}
