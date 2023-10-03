package cl.ti.BackcommandCenter.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "device")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddevice")
    private Long id;

    @Column(name = "serie1")
    private String serie1;

    @Column(name = "serie2")
    private String serie2;

    @ManyToOne
    @JoinColumn(name = "company_idcompany")
    private Company company;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "contract_idcontract")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "region_idregion")
    private Region region;
}
