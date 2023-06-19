package ru.kata.spring.boot_security.demo.service;



import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;


public interface UserService {

    public List<User> getListFromService();

    public void saveUser(User user);

    public void updateUser(User user);

    public User getUserById(Long id);

    public void deleteUser(Long id);

    public User findByUsername (String email);


}
