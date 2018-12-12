package pw.db.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pw.db.garden.model.Stock;

import java.util.List;

@RepositoryRestResource
public interface StockRepository extends CrudRepository<Stock, Long> {

    List<Stock> findByName(String name);
}
