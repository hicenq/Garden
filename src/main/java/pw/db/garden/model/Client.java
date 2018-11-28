package pw.db.garden.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "client")
public class Client {

    private @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;
    private Long addressId;
    private String phoneNumber;
    private String email;

}
