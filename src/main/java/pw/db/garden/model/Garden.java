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
    private Long job;
    private String lastName;
    private Long addressId;
    private String phoneNumber;
    private String email;

}