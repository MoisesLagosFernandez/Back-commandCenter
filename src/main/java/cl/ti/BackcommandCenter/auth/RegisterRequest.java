package cl.ti.BackcommandCenter.auth;

import cl.ti.BackcommandCenter.model.Department;
import cl.ti.BackcommandCenter.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String username;
    private String email;
    private String password;
    private long company;
    private Role role;
    private Department department;

}
