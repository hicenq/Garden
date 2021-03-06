package pw.db.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pw.db.garden.model.Job;

import java.util.List;

@RepositoryRestResource
public interface JobRepository extends CrudRepository<Job, Long> {
    List<Job> findByClientId(Long clientId);

}
