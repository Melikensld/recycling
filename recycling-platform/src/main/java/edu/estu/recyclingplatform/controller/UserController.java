package edu.estu.recyclingplatform.controller;

import edu.estu.recyclingplatform.model.User;
import edu.estu.recyclingplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        userService.saveUser(user);
        return "User added successfully";
    }

    @GetMapping("getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
