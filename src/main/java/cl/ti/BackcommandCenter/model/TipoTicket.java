package cl.ti.BackcommandCenter.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "tipo_ticket")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoTicket {
    @Id
    @Column(name = "idtipo_ticket")
    private Long id;

    @Column(name = "description")
    private String description;
}

