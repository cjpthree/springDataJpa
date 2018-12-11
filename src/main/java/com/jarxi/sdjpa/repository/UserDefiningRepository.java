package com.jarxi.sdjpa.repository;

import com.jarxi.sdjpa.domain.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserDefiningRepository extends Repository<User, Long> {
    List<User> findByIdNot(long id);
    User findUserById(long id);
    long countByAge(int age);
    boolean existsById(long id);
    List<User> removeById(long id);
    List<User> deleteById(long id);
}
