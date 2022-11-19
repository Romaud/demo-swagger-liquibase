package demo.swaggerliquibase.controller;

import demo.swaggerliquibase.entity.User;
import demo.swaggerliquibase.service.UserServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "User controller")
@RequestMapping("/api")
@RestController
@AllArgsConstructor
public class UserController {
    UserServiceImpl userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping
    @Operation(description = "User create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        System.out.println(user);
        userService.save(user);
        return ResponseEntity.ok(user);
    }

    @Operation(description = "Get all user")
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
