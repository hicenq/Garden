package pw.db.garden.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class Stock {

    private @Id @GeneratedValue Long id;
    private String name;
    private Long addressId;
    //TODO stock_plants
    private Long plantId;

}
