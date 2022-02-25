package co.com.poli.tallerpds2.serviceuser.service;

import co.com.poli.tallerpds2.serviceuser.entity.User;

import java.util.List;

public interface UserService {

    void guardar(User user);
    void eliminar(User user);
    List<User> listar();
    User findById(Long id);

}
