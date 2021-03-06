package pw.db.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pw.db.garden.model.JobType;

@RepositoryRestResource
public interface JobTypeRepository extends CrudRepository<JobType, Long> {

}
