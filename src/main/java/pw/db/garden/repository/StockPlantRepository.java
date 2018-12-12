package pw.db.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pw.db.garden.model.Plant;
import pw.db.garden.model.Stock;
import pw.db.garden.model.StockPlant;

import java.util.List;

@RepositoryRestResource
public interface StockPlantRepository extends CrudRepository<StockPlant, Long> {

    List<StockPlant> findByStockId(Long stockId);

    List<StockPlant> findByPlantId(Long plantId);
}
