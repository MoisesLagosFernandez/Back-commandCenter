package cl.ti.BackcommandCenter.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "region")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idregion")
    private Long id;

    @Column(name = "description")
    private String description;
}
