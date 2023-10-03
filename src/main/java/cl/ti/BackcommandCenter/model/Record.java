package cl.ti.BackcommandCenter.model;

import lombok.*;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "record")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlog")
    private Long id;

    @Column(name = "numberTicket")
    private Integer numberTicket;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "tipo log_idtipo log")
    private RecordType recordType;
}

