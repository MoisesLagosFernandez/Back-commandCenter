package cl.ti.BackcommandCenter.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "correo")
    private String correo;

    @Column(name = "password")
    private String password;

    @Column(name = "company")
    private String company;

    @ManyToOne
    @JoinColumn(name = "role_idrole")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "department_iddepartment")
    private Department department;
}

