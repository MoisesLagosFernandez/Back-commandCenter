package cl.ti.BackcommandCenter.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "sla")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SLA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsla")
    private Long id;

    @Column(name = "hrsRegion")
    private Integer hrsRegion;

    @Column(name = "hrsSantiago")
    private Integer hrsSantiago;

    @Column(name = "hrsExtRegion")
    private Integer hrsExtRegion;

    @ManyToOne
    @JoinColumn(name = "company_idcompany")
    private Company company;
}
