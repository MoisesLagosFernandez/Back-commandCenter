package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}

