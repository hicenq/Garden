package pw.db.garden.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Client {

    private @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;
    private Long addressId;
    private Long gardenerId;
    private Integer surface;
    private Long stockId;
}
