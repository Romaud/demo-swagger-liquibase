package demo.swaggerliquibase.service;

import demo.swaggerliquibase.entity.User;
import demo.swaggerliquibase.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl {
    UserRepository userRepository;

    public User save(User user) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(user);
        User usr = userRepository.save(user);
        System.out.println("------------------------------");
        System.out.println(usr);
        return usr;
    }
}
