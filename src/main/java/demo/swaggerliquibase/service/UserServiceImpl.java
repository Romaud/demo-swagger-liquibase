package demo.swaggerliquibase.service;

import demo.swaggerliquibase.entity.User;
import demo.swaggerliquibase.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl {
    UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
