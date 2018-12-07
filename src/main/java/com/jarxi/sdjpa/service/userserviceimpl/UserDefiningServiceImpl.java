package com.jarxi.sdjpa.service.userserviceimpl;

import com.jarxi.sdjpa.entity.User;
import com.jarxi.sdjpa.repository.UserDefiningRepository;
import com.jarxi.sdjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class UserDefiningServiceImpl implements UserService {

    @Autowired
    private UserDefiningRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findByIdNot(0);
    }

    @Override
    public User findUserById(long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public void save(User user) {
        return;
    }

    @Override
    public void edit(User user) {
        return;
    }

    @Override
    public void delete(User user) {
        userRepository.removeById(user.getId());
        return;
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
        return;
    }
}


