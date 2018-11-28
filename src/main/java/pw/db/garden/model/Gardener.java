package pw.db.garden.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Gardener {

    private @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;
}
