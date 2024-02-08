package edu.estu.recyclingplatform.service;

import edu.estu.recyclingplatform.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
