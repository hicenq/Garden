package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.model.Stock;
import pw.db.garden.repository.StockRepository;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/stocks/name/{name}")
    public List<Stock> getSpeciesByName(@PathVariable String name) {
        return stockRepository.findByName(name);
    }

}
