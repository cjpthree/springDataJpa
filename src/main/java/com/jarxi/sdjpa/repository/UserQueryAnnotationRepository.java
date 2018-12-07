package com.jarxi.sdjpa.repository;

import com.jarxi.sdjpa.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserQueryAnnotationRepository extends Repository<User, Long> {
    // mysql native query
    @Query(value="select * from user", nativeQuery = true)
    List<User> findAll();

    @Query("select u from User u where u.id = ?1")
    User findById(long id);

    @Modifying
    @Query("update User u set u.age = ?2 where u.id = ?1")
    void save(long id, int age);

    @Modifying
    @Query("delete from User u where u = ?1")
    void delete(User user);

    @Modifying
    @Query("delete from User u where u.id = :id")
    void deleteById(@Param("id") long id);
}
