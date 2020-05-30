package com.jin.repository;

import com.jin.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u left join fetch u.authorities where u.username = :username")
    User findByUsername(@Param("username") String username);
}
