package com.jarxi.sdjpa.service.userserviceimpl;

import com.jarxi.sdjpa.entity.User;
import com.jarxi.sdjpa.repository.UserPagingAndSortingRepository;
import com.jarxi.sdjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class UserPagingAndSortingServiceImpl implements UserService {

    @Autowired
    private UserPagingAndSortingRepository userRepository;

    @Override
    public List<User> getUserList() {
        return (List<User>) userRepository.findAll(new Sort(Sort.Direction.DESC, "id"));
    }

    @ModelAttribute("users")
    public Page<User> users(@PageableDefault(size = 5) Pageable pageable) {
        return userRepository.findAll(pageable);
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


