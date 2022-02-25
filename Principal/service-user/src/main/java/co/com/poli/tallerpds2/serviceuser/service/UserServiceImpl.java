package co.com.poli.tallerpds2.serviceuser.service;

import co.com.poli.tallerpds2.serviceuser.entity.User;
import co.com.poli.tallerpds2.serviceuser.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void guardar(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void eliminar(User user) {
        userRepository.delete(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> listar() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
