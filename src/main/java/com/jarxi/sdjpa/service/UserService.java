package com.jarxi.sdjpa.service;

import com.jarxi.sdjpa.domain.User;

import java.util.List;

public interface UserService {

    public List<User> getUserList();

    public User findUserById(long id);

    public void save(User user);

    public void edit(User user);

    public void delete(User user);

    public void deleteById(long id);
}
