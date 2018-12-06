package com.jarxi.sdjpa.repository;

import com.jarxi.sdjpa.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserPagingAndSortingRepository extends PagingAndSortingRepository<User,Long> {
}
