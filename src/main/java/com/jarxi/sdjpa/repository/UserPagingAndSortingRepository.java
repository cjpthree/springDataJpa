package com.jarxi.sdjpa.repository;

import com.jarxi.sdjpa.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserPagingAndSortingRepository extends PagingAndSortingRepository<User,Long> {
}
