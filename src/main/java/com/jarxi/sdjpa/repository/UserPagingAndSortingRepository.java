package com.jarxi.sdjpa.repository;

import com.jarxi.sdjpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserPagingAndSortingRepository extends PagingAndSortingRepository<User,Long> {
	Page<User> findByName(String name, Pageable pageable) throws Exception;
}
