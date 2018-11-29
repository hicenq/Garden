package pw.db.garden.model;


import lombok.Data;
import sun.security.util.Password;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {

    private @Id
    @GeneratedValue
    Long id;
    private String username;
    private String email;
    private Password password;

}
