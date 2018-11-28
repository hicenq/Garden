package pw.db.garden.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Data
@Entity
public class Plant {

    private @Id @GeneratedValue Long id;
    private String name;
    private String info;
    private String species;

}
