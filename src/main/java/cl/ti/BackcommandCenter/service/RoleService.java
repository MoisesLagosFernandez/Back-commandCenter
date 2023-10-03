package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.Role;

import java.util.List;

public interface RoleService {
    Role saveRole(Role role);
    Role getRoleById(Long id);
    List<Role> getAllRoles();
    void deleteRole(Long id);
}

