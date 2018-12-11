package com.jarxi.sdjpa.repository;

import com.jarxi.sdjpa.domain.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserQueryAnnotationRepository extends Repository<User, Long> {
    // mysql native query
    @Query(value="select * from user", nativeQuery = true)
    List<User> findAll();

    @Query("select u from User u where u.id = ?1")
    User findById(long id);

    @Transactional
    @Modifying
    @Query("update User u set u.userName = ?2, u.password = ?3, u.age = ?4 where u.id = ?1")
    void save(long id, String userName, String password, int age);

    @Modifying
    @Query("delete from User u where u = ?1")
    void delete(User user);

    @Modifying
    @Query("delete from User u where u.id = :id")
    void deleteById(@Param("id") long id);
}
