package com.jarxi.sdjpa.service.userserviceimpl;

import com.jarxi.sdjpa.domain.User;
import com.jarxi.sdjpa.repository.UserQueryAnnotationRepository;
import com.jarxi.sdjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserQueryAnnotationServiceImpl implements UserService {

    @Autowired
    private UserQueryAnnotationRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user.getId(), user.getUserName(), user.getPassword(), user.getAge());
    }

    @Override
    public void edit(User user) {
        userRepository.save(user.getId(), user.getUserName(), user.getPassword(), user.getAge());
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


