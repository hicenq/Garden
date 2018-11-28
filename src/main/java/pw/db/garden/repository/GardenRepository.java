package pw.db.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pw.db.garden.model.Garden;

@RepositoryRestResource
public interface GardenRepository extends CrudRepository<Garden, Long> {

}
