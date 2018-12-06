package com.jarxi.sdjpa.serviceimpl;

import com.jarxi.sdjpa.entity.User;
import com.jarxi.sdjpa.repository.UserPagingAndSortingRepository;
import com.jarxi.sdjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPagingAndSortingServiceImpl implements UserService {

    @Autowired
    private UserPagingAndSortingRepository userRepository;

    @Override
    public List<User> getUserList() {
        return null; //userRepository.findAll();
    }

    @Override
    public User findUserById(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }
}


