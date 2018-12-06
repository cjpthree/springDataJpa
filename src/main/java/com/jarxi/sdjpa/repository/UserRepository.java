package com.jarxi.sdjpa.repository;

import com.jarxi.sdjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/* default using jpa */
public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);
}