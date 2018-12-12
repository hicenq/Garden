package pw.db.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pw.db.garden.model.Gardener;

import java.util.List;

@RepositoryRestResource
public interface GardenerRepository extends CrudRepository<Gardener, Long> {

    List<Gardener> findByFirstName(String firstName);
}
