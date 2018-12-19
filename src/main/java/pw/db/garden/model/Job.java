package pw.db.garden.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;



@Data
@Entity
public class Job {

    private @Id @GeneratedValue Long id;
    //@ManyToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "client_id")
    private Long clientId;
    private Long gardenId;
    private Date date;
    private Long jobTypeId;
    private String info;
    private String status;

}
