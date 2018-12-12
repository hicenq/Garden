package pw.db.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pw.db.garden.model.Client;
import pw.db.garden.model.Plant;

import java.util.List;

@RepositoryRestResource
public interface PlantRepository extends CrudRepository<Plant, Long> {

    List<Plant> findByName(String name);
}
