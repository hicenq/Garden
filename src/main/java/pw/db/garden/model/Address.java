package pw.db.garden.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Data
@Entity
public class Address {

    private @Id @GeneratedValue Long id;
    private String street;
    private String postcode;
    private String city;
    private String local;

}
