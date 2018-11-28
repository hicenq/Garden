package pw.db.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pw.db.garden.model.Client;
import pw.db.garden.model.Plant;

@RepositoryRestResource
public interface PlantRepository extends CrudRepository<Plant, Long> {

}
