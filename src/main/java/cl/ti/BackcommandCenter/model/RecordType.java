package cl.ti.BackcommandCenter.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "record_Tipe")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecordType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipo log")
    private Long id;

    @Column(name = "description")
    private String description;
}
