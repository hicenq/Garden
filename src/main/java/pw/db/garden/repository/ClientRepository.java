package pw.db.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pw.db.garden.model.Client;

import java.util.List;

@RepositoryRestResource
public interface ClientRepository extends CrudRepository<Client, Long> {

    List<Client> findByFirstName(String firstName);

    List<Client> findByEmail(String email);
}
