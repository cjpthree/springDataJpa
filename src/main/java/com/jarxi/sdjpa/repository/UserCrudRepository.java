package com.jarxi.sdjpa.repository;

import com.jarxi.sdjpa.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User,Long> {
}
