package cl.ti.BackcommandCenter.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "state")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstate")
    private Long id;

    @Column(name = "description")
    private String description;
}
