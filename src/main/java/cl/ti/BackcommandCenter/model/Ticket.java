package cl.ti.BackcommandCenter.model;

import lombok.*;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtable1")
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "dateInit")
    private Date dateInit;

    @Column(name = "dateEnd")
    private Date dateEnd;

    @ManyToOne
    @JoinColumn(name = "user_iduser_TI")
    private User userTecnico;

    @ManyToOne
    @JoinColumn(name = "user_iduser_Client")
    private User userCliente;

    @ManyToOne
    @JoinColumn(name = "tipo_ticket_idtipo_ticket")
    private TipoTicket tipoTicket;

    @ManyToOne
    @JoinColumn(name = "state_idstate")
    private State state;

    @ManyToOne
    @JoinColumn(name = "device_iddevice")
    private Device device;

    @Column(name = "slaTimeHrs")
    private Integer slaTimeHrs;
}

