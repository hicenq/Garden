package pw.db.garden.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Data
@Entity
public class JobType {

    private @Id @GeneratedValue Long id;
    private String name;
    private String description;
    // Dodałem prorytet, żeby nie było tak pusto
    // Jakieś low, normal i high
    private String priority;

}
