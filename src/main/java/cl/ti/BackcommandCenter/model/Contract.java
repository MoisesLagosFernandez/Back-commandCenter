package cl.ti.BackcommandCenter.model;

import lombok.*;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contract")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    @Id
    @Column(name = "idcontract")
    private Long id;

    @Column(name = "validity")
    private Date validity;
}
