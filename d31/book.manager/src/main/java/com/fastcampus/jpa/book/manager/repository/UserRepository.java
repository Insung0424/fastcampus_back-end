package com.fastcampus.jpa.book.manager.repository;

import com.fastcampus.jpa.book.manager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByName(String name);
}
