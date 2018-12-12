package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.model.StockPlant;
import pw.db.garden.repository.StockPlantRepository;

import java.util.List;

@RestController
public class StockPlantController {

    @Autowired
    private StockPlantRepository stockPlantRepository;

    @GetMapping("/stockplants/{stockId}/stock")
    public List<StockPlant> getPlantsByClientId(@PathVariable Long stockId) {

        return stockPlantRepository.findByStockId(stockId);
    }

    @GetMapping("/stockplants/{plantId}/plats")
    public List<StockPlant> getJobsByPlantId(@PathVariable Long plantId) {

        return stockPlantRepository.findByPlantId(plantId);
    }
}
