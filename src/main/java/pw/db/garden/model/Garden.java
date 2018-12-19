package pw.db.garden.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Garden {


    private @Id
    @GeneratedValue
    Long id;
    private Long addressId;
    private Long gardenerId;
    private Integer surface;
    private Long stockId;

}
