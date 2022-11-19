package demo.swaggerliquibase.controller;

import demo.swaggerliquibase.entity.User;
import demo.swaggerliquibase.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
@AllArgsConstructor
public class MyController {
    UserServiceImpl userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        System.out.println(user);
        userService.save(user);
        return ResponseEntity.ok(user);
    }
}
